package com.alten;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class loginSteps {

    Response response;
    String url;



    @Given("^I call servicioWebReporting with <user> and <password>$")
    public void iCallServicioWebReportingWithUserAndPassword() {

    }

    @Then("^The serverStatus return <statusCode>$")
    public void theServerStatusReturnStatusCode() {
    }
}