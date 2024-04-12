package com.demoblaze.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectProductInteractions implements Interaction {

    Target element;
    int indexList;

    public SelectProductInteractions(Target element, int indexList) {
        this.element = element;
        this.indexList = indexList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listButtonProducts = element.resolveAllFor(actor);

        listButtonProducts.get(indexList).click();

    }
    public static SelectProductInteractions onTheSite(Target element, int indexList) {
        return instrumented(SelectProductInteractions.class, element, indexList);
    }
}
