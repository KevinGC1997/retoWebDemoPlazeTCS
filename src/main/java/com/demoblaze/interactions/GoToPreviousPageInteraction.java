package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToPreviousPageInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().navigate().back();
    }
    public static GoToPreviousPageInteraction onTheSite() {
        return instrumented(GoToPreviousPageInteraction.class);
    }
}
