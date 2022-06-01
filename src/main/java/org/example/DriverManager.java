package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager extends Utils {

    String browserName = "edge";


    public void openBrowser() {

        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
            //Chrome Browser
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
            //Firefox Browser
            driver = new FirefoxDriver();
            //EdgeBrowser
        }else if (browserName.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Browser name is wrong:"+ browserName);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    public void closeBrowser() {
        driver.quit();
    }





}
