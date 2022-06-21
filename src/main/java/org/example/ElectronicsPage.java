package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {

    //locator user is on Electronics page
    private By _userIsOnElectronicsPage = By.xpath(" //h1[contains(text(),'Electronics')]");



    //method for assert equals URL
    public void verifyElectronicsPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/electronics","wrong url");
    }

    public void userIsOnElectronicsPage(){
        Clickonelements(_userIsOnElectronicsPage);
    }


}
