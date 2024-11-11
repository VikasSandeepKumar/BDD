package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
    @Given("User is on net banking page")
    public void user_is_on_net_banking_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Landed on netbanking Page");
    }

    @Given("User is on practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Landed on netbanking Page");
    }

    @When("User Login into application")
    public void user_login_into_application(List<String> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

//    @When("User Login into application with {string} and password {string}")
//    public void user_login_into_application_with_and_password(String username, String password) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println(username +"and passowrd is"+ password);
//    }

    @When("^User Login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username +"and passowrd is"+ password);
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }
}
