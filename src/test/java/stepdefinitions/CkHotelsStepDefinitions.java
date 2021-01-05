package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CkHotelsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CkHotelsStepDefinitions {
    CkHotelsPage ckHotelsPage=new CkHotelsPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        ckHotelsPage.ilkLogIn.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        ckHotelsPage.userNameTextBox.sendKeys(ConfigReader.getProperty("Ck_valid_user"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        ckHotelsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("Ck_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
       ckHotelsPage.ikinciLoginButonu.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("Ck_giris_basarili_title")));
    }


    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        ckHotelsPage.userNameTextBox.sendKeys(ConfigReader.getProperty("Ck_invalid_user"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        ckHotelsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("Ck_invalid_password"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        System.out.println(ckHotelsPage.sifreYanlisYaziElementi.getText());
        Assert.assertTrue(ckHotelsPage.sifreYanlisYaziElementi.getText().contains(ConfigReader.getProperty("Ck_giris_basarisiz_kontol_yazi")));
    }


    @And("username olarak {string} girer")
    public void usernameOlarakGirer(String arg0) {
        ckHotelsPage.userNameTextBox.sendKeys(arg0);
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String arg0) {
        ckHotelsPage.passwordTextBox.sendKeys(arg0);
    }
}
