package org.example;

public class BooksPage extends Utils{



    //user is on books page verification method
    public void verifyBooksPageUrl(String errorMessage){
        assertVerificationOfUrl("https://demo.nopcommerce.com/books","wrong url");
    }
}
