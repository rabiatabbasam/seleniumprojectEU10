package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //TC#1:Yahoo Title Verification
       //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //2. Go to http://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verify title
        String expectedTitle = "Yahoo | Mail, Weather, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification PASSED!");
        }else{
            System.out.println("Title is Not as expected. Verification FAILED!");
        }


        driver.close();


    }



}
