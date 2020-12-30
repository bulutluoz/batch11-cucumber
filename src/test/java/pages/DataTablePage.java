package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(id="DTE_Field_first_name")
    public WebElement isimKutusu;

    @FindBy(id="DTE_Field_last_name")
    public WebElement lastNameKutusu;

    @FindBy(id="DTE_Field_position")
    public WebElement positionKutusu;

    @FindBy(id="DTE_Field_office")
    public WebElement ofisKutusu;

    @FindBy(id="DTE_Field_extn")
    public WebElement extentionKutusu;

    @FindBy(id="DTE_Field_start_date")
    public WebElement dateKutusu;

    @FindBy(id="DTE_Field_salary")
    public WebElement salaryKutusu;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement ilkAramaSonucu;

}
