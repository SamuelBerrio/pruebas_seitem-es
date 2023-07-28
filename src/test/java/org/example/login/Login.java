package org.example.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class Login {
    @Test
    public static WebDriver login() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://estandar.loc/");
        driver.manage().window().setSize(new Dimension(1550, 830));
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("login")).sendKeys("superadmin");
        driver.findElement(By.cssSelector("p:nth-child(3) > input")).click();
        return driver;
    }
}
