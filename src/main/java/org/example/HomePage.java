package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

    //locator for registration button
    private By _registerButton = By.className("ico-register");

    //locator forselect currency form dollar to euro
    private By _selectCurrency = By.id("customerCurrency");
    // locator for homepage logo

    private By _homepagelogo = By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]");

    //locator for clickonComputer
    private By _clickOnComputer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    //locator for click on good radio button
    private By _clickOnGoodRadioButton = By.xpath("//input[@id='pollanswers-2']");

    //locator for click on vote button
    private By _clickOnVoteButton = By.xpath("//button[@id='vote-poll-1']");

    //Fb locator
    private By _FBnopCommerce = By.xpath("//a[contains(text(),'Facebook')]");

    //locator for clicking on details button
    private By _clickOnDetailsButton = By.xpath("//a[contains(text(),'nopCommerce new release!')]/following::div[2]");

    //locator for user is on home page
    private By _userIsOnHomePage = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    //locator for search product in search box
    private By _productSearch = By.xpath("//input[@id='small-searchterms']");

    //locator for click on search button
    private By _clickOnSearchButton = By.xpath(" //button[contains(text(),'Search')]");
    //******************************************************************************************************************
    // public void userIsOnHomePage(){
    //   assertExpectedEqualsActual("welcome to our store",);
    // }


    public void RegisterButtonOnHomepage() {
        //click on register button
        Clickonelements(_registerButton);
    }

    public void selectCurrency() {
        //select currency form dollar to euro
        Clickonelements(_selectCurrency);
    }

    public void selectCurrencyFromDollarToEuro() {
        //select currency form dollar to euro
        Select currency = new Select(driver.findElement(By.id("customerCurrency")));
        currency.selectByVisibleText("Euro");
    }

    public void verifySelectedCurrencyIsEuro() {
        //   Assert.assertTrue(expectedCurrency.contains("€"));
        String expectedCurrency = "€1032.00";
        String actualCurrency = driver.findElement(By.xpath("//span[contains(text(),'€1032.00')]")).getText();
        Assert.assertEquals(actualCurrency, expectedCurrency, "€ sign not in front of the price");
    }

    public void clickOnHomePageLogo() {
        //click on hopepage logo
        Clickonelements(_homepagelogo);
    }

    public void clickOnComputer() {
        //click on computer
        Clickonelements(_clickOnComputer);
    }

    public void clickOnGoodRadioButton() {
        //click on Good Radio vote Button
        Clickonelements(_clickOnGoodRadioButton);
    }

    public void clickOnVoteButton() {
        //click on vote button
        Clickonelements(_clickOnVoteButton);
    }

    public void getProductList() {
        List<WebElement> productList = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
        // List<String>actualProductTitles = new ArreyList<>();
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }




    //verify user is on home page
    public void userIsOnHomePage()
    {
        assertEquals("Welcome to our store", _userIsOnHomePage , "user is Not on Homepage");
    }

    //assert verification for alert message
    public void verificationForAlertTextAndAccept()
    {
        alertMethodForGetText();
    }

    //click on Facebook from nopCommerce page
    public void FBnopCommerce()
    {
        Clickonelements(_FBnopCommerce);
    }

    //click on nopCommerce new release button from homepage
    public void clickOnNewReleaseDetailsButton()
    {
        Clickonelements(_clickOnDetailsButton);
    }
    //search the product in search box
    public void typeInSearchBox(String product)
    {
        texttype(_productSearch,product);
    }
    //click on search button
    public void clickOnSearchButton()
    {
     Clickonelements(_clickOnSearchButton);
    }


}