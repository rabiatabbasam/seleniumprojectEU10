package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

//TC#1: Cydeo practice tool verification
//1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to https://pratice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //Expected: cydeo
        String expectedURL = "Cydeo";

        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }


        driver.close();

        if(driver.getTitle().equals("Practice")){

        }












    }
}
