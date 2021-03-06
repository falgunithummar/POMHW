package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {


    public static void Clickonelements(By by) {
        driver.findElement(by).click();
    }

    public static void texttype(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void selectByValue(By by,String value){
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue(value);
    }

    public void selectTextByValue(By by,String value){
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByVisibleText(value);
    }

    public static String Gettextfrom(By by) {
        return driver.findElement(by).getText();
    }

  //  public static void selectDropdownValue(By BY){
  //      Select select = new Select(driver.findElement(BY));
  //      select.selectByVisibleText(By.id());
  //  }


    public static void driverWaitsUntilURL(int time, String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(url)));
    }

    public static String randomDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formatter.format(date);
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(1000 * time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //**************************************[---WAIT METHODS---]**************************************************************
  //  List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));

 //       for(WebElement e : productTitles)
  //      {
  //      System.out.println(e.getText());
  //  }





    //alert method get message and accept
    public static void alertMethodForGetText() {
        //switch to Alert
        Alert alert = driver.switchTo().alert();
        //capturing Alert Message
        String alertMessage = driver.switchTo().alert().getText();

        System.out.println(alertMessage);

        alert.getText();
        alert.accept();
    }

    //method for to click ok button for Alert
    public static void alertMethodForAccept() {
        //switching to alert
        Alert alert = driver.switchTo().alert();

        //accepting alert message/pressing ok
        String alertMessage = driver.switchTo().alert().getText();

        System.out.println(alertMessage);
        alert.accept();
    }

    //method for assert equals URL
    public static void assertVerificationOfUrl(String url, String errorMessage) {
        String expectedMessage = url;
        String actualMessage = driver.getCurrentUrl();
        Assert.assertEquals(expectedMessage, actualMessage, errorMessage);
    }

    //Assert method
    public static void assertExpectedEqualsActual(String expected, By by, String errorMessage) {
        String expectedResult = expected;
        String actualResult = driver.findElement(by).getText();
        Assert.assertEquals(expectedResult, actualResult, errorMessage);
    }

    public static void driverWaitUntilElementToBeClickable(By by, int time) {
        WebDriverWait wait01 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait01.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void driverWaitUntilElementContainersUrlFraction(By by, int time, String FractionUrl) {
        WebDriverWait wait02 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait02.until(ExpectedConditions.urlContains("FractionUrl"));
    }

    public static void driverWaitUntilElementLocated(By by, int time) {
        WebDriverWait wait03 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait03.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static void driverWaitUntilContainersUrl(int time, String url) {
        WebDriverWait wait04 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait04.until(ExpectedConditions.urlContains(url));
    }

    public static void driverWaitUntilElementsTitleContains(By by, int time, String TitleContains) {
        WebDriverWait wait05 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait05.until(ExpectedConditions.titleContains(TitleContains));
    }

    public static void driverWaitUntilPresenceOfElement(By by, int time) {
        WebDriverWait wait06 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait06.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static void driverWaitUntilInvisibilityOfWebElement(int time, WebElement element) {
        WebDriverWait wait07 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait07.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void driverWaitUntilAtributeToBe(int time, By by, String atribute, String text) {
        WebDriverWait wait08 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait08.until(ExpectedConditions.attributeContains(by, atribute, text));
    }

    public static void driverWaitUntilAlertPresent(int time) {
        WebDriverWait wait09 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait09.until(ExpectedConditions.alertIsPresent());
    }

    public static void driverWaitUntilAttributeToBeNotEmpty(int time, WebElement element, String attribute) {
        WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait10.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
    }

    //  Explicit Wait for the clickable element
    public static void driverElementToBeClickable(int time, By by) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait1.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public static void assertEquals(String expectedMessage, By by, String errorMessage) {
        String expectedmessage = "expectedMessage";
        String actualMessage = driver.findElement(by).getText();
        Assert.assertEquals(actualMessage, expectedMessage, "errorMessage");
    }

    //******************************************************************************************************************

    //parameterised method for url
    public static void verifyCurrentUrl(String url){
        driver.getCurrentUrl().equals(url);
    }



    public static void takeSnapshot(String a) {

        //Convert web driver object to take screenshot

        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        // call getScreenshot as method to create image file

        File Scrshots = scrShot.getScreenshotAs(OutputType.FILE);

        // copy file at destination
        try {
            FileUtils.copyFile(Scrshots, new File("Screenshots" + a + randomDate() + ".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
