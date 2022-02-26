package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends AbstractPage {
    @FindBy(id = "first-name")
    private WebElement name;

    @FindBy(id = "last-name")
    private WebElement lastname;

    @FindBy(id = "postal-code")
    private WebElement postalcode;
    @FindBy(id = "continue")
    private WebElement continueButton;


    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void fillTheForm() {
        this.name.sendKeys("Alex");
        this.lastname.sendKeys("Davon");
        this.postalcode.sendKeys("190000");
    }

    public void clickContinue() {
        this.continueButton.click();
    }
}
