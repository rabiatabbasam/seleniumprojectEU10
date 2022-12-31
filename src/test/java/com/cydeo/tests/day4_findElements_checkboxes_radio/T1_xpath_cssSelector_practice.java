package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {
        //1- Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to:https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3-Locate all the WebElement on the page using XPATH and/or CSS
        //a."Home" link

        //Locate homeLink using cssSelector
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax#2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //Locate homeLink using cssSelector,href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

     //Locate header using cssSelector:locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

     //Locate header using xpath: and using web element text "Forgot password"
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header_ex3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        //c."E-mail" text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //Locate inputBox using Xpath contains method
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@name='email']"));

       // WebElement patternBox_ex3 = driver.findElement(By.xpath("//input[contains(@patten,'a-z')]"));

        //e. "Retrieve password" button
        WebElement retrievePasswordButton_ex1 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //button[@id='form_submit']
        //button[@class='radius']

     //f. "Powered by cydeo text
       //tagName[@attribute='value']
        WebElement poweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton_ex1.isDisplayed() = " + retrievePasswordButton_ex1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }
}
