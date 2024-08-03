package stepDefinitions;

import config.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static clients.swaperClient.checkUserBalance;
import static clients.swaperClient.loginToPage;

public class SwaperSteps {




    @Given("I authorize to profile")
    public void login() {

        Response response = loginToPage();

        Constants.TOKEN = response.getHeader("_csrf");
        Constants.JsessionId = response.getSessionId();


    }

    @Then("I check that users balance is zero")
    public void checkBalance() {

        checkUserBalance();

    }


}
