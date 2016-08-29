package com.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

/**
 * Created by mjbarger on 8/25/16.
 */
public class SampleSteps {
    @Given("^sample feature file is ready$")
    public void givenStatment(){
        System.out.println("Given statement executed successfully");
    }

    @When("^I run the feature file$")
    public void whenStatement(){
        System.out.println("When statement execueted successfully");
    }

    @Then("^run should be successful$")
    public void thenStatment(){
        System.out.println("Then statement executed successfully");
    }
}
