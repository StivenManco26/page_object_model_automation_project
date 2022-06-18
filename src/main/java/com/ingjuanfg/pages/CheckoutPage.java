package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageObject {
    WebDriver driver;
    By inputNombre = By.id("first-name");
    By inputApellido = By.id("last-name");
    By inputCodigoPostal = By.id("postal-code");
    By buttonContinue = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void escribirNombre(String nombre){
        driver.findElement(inputNombre).sendKeys(nombre);
    }
    public void escribirApellido(String apellido){
        driver.findElement(inputApellido).sendKeys(apellido);
    }
    public void escribirCodigoPostal(String codigoPostal){
        driver.findElement(inputCodigoPostal).sendKeys(codigoPostal);
    }
    public void darClickEnContinuar(){
        driver.findElement(buttonContinue).click();
    }
}
