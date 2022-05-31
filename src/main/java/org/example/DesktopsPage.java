package org.example;

import org.openqa.selenium.By;

public class DesktopsPage extends Utils {

  private By _clickOnBuildYourOwnComputer = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
 //********************************************************************************************************************
    public void clickOnBuildYourOwnCompyter(){
        //click on Build your own computer
        Clickonelements(_clickOnBuildYourOwnComputer);
    }
}
