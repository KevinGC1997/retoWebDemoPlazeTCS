package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoblaze.userInterfaces.IndexUI.BTN_PRODUCTS;
import static com.demoblaze.userInterfaces.ProductUI.BTN_ADD_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsToCartInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectProductInteractions.onTheSite(BTN_PRODUCTS, 0),
                WaitUntil.the(BTN_ADD_CART, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ADD_CART),
                GoToPreviousPageInteraction.onTheSite(),
                GoToPreviousPageInteraction.onTheSite(),
                WaitUntil.the(BTN_PRODUCTS, isVisible()).forNoMoreThan(30).seconds(),
                SelectProductInteractions.onTheSite(BTN_PRODUCTS, 1),
                WaitUntil.the(BTN_ADD_CART, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ADD_CART),
                GoToPreviousPageInteraction.onTheSite(),
                GoToPreviousPageInteraction.onTheSite()
        );
    }
    public static AddProductsToCartInteraction onTheSite() {
        return instrumented(AddProductsToCartInteraction.class);
    }
}
