package com.utest.stepdefinitions;

import com.utest.tasks.Login;
import com.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than user wants to register in Utest$")
    public void thanUserWantsToRegisterInUtest() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^he looks for the registration form$")
    public void heLooksForTheRegistrationForm() {

    }

    @Then("^fill out the form$")
    public void fillOutTheForm() {

    }
}
