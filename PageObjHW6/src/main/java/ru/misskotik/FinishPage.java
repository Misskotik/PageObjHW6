package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends  AbstractPage {

    @FindBy(id = "finish")
    private WebElement finish;


    public FinishPage(WebDriver driver) {
        super(driver);
    }

        public void clickFinish () {
        this.finish.click ();
    }

}
