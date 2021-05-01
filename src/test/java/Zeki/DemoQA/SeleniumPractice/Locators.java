package Zeki.DemoQA.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators {

    // 1 set up driver   Webdrivermanager  driver

    // 2 locate elements   Selenium

    //3 do some action like click, send keys or else   Selenium

    //4 compare expected result with actual result TestNg  Assert.assertTrue( );



    @Test
    public void test1(){
        // 1 set up driver   Webdrivermanager  driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");// get() method waits for loading
//        driver.navigate().to("https://demoqa.com/elements");// navigate doesnt waits for loading
//        driver.navigate().back();driver.navigate().forward();driver.navigate().refresh();
//        driver.close();  //closes the active browser

        // 2 locate elements   Selenium
        // Locate by ID
        WebElement TextAreaFieldBox=driver.findElement(By.id("ta1"));

        //3 do some action like click, send keys or else   Selenium
        TextAreaFieldBox.sendKeys("Zeki Bey");

        //4 compare expected result with actual result TestNg  Assert.assertTrue( );
        String str=driver.findElement(By.cssSelector("#HTML2 h2")).getText();
        Assert.assertEquals("Text Area Field",str);

        // Locate by Class
        WebElement Date=driver.findElement(By.className("date-header"));
        //3 do some action
        String s1=Date.getText();
//        System.out.println(s1);
        //4 compare expected result
        Assert.assertEquals("Monday, May 13, 2013", s1);

        // Locate by Name
        WebElement name=driver.findElement(By.name("Cross-Column 2"));
        //3 do some action
        String s2=name.getText();
        System.out.println(s2);
        //4 compare expected result
        Assert.assertTrue(s2.contains("blogspot"));

        String s3=driver.findElement(By.name("Cross-Column 2")).getText();
        Assert.assertTrue(s3.contains("blogspot"));

        Assert.assertTrue(driver.findElement(By.name("Cross-Column 2")).getText().contains("blogspot"));

//        driver.quit();   // quits all browsers



    }


}
