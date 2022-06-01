package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage extends Utils{

    //locator for click on email a friend
    private By _clickOnEmailAFriend = By.xpath("//button[normalize-space()='Email a friend']");

    //locator for select GB
    private By _selectGB = By.xpath("//input[@id='product_attribute_3_6']");

    //locator for select vistaHome
    private By _selectVistaHome = By.xpath("//input[@id='product_attribute_4_8']");

    //locator for selectMsOffice
    private By _selectMSOffice = By.xpath("//input[@id='product_attribute_5_10']");

    //locator for select software Acrobat reader
    private By _selectAcrobatReader = By.xpath("//input[@id='product_attribute_5_11']");

    //locator for select Total commander
    private By _selectCommander = By.xpath("//input[@id='product_attribute_5_12']");

    //locator for click on add to cart button
    private By _clickOnAddToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");





//**********************************************************************************************************************

    public void clickOnEmailAFriend()
    {
        //click on email a friend
        Clickonelements(_clickOnEmailAFriend);
    }

    public void clickOnProcessor()
    {
        //click on processor and select 2.2Ghz
        driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
        Select processor = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_1']")));
        processor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void clickOnRam()
    {
        //click on Ram and select 2gb
        driver.findElement(By.xpath("//label[contains(text(),'RAM')]"));
        Select ram = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_2']")));
        ram.selectByVisibleText("2 GB");
    }

    public void selectGB()
    {
        //select320gb
        Clickonelements(_selectGB);
    }

    public void selectVistaHome()
    {
        //select vistahome from OS
        Clickonelements(_selectVistaHome);
    }

    public void selectMSOffice()
    {
        //select software microsoftoffice
        Clickonelements(_selectMSOffice);
    }

    public void selectAcrobatReader()
    {
        //select software Acrobat reader
        Clickonelements(_selectAcrobatReader);
    }

    public void selectTotalCommander()
    {
        //select Total commander
        Clickonelements(_selectCommander);
    }

    public void clickOnAddToCartButton()
    {
        //click on add to cart button
        Clickonelements(_clickOnAddToCartButton);
    }

    public void verifyProductIsInTheBasket()
    {
        //to verify the product is in the basket
        Gettextfrom(By.xpath("//a[contains(text(),'shopping cart')]"));
       // driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).click();
    }
}
