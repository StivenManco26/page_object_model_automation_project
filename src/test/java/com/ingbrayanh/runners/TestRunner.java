package com.ingbrayanh.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/test.feature",
        glue = "com.ingbrayanh.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class TestRunner {
}
