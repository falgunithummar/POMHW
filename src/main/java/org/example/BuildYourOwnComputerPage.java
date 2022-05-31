package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage extends Utils{
    //locator for click on email a friend
    private By _clickOnEmailAFriend = By.xpath("//button[normalize-space()='Email a friend']");

//**********************************************************************************************************************

    public void clickOnEmailAFriend(){
        //click on email a friend
        Clickonelements(_clickOnEmailAFriend);


    }
    public void enterFriendsDetails(){
        //enter friend's email
        texttype(By.xpath("//input[@id='FriendEmail']"), "abcd@gmail.com");
    }

    public void clickOnSendEmailButton(){
        //click on send email button
        Clickonelements(By.xpath("//button[contains(text(),'Send email')]"));
    }

    public void clickOnProcessor(){
        //click on processor and select 2.2Ghz
        driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
        Select processor = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_1']")));
        processor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");

    }
    public void clickOnRam(){
        //click on Ram and select 2gb
        driver.findElement(By.xpath("//label[contains(text(),'RAM')]"));
        Select ram = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_2']")));
        ram.selectByVisibleText("2 GB");

    }
    public void selectGB(){
        //select320gb
        Clickonelements(By.xpath("//input[@id='product_attribute_3_6']"));

    }
    public void selectVistaHome(){
        //select vistahome from OS
        Clickonelements(By.xpath("//input[@id='product_attribute_4_8']"));

    }
    public void selectMSOffice(){
        //select software microsoftoffice
        Clickonelements(By.xpath("//input[@id='product_attribute_5_10']"));
    }
    public void selectAcrobatReader(){

        //select software Acrobat reader
        Clickonelements(By.xpath("//input[@id='product_attribute_5_11']"));

    }
    public void selectTotalCommander(){
        //select Total commander
        Clickonelements(By.xpath("//input[@id='product_attribute_5_12']"));

    }
    public void clickOnAddToCartButton(){
        //click on add to cart button
        Clickonelements(By.xpath("//button[@id='add-to-cart-button-1']"));
    }
    public void verifyProductIsInTheBasket(){
        //to verify the product is in the basket
        driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
    }
}
