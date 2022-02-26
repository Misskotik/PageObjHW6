package ru.misskotik;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    static WebDriver webDriver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
        @BeforeEach
    void initMainPage() {

            webDriver.manage().window().maximize();
//            webDriver.get("https://www.saucedemo.com");
            Assertions.assertDoesNotThrow(() -> getWebDriver().navigate().to("https://www.saucedemo.com/"),
                    "Page Not Found");
            Assertions.assertTrue(true);
            webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
            webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
            webDriver.findElement(By.id("login-button")).click();
            webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }


    @AfterAll
    public static void exit() {
        if (webDriver != null) webDriver.quit();
    }
    public WebDriver getWebDriver () {
        return this.webDriver;
    }




        }




