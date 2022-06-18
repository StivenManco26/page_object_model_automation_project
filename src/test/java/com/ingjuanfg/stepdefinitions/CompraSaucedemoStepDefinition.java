package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.pages.ProductsPage;
import com.ingjuanfg.pages.YourCartPage;
import com.ingjuanfg.pages.CheckoutPage;
import com.ingjuanfg.pages.OverviewPage;
import com.ingjuanfg.pages.CompletePage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class CompraSaucedemoStepDefinition {

    @Page
    private LoginPage loginPage;
    @Page
    private ProductsPage productsPage;
    @Page
    private YourCartPage yourCartPage;
    @Page
    private CheckoutPage checkoutPage;
    @Page
    private OverviewPage overviewPage;
    @Page
    private CompletePage completePage;


    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginPage.open();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
        productsPage.validarLogin();
    }

    @Dado("que el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        productsPage.adicionarAlCarrito();
    }

    @Cuando("se dirige al carrito de compras para iniciar el checkout")
    public void seDirigeAlCarritoDeComprasParaIniciarElCheckout() {
        productsPage.irAlCarrito();
        yourCartPage.darClickEnCheckout();
    }

    @Cuando("ingresa sus datos para finalizar la compra")
    public void ingresaSusDatosParaFinalizarLaCompra() {
        checkoutPage.escribirNombre("Stiven");
        checkoutPage.escribirApellido("Manco");
        checkoutPage.escribirCodigoPostal("03100");
        checkoutPage.darClickEnContinuar();
        overviewPage.darClickEnFinalizar();
    }

    @Entonces("el usuario debería ver el mensaje de gracias por su orden")
    public void elUsuarioDeberíaVerElMensajeDeGraciasPorSuOrden() {
        completePage.validarFinalizacionDeLaOrden();
    }
}
