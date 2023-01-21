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
    public void scroll_task4_5_test(){
        //1- Open a Chrome Browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

     //Locate the element
       // WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//div[contains(text(),\"Powered by\")]"));

        //3- Scroll down to "Powered by Cydeo"
        //Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //4- Scroll using Actions class "moveTo(element)"method

        BrowserUtils.sleep(2);
        actions.moveToElement(cydeoLink).perform();

        //Assert.assertTrue(poweredByCydeo.isDisplayed());
        //TC#5: Scroll practice 2

        BrowserUtils.sleep(1);
        //2.Scroll backup to "Home" link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Driver.closeDriver();

    }
@Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }





}


