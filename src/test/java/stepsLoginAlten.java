import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;


public class stepsLoginAlten {
    @Steps
    serenitySteps se = new serenitySteps();


    @Given("^I call servicioWebReporting with (.*) and (.*)$")
    public void iCallServicioWebReportingWithUserAndPassword(String user, String password) {
        se.iCallWebpage(user, password);
    }


    @Then("^The serverStatus return (.*)$")
    public void theServerStatusReturnStatusCode() {
    }
}
