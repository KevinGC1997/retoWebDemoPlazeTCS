package com.demoblaze.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexUI {

    public static final Target BTN_PRODUCTS = Target.the("Button to productos")
            .locatedBy("//a[@class='hrefch']");
    public static final Target BTN_CART = Target.the("button to cart")
            .locatedBy("//a[@id='cartur']");

}
