package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{

    //locator for select Gender
    private By _selectGender = By.xpath("//input[@id='gender-female']");

    //locator for enter first name
    private By _enterFirstName = By.xpath("//input[@id='FirstName']");

    //locator for enter last name
    private By _enterLastName = By.id("LastName");

    //locator for enter email address
    private By _enterEmailAddress = By.id("Email");

    //locator for enter password
    private By _enterPassword = By.id("Password");

    //locator for confirm password
    private By _confirmPassword = By.id("ConfirmPassword");

    //locator for click on register button
    private By _clickonregisterButton = By.id("register-button");






//**********************************************************************************************************************

    public void veryfyUserIsOnRegistrationPage()
    {
    String actualRegistrationUrl=driver.getCurrentUrl();
    Assert.assertTrue(actualRegistrationUrl.contains("register"),"Your registration completed");

    //verify user is on correct registration page
        driverWaitUntilContainersUrl(20, "https://demo.nopcommerce.com/register?returnUrl=%2F");
    }


    public void userEnterRegistrationDetails(){

        //select gender
        Clickonelements(_selectGender);

        //Enter First name
        texttype(_enterFirstName, "Automation");

        //enter last name
        texttype(_enterLastName, "LastNameTest");

        //enter birth Day month and year
        Select birthday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        birthday.selectByVisibleText("3");

        Select birthmonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        birthmonth.selectByVisibleText("January");

        Select birthyear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        birthyear.selectByVisibleText("2015");

        //enter email address
        texttype(_enterEmailAddress,"fhhht1" + randomDate() + "@yahoo.com");

        //enter password
        texttype(_enterPassword, "ABC123");

        //confirm password
        texttype(_confirmPassword, "ABC123");

    }
    public void clickOnRegisterButton(){
        Clickonelements(_clickonregisterButton);
    }

}
