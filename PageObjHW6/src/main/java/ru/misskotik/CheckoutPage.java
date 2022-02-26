package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends AbstractPage {
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirt;

    @FindBy(id = "checkout")
    private WebElement checkout ;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public void addMoreItems () {
        this.tShirt.click ();
    }
    public void clickCheckout () {
        this.checkout.click ();
    }
}
