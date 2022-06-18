package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends PageObject {

    WebDriver driver;
    By buttonCheckout = By.id("checkout");

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void darClickEnCheckout(){
        driver.findElement(buttonCheckout).click();
    }

}
