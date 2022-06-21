package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewReleasePage extends Utils {


    //locator for assert verification url
    // private By _assertVerificationOfUrl =

    //locator for assert verification for get text
    private By _assertVerificationForGetText = By.xpath("//div[@class='page-title']/h1");

    //locator for titles send key
    private By _titlesSendKeys = By.xpath("//input[@id='AddNewComment_CommentTitle']");

    //locator comment send keys
    private By _commentSendKeys = By.xpath("//textarea[@id='AddNewComment_CommentText']");

    //locator for new release button
    private By _newReleaseButton = By.xpath("//button[contains(text(),'New comment')]");
//**********************************************************************************************************************


    //assert verification method for url
    public void assertVerificationOfUrl(String errorMessage) {
        assertVerificationOfUrl("https://demo.nopcommerce.com/nopcommerce-new-release", "wrong url");
    }

    //assert verification for get text
    public void assertVerificationForGetText() {
        assertExpectedEqualsActual("nopCommerce new release!", _assertVerificationForGetText, "You are not on new release page");
    }

    //leave your comment title box send keys
    public void titlesSendKeys() {
        texttype(_titlesSendKeys, "Hello");
    }

    //leave your comment box send keys
    public void commentSendKeys() {
        texttype(_commentSendKeys, "World!");
    }

    //click on new release button homepage
    public void newReleaseButton() {
        Clickonelements(_newReleaseButton);
    }

    //Assert verification for comment added successfully
    public void assertCommentAddedSuccessFully() {
        assertEquals("News comment is successfully added.", By.xpath("//div[contains(text(),'News comment is successfully added.')]"), "comment not added");
    }

    //check comment if it is last one in the list
    public void checkYourCommentIsLastInTheList() {
        String title = "Hello";
        List<WebElement> comments = driver.findElements(By.xpath("//div[@class='comment-title']"));
        List<String> listOfComments = new ArrayList<>();
        for (WebElement e : comments) {
            listOfComments.add(e.getText());
        }
        Assert.assertTrue(listOfComments.contains(title));
        String lastComment = listOfComments.get(listOfComments.size() - 1);
        System.out.println(lastComment);
        assertEquals(lastComment, By.xpath("//strong[contains(text(),'Hello')]"), "comment is not in order");

    }


}
