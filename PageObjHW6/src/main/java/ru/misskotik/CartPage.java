package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove;
    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void removeFromCart () {
        this.remove.click ();
    }

    public void clickContinueShopping () {
        this.continueShopping.click ();
    }
}
