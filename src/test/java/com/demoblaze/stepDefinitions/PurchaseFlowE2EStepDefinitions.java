package com.demoblaze.stepDefinitions;

import com.demoblaze.questions.SuccessfulPurchaseQuestion;
import com.demoblaze.tasks.PurchaseFlowE2ETask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import static com.demoblaze.stepDefinitions.ParameterTypeDef.user;
import static com.demoblaze.userInterfaces.CartUI.BTN_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseFlowE2EStepDefinitions {


    @Given("that user access successfully to the (.*)$")
    public void thatUserAccessSuccessfullyToThe(String website) {
        user.attemptsTo(Open.url(website));
    }
    @When("the user adds two products to the cart")
    public void theUserAddsTwoProductsToTheCart() {
        user.attemptsTo(
                PurchaseFlowE2ETask.onTheSite()
        );
    }
    @Then("the user validate completion of the purchase with the (.*)$")
    public void theUserValidateCompletionOfThePurchaseWithTheYouSelectedOk(String message) {
        user.should(
                seeThat(
                        "validate purchase successful", SuccessfulPurchaseQuestion.validate(),
                        Matchers.containsString(message))
                );
        user.attemptsTo(Click.on(BTN_OK));
    }
}
