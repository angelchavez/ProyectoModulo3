package com.juice.steps;

import com.juice.utils.Variables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends Variables {
    //DIRECCION
    @Given("El usuario navega a la página {string}")
    public void el_usuario_navega_a_la_página(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        checkoutPage.LoginForm("juanperez@gmail.com","eljugador90");
        homePage.gotoAccesso();
        checkoutPage.Account();
    }
    @When("Hace clic en el botón Add New Address")
    public void hace_clic_en_el_botón() {
        checkoutPage.BotonAddNewAddress();
    }
    @When("Rellena el formulario  {string} {string} {string} {string} {string} {string} {string}")
    public void rellena_el_formulario(String Country, String Name, String Mobile, String Zip, String Address, String City, String State) throws Exception{
       checkoutPage.AddNewAddress( Country,  Name,  Mobile, Zip,  Address,  City, State);
    }
    @When("Hace clic en el botón Submit")
    public void hace_clic_en_el_botón_submit() throws Exception {
       checkoutPage.ButtonSubmit();
    }
    @Then("La nueva dirección {string} aparece en la lista de direcciones.")
    public void la_nueva_dirección_aparece_en_la_lista_de_direcciones(String string) {

    }
    //METODOS DE PAGO
    @Given("El usuario ingresa a la pagina web {string}")
    public void el_usuario_ingresa_a_la_pagina_web(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
    }
    @When("Hace clic en el botón Add New card")
    public void hace_clic_en_el_botón_add_new_card() throws InterruptedException {

        checkoutPage.AddNewCARD();
    }
    @When("Rellena el formulario  {string} {string} {string} {string}")
    public void rellena_el_formulario(String Name, String CardNumber, String ExpiryMonth, String ExpirYear) throws InterruptedException{

        checkoutPage.FormAddNewCard(Name,CardNumber, ExpiryMonth, ExpirYear);
    }
    @When("Hace clic en el botonSubmit")
    public void hace_clic_en_el_boton_submit() throws InterruptedException{
        Thread.sleep(1000);
        homePage.gotoAccesoPago();
    }
    @Then("El nuevo metodo de Pago {string} aparece en la lista de metodo de pago.")
    public void el_nuevo_metodo_de_pago_aparece_en_la_lista_de_metodo_de_pago(String string) {

    }
    //HISTORIA DE USUARIO DE CESTA
    @Given("que el usuario ha iniciado sesión con las credenciales {string} y {string}")
    public void que_el_usuario_ha_iniciado_sesión_con_las_credenciales_y(String usuario, String contraseña)  {
       checkoutPage.UsuarioIniciaSesion(usuario,contraseña);

    }
    @Given("que el usuario está en la página principal de la tienda")
    public void que_el_usuario_está_en_la_página_principal_de_la_tienda() {
        checkoutPage.usuarioEnPaginaPrincipal();

    }
    @When("el usuario busca {string} en la barra de búsqueda")
    public void el_usuario_busca_en_la_barra_de_búsqueda(String producto) {

        checkoutPage.usuarioBuscaProducto(producto);
    }
    /*
    @When("selecciona el producto {string}")
    public void selecciona_el_producto(String producto) {

        checkoutPage.seleccionaProducto(producto);

    }*/
    @When("lo agrega a la cesta")
    public void lo_agrega_a_la_cesta() {

        checkoutPage.agregaProductoCesta();
    }
    @When("el producto {string} debería estar en la cesta")
    public void el_producto_debería_estar_en_la_cesta(String producto) {

       checkoutPage.verificarProductoEnCesta(producto);

    }
    @When("luego da clic en chekout")
    public void luego_da_clic_en_chekout() {
        checkoutPage.seleccionPedidoChec();
    }
        @When("El usuario selecciona la segunda dirección")
    public void el_usuario_selecciona_la_segunda_dirección() throws InterruptedException {
        checkoutPage.addSegundaDireccion();

    }
    @When("El usuario selecciona el primer método de pago disponible")
    public void el_usuario_selecciona_el_primer_método_de_pago_disponible() {
         checkoutPage.addprimerMetodopago();
    }
    @When("El usuario procede a completar el pedido")
    public void el_usuario_procede_a_completar_el_pedido() {
         checkoutPage.addCreditCard();
    }
    @Then("El sistema confirma que el Pedido fue completado exitosamente")
    public void el_sistema_confirma_que_el_pedido_fue_completado_exitosamente() {
        checkoutPage.titleOrdenPago();
    }
    //PEDIDO2
    @Given("El usuario accede a la URL {string}")
    public void el_usuario_accede_a_la_url(String url) {
       driver.get(url);
    }
    @When("El usuario incie sesion con las credenciales {string} y {string}")
    public void el_usuario_incie_sesion_con_las_credenciales_y(String usuario, String contra) {

        checkoutPage.UsuarioIniciaSesion1(usuario,contra);

    }
    @When("El usuario navega a la página de búsqueda en {string}")
    public void el_usuario_navega_a_la_página_de_búsqueda_en(String string) {
        checkoutPage.usuarioEnPaginaPrincipal();
    }
    @When("El usuario selecciona aleatoriamente producto del catalogo y los agrega a la cesta")
    public void el_usuario_selecciona_aleatoriamente_producto_del_catalogo_y_los_agrega_a_la_cesta() throws InterruptedException {

        checkoutPage.seleccionaAleatorioProductos();
    }
    @When("El usuario selecciona la segunda dirección de envío")
    public void el_usuario_selecciona_la_segunda_dirección_de_envío() throws InterruptedException {

        checkoutPage.DireccionAgregado();
        checkoutPage.seleccionarContinue();
    }
    @When("El usuario elige el primer método de pago disponible")
    public void el_usuario_elige_el_primer_método_de_pago_disponible() throws InterruptedException {
        checkoutPage.OptionDelivery();
        checkoutPage.MyPayment();
    }
    @Then("El sistema muestra una confirmación del pedido completado")
    public void el_sistema_muestra_una_confirmación_del_pedido_completado() {
          checkoutPage.titleOrdenPago();
    }
}
