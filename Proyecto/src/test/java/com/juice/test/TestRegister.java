package com.juice.test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.juice.steps", "com.juice.utils"},
        plugin = {"pretty", "summary",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = false,
        publish = true,
        dryRun = false,
        tags = "@feature01"
)
public class TestRegister extends AbstractTestNGCucumberTests {
}
