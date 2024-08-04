package clients;

import config.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class SwaperClient {



    public static Response loginToPage() {

        String requestBody = String.format("{ \"name\": \"%s\", \"password\": \"%s\" }", Constants.name, Constants.pass);

        return
                given()
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                        .when()
                        .post(Constants.baseURL + "/login")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

            }


    public static Response checkUserBalance(float expectedBalance, String dateFrom, String dateTo) {

        String requestBodyForAccount = String.format("{ \"bookingDateFrom\": \"%s\", \"bookingDateTo\": \"%s\" }", dateFrom, dateTo);


        return
                given()
                        .sessionId("JSESSIONID", Constants.JsessionId)
                        .header("Content-Type", "application/json")
                        .header("x-xsrf-token", Constants.TOKEN )
                        .body(requestBodyForAccount)
                        .when()
                        .post(Constants.baseURL + "/profile/account-entries")
                        .then()
                        .statusCode(200)
                        .assertThat().body("openingBalance", equalTo(expectedBalance))
                        .extract()
                        .response();




            }

}


