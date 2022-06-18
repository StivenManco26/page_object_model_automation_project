package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProductsPage extends PageObject {
    WebDriver driver;
    By labelProducts = By.xpath("//span[@class='title']");
    By buttonAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By buttonShoppingCar = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void validarLogin(){
        driver.findElement(labelProducts).isDisplayed();
        assertThat(driver.findElement(labelProducts).getText(), is("PRODUCTS"));
    }

    public void adicionarAlCarrito(){
        driver.findElement(buttonAddToCart).click();
    }

    public void irAlCarrito(){
        driver.findElement(buttonShoppingCar).click();
    }
}
