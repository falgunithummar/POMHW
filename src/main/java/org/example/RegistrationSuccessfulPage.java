package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfulPage extends Utils{

    public void verifyUserRegisteredSuccessfully(){

        //Verify
        String expectedMessage = "Your registration completed";
        String actualMessage=driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedMessage,actualMessage,"registration is not successful");


    }




}
