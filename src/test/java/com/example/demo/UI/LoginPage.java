package com.example.demo.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By userName;
    By password;
    By submitBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.userName = By.id("username");
        this.password = By.id("password");
        this.submitBtn = By.xpath("//[text()='submit']");
    }


    public void login(String userName, String password) {
        driver.findElement(this.userName).sendKeys(userName);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(this.submitBtn).click();
    }

}
