package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{


    //locator for click on desktop
    private By _clickOnDesktop = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");


//**********************************************************************************************************************

    public void clickOnDesktop()
    {
        //click on desktop
        Clickonelements(_clickOnDesktop);
    }

}
