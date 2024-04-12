package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoblaze.userInterfaces.CartUI.TXT_PURCHASE_SUCCESSFUL;

public class SuccessfulPurchaseQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return TXT_PURCHASE_SUCCESSFUL.resolveFor(actor).getText();
    }

    public static Question<String> validate(){
        return new SuccessfulPurchaseQuestion();
    }
}
