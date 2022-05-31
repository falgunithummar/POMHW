package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends Utils {
    //locator for registration button
     private By _registerButton = By.className("ico-register");

    //locator forselect currency form dollar to euro
    private  By _selectCurrency = By.id("customerCurrency");
     // locator for homepage logo

    private By _homepagelogo = By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]");

    //locator for clickonComputer
    private By _clickOnComputer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    //locator for click on good radio button
    private By _clickOnGoodRadioButton = By.xpath("//input[@id='pollanswers-2']");

    //locator for click on vote button
    private By _clickOnVoteButton = By.xpath("//button[@id='vote-poll-1']");
    //******************************************************************************************************************
    public void RegisterButtonOnHomepage()
    {
        //click on register button
        Clickonelements(_registerButton);
    }
    public void selectCurrency(){
    //select currency form dollar to euro
        Clickonelements(_selectCurrency);
    }
    public void selectCurrencyFromDollarToEuro(){
        //select currency form dollar to euro
        Select currency = new Select(driver.findElement(By.id("customerCurrency")));
        currency.selectByVisibleText("Euro");

    }
    public void verifySelectedCurrencyIsEuro(){
        //   Assert.assertTrue(expectedCurrency.contains("€"));
        String expectedCurrency = "€1032.00";
        String actualCurrency = driver.findElement(By.xpath("//span[contains(text(),'€1032.00')]")).getText();
        Assert.assertEquals(actualCurrency, expectedCurrency, "€ sign not in front of the price");

    }
    public void clickOnHomePageLogo(){
        //click on hopepage logo
        Clickonelements(_homepagelogo);

    }
    public void clickOnComputer(){
        //click on computer
        Clickonelements(_clickOnComputer);
    }
    public void clickOnGoodRadioButton(){
        //click on Good Radio vote Button
        Clickonelements(_clickOnGoodRadioButton);
    }
    public void clickOnVoteButton(){
        //click on vote button
        Clickonelements(_clickOnVoteButton);

    }

}