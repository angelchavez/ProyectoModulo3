package com.juice.factory;

import com.juice.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  extends Variables{

    protected JavascriptExecutor javascriptExecutor;
    @FindBy(xpath = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/div/mat-card/div[2]/button/span[1]") WebElement registerLink;
    By loginLink = By.id("loginButton");
    By AccesoLink = By.xpath("//button[@type='submit']");
    By inputSubmitPago = By.xpath("//i[@class='material-icons'][contains(.,'send')]");

    public HomePage(WebDriver driver) {
        Variables.driver = driver;
        PageFactory.initElements(driver, this);
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void gotoRegister() {

        javascriptExecutor.executeScript("arguments[0].click();", registerLink);
    }

    public void gotoLogin() {
        driver.findElement(loginLink).click();
    }

    public void gotoAccesso(){
        driver.findElement(AccesoLink).click();
    }
    public void gotoAccesoPago(){
        driver.findElement(inputSubmitPago).click();
    }

}
