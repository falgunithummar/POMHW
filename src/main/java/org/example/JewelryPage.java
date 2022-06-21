package org.example;

public class JewelryPage extends Utils{


    //user is on jewelry page verification method
    public void verifyJewelryPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/jewelry","wrong url");
    }
}
