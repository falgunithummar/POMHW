package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();


    @BeforeMethod
    public void SetUp() {
        driverManager.openBrowser();
    }


    @AfterMethod
    public void close(ITestResult result) {
        if (!result.isSuccess()) {
            takeSnapshot(result.getName());

        }
        driver.quit();

    }


}
