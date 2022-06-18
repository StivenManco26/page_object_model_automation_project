package com.ingjuanfg.steps;

import com.ingjuanfg.pages.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductsStep {
    @Page
    private ProductsPage productsPage;

    @Step
    public void agregarProductoAlCarrito(String producto){
        productsPage.adicionarAlCarrito(producto);
    }
    @Step
    public void validarLoginCorrecto(){
        productsPage.validarLogin();
    }
    @Step
    public void irHaciaElCarrito(){
        productsPage.irAlCarrito();
    }
}
