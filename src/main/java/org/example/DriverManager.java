package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager extends Utils {
    LoadProp loadPage = new LoadProp();
    public final String USERNAME = loadPage.getProperty("bsUsername");
    public final String AUTOMATE_KEY = loadPage.getProperty("bsAccessKey");
    public final String BrowserstackURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    DesiredCapabilities caps = new DesiredCapabilities();
    //boolean cloud =false;
    //cloud will choose browserstack if true
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    

    // String browserName = "chrome";
    String browserName = System.getProperty("browser");


    public void openBrowser() {
        //making decision cloud true or false
        if (cloud) {
            // applying loop condition for different browsers
            System.out.println("running in cloud");
            if (browserName.equalsIgnoreCase("chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            }
            if (browserName.equalsIgnoreCase("firefox")) {
                System.out.println("your test cases are running in firefox");

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");
            }
            if (browserName.equalsIgnoreCase("edge")) {
                System.out.println("your test cases are running in edge");

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");
            } else {

                System.out.println("wrong browser name or connection issue with browser");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserstackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("test cases running in local machine");


            if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
                //Chrome Browser
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
                //Firefox Browser
                driver = new FirefoxDriver();
                //EdgeBrowser
            } else if (browserName.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("Browser name is wrong:" + browserName);
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }


    public void closeBrowser() {

        // driver.quit();
    }


}