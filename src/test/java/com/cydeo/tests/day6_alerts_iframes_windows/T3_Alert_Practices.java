package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Alert_Practices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        //TC #2: Confirmation alert practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

     @Test
    public void alert_test3(){
      // 3. Click to “Click for JS Prompt” button
         WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
       informationAlertButton.click();

         //4. Send “hello” text to alert
         Alert alert = driver.switchTo().alert();
         alert.sendKeys("hello");

         //5. Click to OK button from the alert
         alert.accept();

         WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

         Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

         //6. Verify “You entered:  hello” text is displayed.
         String expectedText = "You entered: hello";
         String actualText = resultText.getText();

         Assert.assertEquals(actualText, expectedText, "Actual text is not matching expected");



     }













//6. Verify “You entered:  hello” text is displayed.






}
