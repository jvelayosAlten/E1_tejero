package com.alten;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class loginSteps {

    private Response response;
    private String url;

    @Given("^I call servicioWebReporting with <user> and <password>$")
    public void iCallServicioWebReportingWithUserAndPassword(String user, String password) {
        url = "http:/"+ user + password;
        response = given().when().get(url);
        Assert.assertNotNull(response.getCookie("JSESSIONID"));
    }

    @Then("^The serverStatus return <statusCode>$")
    public void theServerStatusReturnServerStatus(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
}
