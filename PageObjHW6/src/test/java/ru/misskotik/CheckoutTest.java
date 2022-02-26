package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CheckoutTest extends AbstractTest {

    @Test
    void startCheckoutTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new CheckoutPage (getWebDriver()).addMoreItems();
//        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("3"));
        new MainPage(getWebDriver()).clickCart();
        new CheckoutPage(getWebDriver()).clickCheckout();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='header_container']/div[2]/span")).getText().equals("CHECKOUT: YOUR INFORMATION"));

    }
}
