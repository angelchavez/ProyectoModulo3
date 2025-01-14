package com.juice.steps;

import com.juice.utils.Variables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends Variables {

    @Given("EL usuario esta en la pagina de inicio {string}")
    public void El_usuario_esta_en_la_pagina_de_inicio(String url) {
        driver.get(url);

    }
    @When("El usuario completa la informacion de registro {string} {string} {string} {string} {string}")
    public void El_usuario_completa_la_informacion_de_registro(String email, String password, String repassword, String securityQuest, String aswer) throws  InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       registerPage.RegistroFormulario(email,password,repassword,securityQuest,aswer);
    }
    @When("hago clic en el botón Register")
    public void hago_clic_en_el_botón() throws InterruptedException{

        Thread.sleep(1000);
        homePage.gotoRegister();

    }
    @Then("El usuario deberia tener su cuenta creada")
    public void El_usuario_deberia_tener_su_cuenta_creada() {
        // Write code here that turns the phrase above into concrete actions

    }

}
