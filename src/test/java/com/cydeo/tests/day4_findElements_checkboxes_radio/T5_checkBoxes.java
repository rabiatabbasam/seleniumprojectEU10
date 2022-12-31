package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");
        //

        //We have to locate checkboxes
     WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
     WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2- Confirm checkbox #1 is Not selected by default
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        //3- Confirm checkbox #2 is selected by default
        System.out.println("checkbox2.isSelected(), expecting  true =  " + checkbox2.isSelected());

        //4- CLick checkbox #1 to select it.
       Thread.sleep(2000);
        checkbox1.click();


        //4- CLick checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();

        //5-Confirm checkbox#1 is SELECTED
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

        //5-Confirm checkbox#2 is  NOT SELECTED
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

    }
}
