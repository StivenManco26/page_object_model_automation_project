package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProductsPage extends PageObject {
    @FindBy(xpath="//span[@class='title']")
    WebElementFacade labelProducts;
    @FindBy(id="shopping_cart_container")
    WebElementFacade buttonShoppingCar;
    @FindBy(xpath="//div[contains(.,'Sauce Labs Backpack') and @class='inventory_item_label']/following-sibling::div//button")
    WebElementFacade productoAgregar;


    public void validarLogin(){
        assertThat("el texto del titulo es vacio", labelProducts.getText(), is("PRODUCTS"));
    }

    public void adicionarAlCarrito(String producto){
        productoAgregar.click();
    }

    public void irAlCarrito(){
        buttonShoppingCar.click();
    }
}
