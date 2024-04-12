package com.demoblaze.tasks;

import com.demoblaze.interactions.AddProductsToCartInteraction;
import com.demoblaze.interactions.FillFormInteraction;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class PurchaseFlowE2ETask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    AddProductsToCartInteraction.onTheSite(),
                    FillFormInteraction.onTheSite()
            );
    }
    public static PurchaseFlowE2ETask onTheSite(){
        return Instrumented.instanceOf(PurchaseFlowE2ETask.class).withProperties();
    }
}
