package com.cybertek.step_definitions;


import io.cucumber.java.en.*;


public class LibraryLoginSteps {
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("-->User is on the login page");

    }

    @When("User librarian logs in successfully")
    public void user_logs_in_successfully() {
        System.out.println("-->User logs in successfully");
    }

    @Then("Dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        System.out.println("-->Dashboard should be displayed");
    }

    @When("User student logs in successfully")
    public void user_student_logs_in_successfully() {
        System.out.println("-->User student logs in successfully");
    }

    @When("User admin logs in successfully")
    public void user_admin_logs_in_successfully() {
        System.out.println("-->User admin logs in successfully");
    }

}
