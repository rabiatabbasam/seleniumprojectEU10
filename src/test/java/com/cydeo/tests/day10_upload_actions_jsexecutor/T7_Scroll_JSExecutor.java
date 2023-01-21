package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test(){
       //1- Open a Chrome browser
        //2- Go to:https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //find the last link on the page
        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a[text()='CYDEO']"));
        WebElement lastLink = links.get(links.size()-1);

        //5- Use below provided JS method only
        //3- Scroll down to "Cydeo"link
        JavascriptExecutor js =  (JavascriptExecutor) Driver.getDriver();
       js.executeScript("arguments[0].scrollIntoView(true);",lastLink);

        BrowserUtils.sleep(2);
        //4- Scroll up to "Home"link
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(true);",homeLink);




    }





}
