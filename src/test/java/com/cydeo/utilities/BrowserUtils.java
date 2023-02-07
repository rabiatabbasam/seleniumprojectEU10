package com.cydeo.utilities;
  /*
   in this class only general utility method that are not related to some specific page.
    */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
    This method will accept int (int seconds) and execute Thread.sleep
    for given duration
     */

    public  static void sleep(int second){
        second *=1000;

        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }

/*
This method accepts 3 arguments
Arg1: webdriver
Arg 2: expectedUrl : for verify if the url contains given String.
-if condition matches, will break loop.
arg 3: expectedTitle to be compared against actualTitle
 */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL:" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
        //5. Assert:Title contains "Etsy"
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

/*
This method accepts a String "expectedTitle"and Asserts if it is true
 */
public static void verifyTitle(WebDriver driver,String expectedTitle){

    Assert.assertEquals(driver.getTitle(), expectedTitle);
}

/*
creating a utility method for ExplicitWait, so we don't have to repeat the lines
 */
public static void waitForInvisibilityOf(WebElement webElement){
    Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    wait.until(ExpectedConditions.invisibilityOf(webElement));

}

}
