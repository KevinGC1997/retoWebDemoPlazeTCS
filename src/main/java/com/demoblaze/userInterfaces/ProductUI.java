package com.demoblaze.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductUI {
    public static final Target BTN_ADD_CART = Target.the("Button to add cart")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
}
