package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_dropDowns {

     WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #8: Selecting value from multiple select dropdown
       // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void teardown(){
driver.close();
    }

    @Test
     public void dropdown_task8(){
          //       2. Go to https://practice.cydeo.com/dropdown
          driver.get("https://practice.cydeo.com/dropdown");

//        3. Select all the options from multiple select dropdown.
        Select multipleDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        //Stores all options
          List<WebElement> options= multipleDropDown.getOptions();

         //this will select index one by one
          for (int i = 0; 1 <options.size() ; i++) {
              multipleDropDown.selectByIndex(i);
          }
            //4. Print out all selected values.
              List<WebElement> selectedOptions = multipleDropDown.getAllSelectedOptions();

              //iterate each element of selected options
              for (WebElement each : selectedOptions) {
                  System.out.println(each.getText());
              }

             //5. Deselect all values.
              multipleDropDown.deselectAll();

          }


}









