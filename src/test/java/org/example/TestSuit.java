package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuit extends BaseTest {

    //objects made to bring property from different classes
    HomePage homePage = new HomePage();
    
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfulPage registrationSuccessfulPage = new RegistrationSuccessfulPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

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
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

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
        homePage.clickOnHomePageLogo();

        //click on Good Radio vote Button
        homePage.clickOnGoodRadioButton();

        //click on vote button
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
        homePage.clickOnHomePageLogo();

        //click on computer
        homePage.clickOnComputer();

        //click on desktop
        computersPage.clickOnDesktop();

        //click on Build your own computer
        desktopsPage.clickOnBuildYourOwnComputer();

        //click on email a friend
        buildYourOwnComputerPage.clickOnEmailAFriend();

        //enter friend's email
        emailAFriendPage.enterFriendsDetails();

        //click on send email button
        emailAFriendPage.clickOnSendEmailButton();

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
        desktopsPage.clickOnBuildYourOwnComputer();

        //click on processor and select 2.2Ghz
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

        String expectedMessage="The product has been added to your shopping cart";
        String actualMessage=driver.findElement(By.xpath("//p[@class='content']")).getText();
      Assert.assertEquals(actualMessage,expectedMessage,"The product has not been added to cart");



    }
}