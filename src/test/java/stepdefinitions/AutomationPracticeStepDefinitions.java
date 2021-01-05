package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticepage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeStepDefinitions {
    AutomationPracticepage automationPracticepage=new AutomationPracticepage();
    Actions actions=new Actions(Driver.getDriver());
    @Then("Ap sign_in tusuna tiklar")
    public void ap_sign_in_tusuna_tiklar() {
        automationPracticepage.signInButton.click();
    }

    @And("ap email kutusuna email bilgisi yazar")
    public void ap_email_kutusuna_email_bilgisi_yazar() {
        automationPracticepage.emailTextBox.sendKeys(ConfigReader.getProperty("Ap_email"));
    }

    @Then("ap create an account tusuna basar")
    public void ap_create_an_account_tusuna_basar() {
        automationPracticepage.createAnAccountButton.click();
    }

    @Then("ap cinsiyet secer")
    public void ap_cinsiyet_secer() {
        automationPracticepage.title.click();
    }

    @Then("ap isim girer")
    public void ap_isim_girer() {
        automationPracticepage.firstName.sendKeys(ConfigReader.getProperty("Ap_isim"));
    }

    @Then("ap soyisim girer")
    public void ap_soyisim_girer() {
        automationPracticepage.lastName.sendKeys(ConfigReader.getProperty("Ap_soyisim"));
    }



    @Then("ap password girer")
    public void ap_password_girer() {
        automationPracticepage.password.sendKeys(ConfigReader.getProperty("Ap_password"));
    }

    @Then("pagedown tusuna basar")
    public void pagedown_tusuna_basar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("ap gun secer")
    public void ap_gun_secer() {


    }

    @Then("ap ay secer")
    public void ap_ay_secer() {

    }

    @Then("ap yil secer")
    public void ap_yil_secer() {

    }

    @Then("ap adres isim yazar")
    public void ap_adres_isim_yazar() {

    }

    @Then("ap adres soyisim yazar")
    public void ap_adres_soyisim_yazar() {

    }

    @Then("ap sirket ismi yazar")
    public void ap_sirket_ismi_yazar() {

    }

    @Then("ap adress yazar")
    public void ap_adress_yazar() {

    }

    @Then("ap adress2 yazar")
    public void ap_adress2_yazar() {

    }

    @Then("ap adres sehir yazar")
    public void ap_adres_sehir_yazar() {

    }

    @Then("ap state dropdown secer")
    public void ap_state_dropdown_secer() {

    }

    @Then("ap adres zip kod yazar")
    public void ap_adres_zip_kod_yazar() {

    }

    @Then("ap country dropdown secer")
    public void ap_country_dropdown_secer() {

    }

    @Then("bilgi ekleme yapar")
    public void bilgi_ekleme_yapar() {

    }

    @Then("home phone yazar")
    public void home_phone_yazar() {

    }

    @Then("reference alanini temizler")
    public void reference_alanini_temizler() {

    }

    @Then("reference yazar")
    public void reference_yazar() {

    }

    @Then("ap register butonuna basar")
    public void ap_register_butonuna_basar() {

    }
}
