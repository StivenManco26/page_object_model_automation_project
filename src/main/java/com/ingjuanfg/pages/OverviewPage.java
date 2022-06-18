package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends PageObject {
    WebDriver driver;
    By buttonFinish = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void darClickEnFinalizar(){
        driver.findElement(buttonFinish).click();
    }
}
