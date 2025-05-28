package com.example.demo;

import com.example.demo.UI.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UITest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setupBeforeClass() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(By.xpath("//[textContains('You logged into a secure area!')]"))
                .isDisplayed());
    }


}
