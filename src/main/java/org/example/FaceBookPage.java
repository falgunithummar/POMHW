package org.example;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils {


    public void openFBnopCommerceChildWindow()
    {

        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);


            }

        }

    }

    //method for accepting cookies
    public void acceptFBCookies() {
        alertMethodForAccept();
    }

    //Assert verification for user is on FB nop commerce page
    public void assertVerificationOfUrl()
    {
        assertVerificationOfUrl("https://www.facebook.com/nopCommerce", "url not matching");
    }


}
