

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class serenitySteps {

    private String url;
    Response response;
    RequestSpecification requestSpec;

    RestAssured.baseURI = "http://www.google.es";
    RequestSpecification request = RestAssured.given();


    @Step
     public void iCallWebpage(String user, String password) {
         url = "http://wr.alten.es/ServicioWebReporting/login?userName=tum&password=Alten2018";
         requestSpec.when().accept("application/x-www-form-urlencoded");
         given().header("Content-Type","application/x-www-form-urlencoded").get(url);
         Assert.assertNotNull(response.getCookie("JSESSIONID"));

    }
}
