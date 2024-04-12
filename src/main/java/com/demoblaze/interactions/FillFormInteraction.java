package com.demoblaze.interactions;

import com.demoblaze.utils.DataExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.demoblaze.userInterfaces.CartUI.*;
import static com.demoblaze.userInterfaces.CartUI.TXT_PURCHASE_SUCCESSFUL;
import static com.demoblaze.userInterfaces.IndexUI.BTN_CART;
import static com.demoblaze.utils.Constant.nameColumn;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillFormInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        DataExcel dataExcel = new DataExcel();
        try {
            actor.attemptsTo(
                    Click.on(BTN_CART),
                    WaitUntil.the(BTN_DELETE, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_PLACE_ORDER),
                    Enter.keyValues(dataExcel.dataExcel().get(0).get(nameColumn)).into(LBL_INPUT_NAME),
                    Enter.keyValues(dataExcel.dataExcel().get(1).get(nameColumn)).into(LBL_INPUT_COUNTRY),
                    Enter.keyValues(dataExcel.dataExcel().get(2).get(nameColumn)).into(LBL_INPUT_CITY),
                    Enter.keyValues(dataExcel.dataExcel().get(3).get(nameColumn)).into(LBL_INPUT_CREDIT_CART),
                    Enter.keyValues(dataExcel.dataExcel().get(4).get(nameColumn)).into(LBL_INPUT_MONTH),
                    Enter.keyValues(dataExcel.dataExcel().get(5).get(nameColumn)).into(LBL_INPUT_YEAR),
                    Click.on(BTN_PURCHASE),
                    WaitUntil.the(TXT_PURCHASE_SUCCESSFUL, isVisible()).forNoMoreThan(20).seconds()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static FillFormInteraction onTheSite() {
        return instrumented(FillFormInteraction.class);
    }
}
