package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FormTest extends AbstractTest {
    @Test
    void checkoutFormTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new CheckoutPage (getWebDriver()).clickCheckout();
        new FormPage (getWebDriver()).fillTheForm();
        new FormPage(getWebDriver()).clickContinue();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='header_container']/div[2]/span")).getText().equals("CHECKOUT: OVERVIEW"));

 }
}
