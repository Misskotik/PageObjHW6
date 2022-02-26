package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FinishTest extends AbstractTest {

    @Test
    void finishTest() throws InterruptedException {
        new MainPage(getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new CheckoutPage(getWebDriver()).clickCheckout();
        new FormPage(getWebDriver()).fillTheForm();
        new FormPage(getWebDriver()).clickContinue();
        new FinishPage(getWebDriver()).clickFinish();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath(".//div[@id='checkout_complete_container']/h2")).getText().equals("THANK YOU FOR YOUR ORDER"));

    }
}
