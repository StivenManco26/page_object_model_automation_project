package com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/compra_con_parametros.feature",
        glue = "com.ingjuanfg.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CompraSaucedemoRunner {
}

