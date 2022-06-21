package org.example;

public class DigitalDownloadsPage extends Utils{



    //user is on digital download page verification method
    public void verifyDigitalDownloadPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/digital-downloads","wrong url");
    }
}
