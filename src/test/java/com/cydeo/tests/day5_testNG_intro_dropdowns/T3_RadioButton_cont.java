package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {
        //1- Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3- Click to "Hockey" radio Button.
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        //Locate name = 'sport' radio buttons and store them in a List of Web Element

       // List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result "hockey"
       clickAndVerifyRadioButton(driver,"sport","hockey");

       clickAndVerifyRadioButton(driver,"sport","Football");

       clickAndVerifyRadioButton(driver,"color","yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute,String idValue) {
        List<WebElement> radioButtons = driver.findElements(By.name("sport"));
        for (WebElement each : radioButtons) {

            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {

                each.click();
                System.out.println(eachId + " is selected: " + each.isSelected());
                break;
            }

        }


    }








}
