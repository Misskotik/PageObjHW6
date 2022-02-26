package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpack;

    @FindBy(xpath = ".//div[@id='shopping_cart_container']/a")
    private WebElement container;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove;


    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirt;

    @FindBy(id = "checkout")
    private WebElement checkout ;

    @FindBy(id = "first-name")
    private WebElement name ;

    @FindBy(id = "last-name")
    private WebElement lastname ;

    @FindBy(id = "postal-code")
    private WebElement postalcode ;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finish;

    @FindBy (id="logout_sidebar_link")
    private WebElement logout;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public void addToCart () {
        this.backpack.click();
    }

    public void clickCart () {
        this.container.click();
    }

//    public void removeFromCart () {
//        this.remove.click ();
//    }

//    public void addMoreItems () {
//        this.bikeLight.click();
//        this.tShirt.click ();
//    }

//    public void fillTheForm () {
//        this.name.sendKeys("Alex");
//        this.lastname.sendKeys("Davon");
//        this.postalcode.sendKeys("190000");
//    }
//    public void clickContinueShopping () {
//        this.continueShopping.click ();
//    }

//    public void clickCheckout () {
//        this.checkout.click ();
//    }

//    public void clickFinish () {
//        this.finish.click ();
//    }
//    public void clickContinue () {
//        this.continueButton.click ();
    }





