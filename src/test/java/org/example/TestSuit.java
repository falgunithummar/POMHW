package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfulPage registrationSuccessfulPage = new RegistrationSuccessfulPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {

        //click on register button
        homePage.RegisterButtonOnHomepage();
        //verify user on registration page
        registrationPage.veryfyUserIsOnRegistrationPage();
        //enter user details
        registrationPage.userEnterRegistrationDetails();
        //click on register button
        registrationPage.clickOnRegisterButton();
        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();

    }

    @Test
    public void userShouldBeAbleToVote() {
        //click on Good Radio vote Button
        // Clickonelements(By.xpath("//input[@id='pollanswers-2']"));
       // homePage.clickOnGoodRadioButton();

        //click on vote button
        //Clickonelements(By.xpath("//button[@id='vote-poll-1']"));
       // homePage.clickOnVoteButton();

        //verify only registered user can vote
        //driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]"));
       //  String expectedMessage = "Only registered users can vote.";
       // String actualMessage = driver.findElement(By.id("block-poll-vote-error-1")).getText();
       // Assert.assertEquals(actualMessage,expectedMessage,"voting fail");

        //click on register button
        homePage.RegisterButtonOnHomepage();

        //verify user on registration page
        registrationPage.veryfyUserIsOnRegistrationPage();

        //enter user details
        registrationPage.userEnterRegistrationDetails();

        //click on register button
        registrationPage.clickOnRegisterButton();

        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();

        //click on hopepage logobutton
        // Clickonelements(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
        homePage.clickOnHomePageLogo();

        //click on Good Radio vote Button
        // Clickonelements(By.xpath("//input[@id='pollanswers-2']"));
        homePage.clickOnGoodRadioButton();

        //click on vote button
        //Clickonelements(By.xpath("//button[@id='vote-poll-1']"));
        homePage.clickOnVoteButton();

        //verify the numbers of vote(s)
        String expectedmessage = " vote(s)...";
        String actualmessage = driver.findElement(By.xpath("//span[@class='poll-total-votes']")).getText().replaceAll("\\d+","");
        Assert.assertEquals(actualmessage, expectedmessage, "not voted");

    }

    @Test
    public void userShouldBeAbleToChangeCurrencyInEuro() {

        //click on currency bar
        homePage.selectCurrency();

        //select currency form dollar to euro
        homePage.selectCurrencyFromDollarToEuro();

        //scroll down on homepage,build your own computer to check the price
        //user should be able to see "€"in front of the price
        homePage.verifySelectedCurrencyIsEuro();

    }

    @Test
    public void userShouldBeAbleToSendEmailToAFriend() {
        //click on register button
        homePage.RegisterButtonOnHomepage();
        //verify user on registration page
        registrationPage.veryfyUserIsOnRegistrationPage();
        //enter user details
        registrationPage.userEnterRegistrationDetails();
        //click on register button
        registrationPage.clickOnRegisterButton();
        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();
        //click on hopepage logo
        // Clickonelements(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
        homePage.clickOnHomePageLogo();
        //click on computer
        homePage.clickOnComputer();
        //click on desktop
        //Clickonelements(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']"));
        computersPage.clickOnDesktop();
        //click on Build your own computer
        // Clickonelements(By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']"));
        desktopsPage.clickOnBuildYourOwnCompyter();

        //click on email a friend
        //Clickonelements(By.xpath("//button[normalize-space()='Email a friend']"));
        buildYourOwnComputerPage.clickOnEmailAFriend();
        //enter friend's email
        // texttype(By.xpath("//input[@id='FriendEmail']"), "abcd@gmail.com");
        buildYourOwnComputerPage.enterFriendsDetails();
        //click on send email button
        // Clickonelements(By.xpath("//button[contains(text(),'Send email')]"));
        buildYourOwnComputerPage.clickOnSendEmailButton();

        //check the Result
        String expected = "Your message has been sent.";
        String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(expected, actualMessage, "Message has not been sent successfully");

    }
    @Test
    public void userShouldBeAbleToAddProductInTheShoppingBasketSuccessfully() {

        //click on computers
         homePage.clickOnComputer();

        //click on desktops
        computersPage.clickOnDesktop();

        //click on build your own computer
        desktopsPage.clickOnBuildYourOwnCompyter();

        //click on processor and select 2.2Ghz
       // driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
       // Select processor = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_1']")));
       // processor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.clickOnProcessor();

        //click on Ram and select 2gb
        buildYourOwnComputerPage.clickOnRam();

        //select320gb
        buildYourOwnComputerPage.selectGB();

        //select vistahome from OS
        buildYourOwnComputerPage.selectVistaHome();

        //select software microsoftoffice
        buildYourOwnComputerPage.selectMSOffice();

        //select software Acrobat reader
        buildYourOwnComputerPage.selectAcrobatReader();

        //select Total commander
        buildYourOwnComputerPage.selectTotalCommander();;

        //click on add to cart button
        buildYourOwnComputerPage.clickOnAddToCartButton();

        //to verify the product is in the basket
        buildYourOwnComputerPage.verifyProductIsInTheBasket();

        assertEquals("Shopping cart",By.xpath("//div[@class='page-title']"),"shopping cart locator not found");
        assertEquals("Build your own computer",By.xpath("//a[@class='product-name']"),"Empty basket");

        // String expectedMessage="The product has been added to your shopping cart";
        // String actualMessage=driver.findElement(By.xpath("//p[@class='content']")).getText();
        //        Assert.assertEquals(actualMessage,expectedMessage,"Product has not been added to your cart");


}
}