package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginStep {
    @Given("I navigate to the login page of the application")
    public void iNavigateToTheLoginPageOfTheApplication() {
        System.out.println("I should see userform page");
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("Navigate to login page");
        System.out.println("Username is: " + username + " and Password is: " + password);
    }

    @And("I enter the UserName and Password")
    public void iEnterTheUserNameAndPassword(DataTable table) {
        List<List<String>> data = table.cells();

        System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));
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
