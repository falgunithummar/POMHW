package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utils {

    //locator for click on build your own computer
    private By _clickOnBuildYourOwnComputer = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");

    //locator for assert verification user is on desktops page
    private By _userIsOnDesktopsPage = By.xpath("//h1[contains(text(),'Desktops')]");

    //locator for click on sort by select box
    private By _clickOnSortBySelectionBox = By.xpath("//select[@id='products-orderby']");

    //locator to select Z TO A
    private By _selectZtoA = By.xpath("//select[@id='products-orderby']");

    //********************************************************************************************************************

    //Assert verification user is on desktops page
    public void userIsOnDesktopsPage() {
        assertEquals("Desktops", _userIsOnDesktopsPage, "user is not on desktop page");
    }

    //click on sort by search box
    public void clickOnSortBySelectBox() {
        Clickonelements(_clickOnSortBySelectionBox);
    }

    //Select product ZtoA
    public void selectZtoA() {
        Select select = new Select(driver.findElement(_selectZtoA));
        select.selectByVisibleText("Name: Z to A");
    }

    public void clickOnBuildYourOwnComputer() {
        //click on Build your own computer
        Clickonelements(_clickOnBuildYourOwnComputer);
    }

    public void productSortByZtoA(String product) {
        // String product;

        List<WebElement> productTitles = driver.findElements(By.xpath(" //div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
        List<String> descendingProductTitles = new ArrayList<String>();
        for (WebElement e : productTitles) {
            descendingProductTitles.add(e.getText().substring(0, 1));
        }
        Collections.sort(descendingProductTitles, Collections.reverseOrder());
        System.out.println(descendingProductTitles);

        List<String> actualProductTitles = new ArrayList<String>();
        for (WebElement e : productTitles) {
            actualProductTitles.add(e.getText().substring(0, 1));

            System.out.println(actualProductTitles);
            Assert.assertTrue(actualProductTitles.equals(descendingProductTitles));


        }

    }
}



