package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPageTest extends AbstractTest {


    @Test

    void addToCartTest () throws InterruptedException {

//      getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        new MainPage (getWebDriver()).addToCart();
        Assertions.assertEquals(getWebDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        new MainPage(getWebDriver()).clickCart();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));
    }



    @Test
    void continueShoppingTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new CartPage (getWebDriver()).removeFromCart();
        new CartPage (getWebDriver()).clickContinueShopping();
        Assertions.assertEquals(getWebDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }


}
