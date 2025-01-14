package com.juice.factory;

import com.juice.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Variables {
    By anuncioOwasp = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
    By anuncioMeWant = By.xpath("/html/body/div[1]/div/a");
    By inptEmail = By.id("email");
    By inpPassword = By.id("password");


    public LoginPage(WebDriver driver){
        Variables.driver = driver;
    }

    public void LoginFormulario(String username, String password){

        driver.findElement(anuncioOwasp).click();
        driver.findElement(anuncioMeWant);
        driver.findElement(inptEmail).sendKeys(username);
        driver.findElement(inpPassword).sendKeys(password);

    }
}
