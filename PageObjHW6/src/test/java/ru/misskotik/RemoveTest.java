package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RemoveTest extends AbstractTest {
    @Test
    void removeFromCartTest () throws InterruptedException {

        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));
        new CartPage(getWebDriver()).removeFromCart();
        Assertions.assertFalse(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));

    }
}
