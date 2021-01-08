package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//li[@id='item-1'])[2]")
    public WebElement allerts;

    @FindBy(id="timerAlertButton")
    public WebElement besSaniyeSonra;

    @FindBy(id="enableAfter")
    public WebElement enableAfter5Second;
}
