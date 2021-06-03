package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("I navigate to the login page of the application")
    public void iNavigateToTheLoginPageOfTheApplication() {
        System.out.println("I should see userform page");
    }

    @And("I enter the username as admin and password as admin")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {
        System.out.println("Navigate to login page");
    }

    @When("I click login button")
    public void iClickLoginButton() {
        System.out.println("I should click login button");
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }
}
