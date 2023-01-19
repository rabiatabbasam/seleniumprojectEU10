package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Scroll_Practice {

    @Test
    public void scroll_test(){
        //1- Open a Chrome Browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

     //Locate the element
        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//div[contains(text(),\"Powered by\")]"));

        //3- Scroll down to "Powered by Cydeo"
        //4- Scroll using Actions class "moveTo(element)"method
        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        actions.moveToElement(poweredByCydeo).perform();

        //Assert.assertTrue(poweredByCydeo.isDisplayed());
        //TC#5: Scroll practice 2

        BrowserUtils.sleep(1);
        //2.Scroll backup to "Home" link using PageUP button
        actions.sendKeys(Keys.PAGE_UP).perform();


    }


}
