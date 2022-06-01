package org.example;

import org.openqa.selenium.By;




public class EmailAFriendPage extends Utils{

    public void enterFriendsDetails()
    {
        //enter friend's email
        texttype(By.xpath("//input[@id='FriendEmail']"), "abcd@gmail.com");
    }

    public void clickOnSendEmailButton()
    {
        //click on send email button
        Clickonelements(By.xpath("//button[contains(text(),'Send email')]"));
    }
}
