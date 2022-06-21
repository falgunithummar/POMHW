package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfulPage extends Utils{


    public void verifyUserRegisteredSuccessfully()
    {
        // assert Verification for registration completed
       // String ExpectedMessage = "Your registration completed";
      //  String actualMessage = driver.findElement(By.className("RESULT")).getText();
        assertEquals("Your registration completed",By.className("result"),"registration is not successful");
     //   Assert.assertEquals(actualMessage, actualMessage, "Registration not completed");
    }




}
