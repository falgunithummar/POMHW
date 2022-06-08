package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestSuit extends BaseTest {

    //objects made to bring property from different classes
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfulPage registrationSuccessfulPage = new RegistrationSuccessfulPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    FaceBookPage faceBookPage = new FaceBookPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    NikePage nikePage = new NikePage();

    //*****************************************************************************************************************
    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //Assert verification user is on homepage
        homePage.userIsOnHomePage();

        //click on register button
        homePage.RegisterButtonOnHomepage();

        //verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //verify user on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //enter user details
        registrationPage.userEnterRegistrationDetails();

        //click on register button
        registrationPage.clickOnRegisterButton();

        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();

    }

    //****************************************************************************************************************
    @Test
    public void userShouldBeAbleToVote() {
        //verify user is on homepage
        homePage.userIsOnHomePage();

        //click on Good Radio vote Button
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

        //verify only registered user can vote
        // assertEquals("Only registered users can vote.",By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]"),"Voting fail");

        //click on register button
        homePage.RegisterButtonOnHomepage();

        //verify user on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //enter user details
        registrationPage.userEnterRegistrationDetails();

        //click on register button
        registrationPage.clickOnRegisterButton();

        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();

        //click on homepage logoButton
        homePage.clickOnHomePageLogo();

        //click on Good Radio vote Button
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

        //verify the numbers of vote(s)
        assertEquals("vote(s)...", By.xpath("//span[@class='poll-total-votes']"), "Not voted");
    }

    //*****************************************************************************************************************
    @Test
    public void userShouldBeAbleToChangeCurrencyInEuro() {
        //verify user is on homepage
        homePage.userIsOnHomePage();

        //click on currency bar
        homePage.selectCurrency();

        //select currency form dollar to euro
        homePage.selectCurrencyFromDollarToEuro();

        //scroll down on homepage,build your own computer to check the price
        //user should be able to see "€"in front of the price
        homePage.verifySelectedCurrencyIsEuro();

    }

    //*****************************************************************************************************************
    @Test
    public void userShouldBeAbleToSendEmailToAFriend() {
        //verify user is on homepage
        homePage.userIsOnHomePage();

        //click on register button
        homePage.RegisterButtonOnHomepage();

        //verify user on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //enter user details
        registrationPage.userEnterRegistrationDetails();

        //click on register button
        registrationPage.clickOnRegisterButton();

        //Verify registration successful
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();

        //click on homepage logo
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

        //Assert verification for message sent
        assertEquals("Your message has been sent.", By.xpath("//div[@class='result']"), "Message has not been sent");
    }

    //*****************************************************************************************************************
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

        //select vistaHome from OS
        buildYourOwnComputerPage.selectVistaHome();

        //select software microsoftOffice
        buildYourOwnComputerPage.selectMSOffice();

        //select software Acrobat reader
        buildYourOwnComputerPage.selectAcrobatReader();

        //select Total commander
        buildYourOwnComputerPage.selectTotalCommander();

        //click on add to cart button
        buildYourOwnComputerPage.clickOnAddToCartButton();

        //to verify the product is in the basket
        buildYourOwnComputerPage.verifyProductIsInTheBasket();

        //Assert verification for product has been added to basket
        assertEquals("The product has been added to your shopping cart", By.xpath("//p[@class='content']"), "The product has not been added to the cart");

    }

    //*****************************************************************************************************************
    @Test
    public void userShouldBeAbleToSortList() {
        homePage.getProductList();
    }

    //*****************************************************************************************************************
    @Test
    //test cases for clicking on vote button and clicking on ok button on alert
    public void userShouldBeAbleToClickOnAlert() {
        //Assert verification for homepage
        homePage.userIsOnHomePage();

        //click on vote button
        homePage.clickOnVoteButton();

        //assert verification for the alert
        homePage.verificationForAlertTextAndAccept();

    }

    //****************************************************************************************************************
    @Test
    //test cases for cLicking on fb and going back to nopCommerce
    public void UserShouldBeAbleToNavigateToFBNopCommerce() {
        //verify user should be on homepage(Assert verification)
        homePage.userIsOnHomePage();

        //click on FB
        homePage.FBnopCommerce();

        //switching to FBPage
        faceBookPage.openFBnopCommerceChildWindow();

        //Assert verification of url
        faceBookPage.assertVerificationOfUrl();

        //closing FB page
        driver.close();

    }

    //*****************************************************************************************************************
    @Test
    //test cases for user should be able to add comment on new release
    public void userShouldBeAbleToCommentOnNopcommerceNewRelease() {
        //assert verification for homepage
        homePage.userIsOnHomePage();

        //click on New release detail Button
        homePage.clickOnNewReleaseDetailsButton();

        // Assert verification for url
        newReleasePage.assertVerificationOfUrl();

        //Assert verification for get text
        newReleasePage.assertVerificationForGetText();

        //send key for title to leave comment
        newReleasePage.titlesSendKeys();

        //send key for comment box for comment message
        newReleasePage.commentSendKeys();

        //click on new comment button
        newReleasePage.newReleaseButton();

        //Assert verification for comment successfully added message
        newReleasePage.assertCommentAddedSuccessFully();

        //Assert verification for comment you added is at last
        newReleasePage.checkYourCommentIsLastInTheList();


    }

    //*****************************************************************************************************************
    @Test
    //test cases for user should be able to search product by name
    public void userShouldBeAbleToSearchProductByName() {

        //Assert to verify user is on nopCommerce home page
        homePage.userIsOnHomePage();

        //type the product name in search box
        homePage.typeInSearchBox("Nike");

        //click on search button
        homePage.clickOnSearchButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));

        for (WebElement e : productTitles) {
            System.out.println(e.getText());
            Assert.assertTrue(e.getText().contains("Nike"));
        }
    }

    //*****************************************************************************************************************
    @Test
    //test cases for user should be able to sort product in Z to A order
    public void userShouldBeAbleToSortProductInZtoAOrder() {

        //Assert verification user is on home page
        homePage.userIsOnHomePage();

        //click on computers
        homePage.clickOnComputer();

        //Assert verification user is on computers page
        computersPage.userIsOnComputersPage();

        //click on desktops
        computersPage.clickOnDesktop();

        //Assert verification user is on desktops page
        desktopsPage.userIsOnDesktopsPage();

        //click on sort by search box
        desktopsPage.clickOnSortBySelectBox();

        //Select product ZtoA
        desktopsPage.selectZtoA();

        //assert to verify listed products are in Z to A order
        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
        List<String> descendingProductTitles = new ArrayList<String>();
        for (WebElement e : productTitles) {
            descendingProductTitles.add(e.getText());
        }
        Collections.sort(descendingProductTitles, Collections.reverseOrder());
        System.out.println(descendingProductTitles);

        List<String> actualProductTitles = new ArrayList<String>();
        for (WebElement e : productTitles) {
            actualProductTitles.add(e.getText());

            System.out.println(actualProductTitles);
            Assert.assertTrue(actualProductTitles.equals(descendingProductTitles));


        }

    }

}

