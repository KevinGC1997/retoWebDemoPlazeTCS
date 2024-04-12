package com.demoblaze.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartUI {

    public static final Target BTN_DELETE = Target.the("button to delete product")
            .locatedBy("//a[normalize-space()='Delete']");
    public static final Target BTN_PLACE_ORDER = Target.the("button to place order")
            .locatedBy("//button[normalize-space()='Place Order']");
    public static final Target LBL_INPUT_NAME = Target.the("input name in the form")
            .locatedBy("//input[@id='name']");
    public static final Target LBL_INPUT_COUNTRY = Target.the("input country in the form")
            .located(By.id("country"));
    public static final Target LBL_INPUT_CITY = Target.the("input city in the form")
            .located(By.id("city"));
    public static final Target LBL_INPUT_CREDIT_CART = Target.the("input credit cart form")
            .located(By.id("card"));
    public static final Target LBL_INPUT_MONTH = Target.the("input month in the form")
            .located(By.id("month"));
    public static final Target LBL_INPUT_YEAR = Target.the("input year in the form")
            .located(By.id("year"));
    public static final Target BTN_PURCHASE = Target.the("button to purchase")
            .locatedBy("//button[@onclick='purchaseOrder()']");
    public static final Target TXT_PURCHASE_SUCCESSFUL = Target.the("text to purchase successful")
            .locatedBy("//*[contains(text(), 'Thank you for your purchase!')]");
    public static final Target BTN_OK = Target.the("button to ok purchase successful")
            .locatedBy("//button[@class='confirm btn btn-lg btn-primary']");


}
