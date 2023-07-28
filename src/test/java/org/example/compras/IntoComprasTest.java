package org.example.compras;

import org.example.login.Login;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class IntoComprasTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void intoAllPrueba() {
        driver = Login.login();
        driver.findElement(By.id("popup_ok")).click();
        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(17) > .go:nth-child(1) > a")).click();

        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(18) a")).click();

        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(19) a")).click();
    }

    @Test
    public void intoComprasPrueba() {
        driver = Login.login();
        driver.findElement(By.id("popup_ok")).click();
        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(17) > .go:nth-child(1) > a")).click();

        String expectedTitle = "Compras";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void intoProveedoresPrueba() {
        driver = Login.login();
        driver.findElement(By.id("popup_ok")).click();
        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(18) a")).click();

        String expectedTitle = "Proveedores";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void intoDevolucionesPrueba() {
        driver = Login.login();
        driver.findElement(By.id("popup_ok")).click();
        driver.findElement(By.cssSelector(".openSidebar")).click();
        driver.findElement(By.linkText("Compras")).click();
        driver.findElement(By.cssSelector(".mod-3:nth-child(19) a")).click();

        String expectedTitle = "Devoluciones";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
