package org.example;

public class ApparelPage extends Utils{




    //user is on apparel page verification method
    public void verifyApparelPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/apparel", "wrong url");
    }
}
