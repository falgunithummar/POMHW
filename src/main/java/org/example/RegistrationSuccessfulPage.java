package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfulPage extends Utils{

    public void verifyUserRegisteredSuccessfully()
    {
        // assert Verification for registration completed
        assertEquals("Your registration completed",By.className("result"),"registration is not successful");
    }




}
