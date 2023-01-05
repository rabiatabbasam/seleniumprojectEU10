package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Alert_Practices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

       //TC #2: Confirmation alert practice
//        1. Open browser
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

@Test
    public void alert_test2(){
    //        3. Click to “Click for JS Confirm” button
    WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
informationAlertButton.click();

//        4. Click to OK button from the alert

    Alert alert = driver.switchTo().alert();
    alert.accept();


    //5. Verify “You clicked Ok” text is displayed.
 WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

    Assert.assertTrue(resultText.isDisplayed(), "result text is not displayed");

  String expectedText = "You clicked: Ok";
  String actualText = resultText.getText();

  Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected!!");

}

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }


}





