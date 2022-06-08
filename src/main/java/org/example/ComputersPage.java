package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{


    //locator for click on desktop
    private By _clickOnDesktop = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");

    //locator to verify user is on computers page
    private By _userIsOnComputersPage = By.xpath("//h1[contains(text(),'Computers')]");
//**********************************************************************************************************************

    public void clickOnDesktop()
    {
        //click on desktop
        Clickonelements(_clickOnDesktop);
    }
    public void userIsOnComputersPage(){
        //Assert verification user is on computers page
        assertEquals("Computers",_userIsOnComputersPage,"user is not on computers page");

    }

}
