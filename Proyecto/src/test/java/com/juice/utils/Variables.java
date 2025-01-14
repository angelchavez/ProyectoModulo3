package com.juice.utils;


import com.juice.factory.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Variables {

    public static WebDriver driver;

    public static int TIME_OUT = 10;

    protected static HomePage homePage;

    protected static RegisterPage registerPage;

    protected  static LoginPage loginPage;

    protected  static CheckoutPage checkoutPage;


    public boolean waitElementVisible(WebElement element , int tiempo ){
            boolean value = false;
            for (int i = 0; i < tiempo; i++) {
                try{
                    Thread.sleep(500);
                    value = element.isDisplayed();
                } catch (Exception e) {

                }
            }
            return value;
    }



}
