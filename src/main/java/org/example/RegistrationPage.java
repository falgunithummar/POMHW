package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{


  // private By_firstNameField = By.Xpath("//input[@id='FirstName']");





    public void veryfyUserIsOnRegistrationPage(){

    String actualRegistrationUrl=driver.getCurrentUrl();
    Assert.assertTrue(actualRegistrationUrl.contains("register"),"Your registration completed");


        //verify user is on correct registration page
        driverWaitUntilContainersUrl(20, "https://demo.nopcommerce.com/register?returnUrl=%2F");



    }

    public void userEnterRegistrationDetails(){

        //select gender
        Clickonelements(By.xpath("//input[@id='gender-female']"));

        //Enter First and last name
        texttype(By.xpath("//input[@id='FirstName']"), "Automation");
        texttype(By.id("LastName"), "LastNameTest");

        //enter birth Day month and year
        Select birthday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        birthday.selectByVisibleText("3");

        Select birthmonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        birthmonth.selectByVisibleText("January");

        Select birthyear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        birthyear.selectByVisibleText("2015");

        //enter email, password and confirm password
        texttype(By.id("Email"),"fhhht1" + randomDate() + "@yahoo.com");

        texttype(By.id("Password"), "ABC123");

        texttype(By.id("ConfirmPassword"), "ABC123");







    }
    public void clickOnRegisterButton(){
        Clickonelements(By.id("register-button"));

    }

}
