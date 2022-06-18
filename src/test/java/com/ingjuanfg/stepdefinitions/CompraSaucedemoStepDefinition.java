package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.pages.ProductsPage;
import com.ingjuanfg.pages.YourCartPage;
import com.ingjuanfg.pages.CheckoutPage;
import com.ingjuanfg.pages.OverviewPage;
import com.ingjuanfg.pages.CompletePage;
import com.ingjuanfg.steps.LoginStep;
import com.ingjuanfg.steps.ProductsStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

import java.util.Map;

public class CompraSaucedemoStepDefinition {

    @Page
    private YourCartPage yourCartPage;
    @Page
    private CheckoutPage checkoutPage;
    @Page
    private OverviewPage overviewPage;
    @Page
    private CompletePage completePage;

    @Steps
    LoginStep loginStep;
    @Steps
    ProductsStep productsStep;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginStep.abrirNavegador();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales(Map<String, String> credenciales) {
        loginStep.realizarAuntenticacion(credenciales);
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
        productsStep.validarLoginCorrecto();
    }

    @Dado("que el usuario agrega el producto (.*) al carrito")
    public void elUsuarioAgregaElProductoAlCarrito(String producto) {
        productsStep.agregarProductoAlCarrito(producto);
    }

    @Cuando("se dirige al carrito de compras para iniciar el checkout")
    public void seDirigeAlCarritoDeComprasParaIniciarElCheckout() {
        productsStep.irHaciaElCarrito();
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

    @Entonces("el usuario deberia ver el mensaje de gracias por su orden")
    public void elUsuarioDeberiaVerElMensajeDeGraciasPorSuOrden() {
        completePage.validarFinalizacionDeLaOrden();
    }
}
