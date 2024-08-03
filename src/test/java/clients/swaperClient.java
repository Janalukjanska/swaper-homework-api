package clients;

import config.Constants;
import io.restassured.response.Response;
import org.junit.Test;
import stepDefinitions.SwaperSteps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class swaperClient {



    public static Response loginToPage() {


        String requestBody = String.format("{ \"name\": \"%s\", \"password\": \"%s\" }", Constants.name, Constants.pass);

        return
                given()
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                        .when()
                        .post(Constants.baseURL + "/rest/public/login")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

            }


    public static Response checkUserBalance() {

        String requestBodyForAccount = String.format("{ \"bookingDateFrom\": \"%s\", \"bookingDateTo\": \"%s\" }", Constants.DateFrom, Constants.DateTo);


        return
                given()
                        .sessionId("JSESSIONID", Constants.JsessionId)
                        .header("Content-Type", "application/json")
                        .header("x-xsrf-token", Constants.TOKEN )
                        .body(requestBodyForAccount)
                        .when()
                        .post(Constants.baseURL + "/rest/public/profile/account-entries")
                        .then()
                        .statusCode(200)
                        .assertThat().body("openingBalance", equalTo(0.0F) )
                        .extract()
                        .response();




            }

}


