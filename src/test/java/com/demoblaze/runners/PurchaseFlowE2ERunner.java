package com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.demoblaze/PurchaseFlowE2E.feature",
        glue = "com.demoblaze.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PurchaseFlowE2ERunner {
}
