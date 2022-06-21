package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfulPage registrationSuccessfulPage = new RegistrationSuccessfulPage();
    ComputersPage computersPage = new ComputersPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.RegisterButtonOnHomepage();
    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.userEnterRegistrationDetails();
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.clickOnRegisterButton();
    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registrationSuccessfulPage.verifyUserRegisteredSuccessfully();
    }





//***********************************************************************************************************************
     @Given("I am on homepage")
     public void iAmOnHomepage() {
        homePage.userIsOnHomePage();
     }

    @When("I click on {string} link from top header menu")
    public void iClickOnCategory_nameLinkFromTopHeaderMenu(String category_name) {
      homePage.clickOnCategoryLink(category_name);

    }

    @Then("I should be able to successfully navigated to related {string} category page successfully")
    public void iShouldBeAbleToSuccessfullyNavigatedToRelatedCategory_urlCategoryPageSuccessfully(String category_url) {
        Utils.verifyCurrentUrl(category_url);

    }
}