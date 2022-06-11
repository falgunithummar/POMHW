package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils{

     LoadProp loadProp = new LoadProp();
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

    private By _birthdate = By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthmonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthyear = By.xpath("//select[@name='DateOfBirthYear']");





//**********************************************************************************************************************

    public void verifyUserIsOnRegistrationPage()
    {
        //verify user is on correct registration page
        driverWaitUntilContainersUrl(10, "https://demo.nopcommerce.com/register?returnUrl=%2F");
    }


    public void userEnterRegistrationDetails(){

        //select gender
        Clickonelements(_selectGender);

        //Enter First name
        texttype(_enterFirstName,loadProp.getProperty("firstName"));

        //enter last name
        texttype(_enterLastName,loadProp.getProperty("LastName"));

        //enter birthday
        selectByValue(_birthdate,loadProp.getProperty("birthday"));
      //  String birthday = loadProp.getProperty("")

        //enter birthMonth
        selectByValue(_birthmonth,loadProp.getProperty("birthmonth"));

        //enter birthyear
        selectByValue(_birthyear,loadProp.getProperty("birthyear"));

        //enter email address
       texttype(_enterEmailAddress,"fhhht1" + randomDate() + "@yahoo.com");
        String email = loadProp.getProperty("email1")+ randomDate() + loadProp.getProperty("email2");

        //enter password
        texttype(_enterPassword, "ABC123");

        //confirm password
        texttype(_confirmPassword, "ABC123");

    }
    public void clickOnRegisterButton(){
        Clickonelements(_clickonregisterButton);
    }

}
