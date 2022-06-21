package org.example;

public class GiftCardsPage extends Utils{



    //user is on gift cards page verification method
    public void verifyGiftCardPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/gift-cards","wrong url");
    }
}
