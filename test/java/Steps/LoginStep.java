package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
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
 /*       List<List<String>> data = table.cells();

       System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));*/

        //Create an ArrayList
        List<List<String>> data = table.asLists(String.class);
        String username = data.get(1).get(0);
        String password = data.get(1).get(1);

        System.out.println(username);
        System.out.println(password);
    }
/*        This method below doesn't work so it's actually useless
        List<List<User>> users = new ArrayList<>();
        users = table.asList(User.class);


    for (List<User> user: users) {
            System.out.println("In the Array the User name is: "+ users.username);
            System.out.println("In the Array the password is :"+ users.password);
        }
    }
    public static class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            this.username = userName;
            this.password = passWord;
        }
    }*/


    @When("I click login button")
    public void iClickLoginButton() {
        System.out.println("I should click login button");
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }

}
