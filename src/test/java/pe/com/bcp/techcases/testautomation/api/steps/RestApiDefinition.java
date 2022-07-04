package pe.com.bcp.techcases.testautomation.api.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.NotImplementedException;
import net.thucydides.core.annotations.Steps;
import pe.com.bcp.techcases.testautomation.api.actors.ApiClient;

import static org.assertj.core.api.Assertions.assertThat;

public class RestApiDefinition {

    @Steps
    ApiClient jhon;

    String URL;


    @Given("the URL {}")
    public void the_url_is_ok(String url) {
        assertThat(url).isNotEmpty();
        URL = url;
    }

    @When("I check the application status {}")
    public void i_check_the_application_status(String userName) {
        //throw new NotImplementedException("please implement this step");
    	jhon.readStatus(URL, userName);
    }

    @Then("the API should contain {}")
    public void the_API_should_return(String expectedMessage) {
        //hrow new NotImplementedException("please implement this step");
    	jhon.readContent(expectedMessage);
    }
}
