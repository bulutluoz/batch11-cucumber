package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticepage {
   public AutomationPracticepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@rel='nofollow'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement emailTextBox;

    @FindBy(xpath = "//button[@class='btn btn-default button button-medium exclusive']")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement title;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement signUpCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement receiveCheckBox;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement company;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement address;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement secondAdress;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement zipCode;

    @FindBy(xpath = "//select[@id='id_country']")
    public WebElement country;

    @FindBy(xpath = "//textarea[@name='other']")
    public WebElement additionalInformation;

    @FindBy(xpath = "(//input[@type='text'])[12]")
    public WebElement homePhone;

    @FindBy(xpath = "(//input[@type='text'])[13]")
    public WebElement mobilePhone;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registerButton;

}
