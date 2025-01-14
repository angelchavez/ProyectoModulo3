package com.juice.steps;

import com.juice.utils.Variables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Variables {


    @Given("el usuario esta en la pagina de inicio {string}")
    public void el_visitante_esta_en_la_pagina_de_inicio(String url) {
        driver.get(url);

    }
    @When("el usuario ingresa su {string} y {string} valido")
    public void el_usuario_ingresa_su_y_valido(String username, String password) {
        loginPage.LoginFormulario(username,password);

    }
    @When("hago clic en el botón Login")
    public void hago_clic_en_el_botón_login() {
        // Write code here that turns the phrase above into concrete actions
        homePage.gotoLogin();
    }
    @Then("deberia tener acceso a su cuenta")
    public void deberia_tener_acceso_a_su_cuenta() {
        // Write code here that turns the phrase above into concrete actions

    }
}


