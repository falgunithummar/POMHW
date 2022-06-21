package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

    //locator for click on electronics
    private By _clickOnElectronics = By.xpath(" //body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    //locator for click on apparel
    private By _clickOnApparel = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");

    //locator fot click on digital downlods
    private By _clickOnDigitalDownloads = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");

    //locator for click on books
    private By _clickOnBooks = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");

    //locator for click on jewelry
    private By _clickOnJewelry = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    //locator for click on gift cards
    private By _clickOnGiftCards = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");


    //******************************************************************************************************************


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
    public void userIsOnHomePage() {
        assertEquals("Welcome to our store", _userIsOnHomePage, "user is Not on Homepage");
    }

    //assert verification for alert message
    public void verificationForAlertTextAndAccept() {
        alertMethodForGetText();
    }

    //click on Facebook from nopCommerce page
    public void FBnopCommerce() {
        Clickonelements(_FBnopCommerce);
    }

    //click on nopCommerce new release button from homepage
    public void clickOnNewReleaseDetailsButton() {
        Clickonelements(_clickOnDetailsButton);
    }

    //search the product in search box
    public void typeInSearchBox(String product) {
        texttype(_productSearch, product);
    }

    //click on search button
    public void clickOnSearchButton() {
        Clickonelements(_clickOnSearchButton);
    }

    // click on electronics method
    public void clickOnElectronics() {
        Clickonelements(_clickOnElectronics);
    }

    //click on apparel method
    public void clickOnApparel() {
        Clickonelements(_clickOnApparel);
    }

    //click on digital download method
    public void clickOnDigitalDownloads() {
        Clickonelements(_clickOnDigitalDownloads);
    }

    //click on books method
    public void clickOnBooks() {
        Clickonelements(_clickOnBooks);
    }

    //click on jewelry method
    public void clickOnJewelry() {
        Clickonelements(_clickOnJewelry);
    }

    //click on gift cards method
    public void clickOnGiftCards() {
        Clickonelements(_clickOnGiftCards);
    }
    //parameterised method for clicking on different links
    public void clickOnCategoryLink(String category_name){
        Clickonelements(By.linkText(category_name));
    }

//    public void clickOnCategoryLink(String category_name){
//        Clickonelements(By.linkText("Computers,Electronics,Apparel,Digital downloads,Books,Jewelry,Gift Cards"));}
//        category = new ArrayList<>();
//        category.add("Computers");
//        category.add("Electronics");
//        category.add("Apparel");
//        category.add("Digital downloads");
//        category.add("Books");
//        category.add("Jewelry");
//        category.add("Gift Cards");
//        clickOnHomePageLinks(category);

        // driver.findElement(By.linkText("Computers,Electronics,Apparel,Digital downloads,Books,Jewelry,Gift Cards")).click();
//    }
//    public void urlVerification(String category_url){
//        assertVerificationOfUrl("https://demo.nopcommerce.com/computers,https://demo.nopcommerce.com/electronics,
//                https://demo.nopcommerce.com/apparel,
//                https://demo.nopcommerce.com/digital-downloads,
//                https://demo.nopcommerce.com/books,
//                https://demo.nopcommerce.com/jewelry,
//                https://demo.nopcommerce.com/gift-cards" "");



}