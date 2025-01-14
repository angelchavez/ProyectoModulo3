package com.juice.factory;

import org.openqa.selenium.NoSuchElementException;
import com.juice.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Variables {
    By anuncio = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
    By inputemail= By.xpath("(//input[@id='emailControl'])[1]");
    By inputPassword = By.id("passwordControl");
    By inputRePassword = By.id("repeatPasswordControl");
    By comboxSecurity = By.xpath("//*[@id='mat-select-0']/div/div[2]");
    By inputSecurity = By.xpath("(//span[@class='mat-option-text'][normalize-space()='Your favorite book?'])[1]");
    By inputAnswer = By.id("securityAnswerControl");
    By anuncio1 = By.xpath("/html/body/div[1]/div/a");
    By anunciodissmiss = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
    public RegisterPage(WebDriver driver)
    {
         Variables.driver = driver;
    }
    public void RegistroFormulario(String email, String pass, String repass, String securityques, String Answer) throws InterruptedException{

       // driver.findElement(anuncio).click();; // Cerrar el anuncio
        Thread.sleep(1000);
        try {
            WebElement anuncioElemento = driver.findElement(anuncio);
            if (anuncioElemento.isDisplayed()) {
                anuncioElemento.click();
                System.out.println("Anuncio cerrado correctamente.");
            }
        } catch (NoSuchElementException e) {
            // Si el anuncio no está presente, no hacer nada
            System.out.println("No se encontró el anuncio, continuando...");
        }

        try {
            // Buscar el elemento y verificar si está visible
            WebElement anuncio = driver.findElement(anunciodissmiss);
            if (anuncio.isDisplayed()) {
                // Si está visible, hacer clic para cerrarlo
                anuncio.click();
                System.out.println("Anuncio cerrado.");
            } else {
                // Si no está visible, desactivar lógica adicional
                System.out.println("El anuncio no está visible.");
            }
        } catch (Exception e) {
            // Si el elemento no se encuentra
            System.out.println("El anuncio no está presente: " + e.getMessage());
        }

        driver.findElement(inputemail).sendKeys(email);
        driver.findElement(inputPassword).sendKeys(pass);
        driver.findElement(inputRePassword).sendKeys(repass);
        Thread.sleep(1000);
        driver.findElement(comboxSecurity).click();
        driver.findElement(inputSecurity).click();
        driver.findElement(inputAnswer).sendKeys(Answer);
        driver.findElement(anuncio1).click();
    }
}
