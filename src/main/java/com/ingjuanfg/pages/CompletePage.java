package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CompletePage extends PageObject {

    WebDriver driver;
    By labelThankYou = By.xpath("//h2[@class='complete-header']");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validarFinalizacionDeLaOrden(){
        driver.findElement(labelThankYou).isDisplayed();
        assertThat(driver.findElement(labelThankYou).getText(), is("THANK YOU FOR YOUR ORDER"));
    }
}
