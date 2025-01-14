package com.juice.utils;

import com.juice.factory.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

public class Hooks  extends Variables{
    @Before
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.TIME_OUT));

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);


    }

    @After
    public void tearDown() {
        if (driver != null) {
           driver.quit();
        }
    }

}
