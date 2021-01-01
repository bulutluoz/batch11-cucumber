package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;

public class DataTableStepDefinitions {
    DataTablePage dataTablePage=new DataTablePage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablePage.newButonu.click();
    }

    @Then("first name girer {string}")
    public void first_name_girer(String string) {
        dataTablePage.isimKutusu.sendKeys(string);
    }

    @Then("Last name girer {string}")
    public void last_name_girer(String string) {
        dataTablePage.lastNameKutusu.sendKeys(string);
    }

    @Then("Position girer {string}")
    public void postion_girer(String string) {
        dataTablePage.positionKutusu.sendKeys(string);
    }

    @Then("Office girer {string}")
    public void office_girer(String string) {
        dataTablePage.ofisKutusu.sendKeys(string);
    }

    @Then("Extention girer {string}")
    public void extention_girer(String string) {
        dataTablePage.extentionKutusu.sendKeys(string);
    }

    @Then("Start date girer {string}")
    public void start_date_girer(String string) {
        dataTablePage.dateKutusu.sendKeys(string);
    }

    @Then("Salary girer {string}")
    public void salary_girer(String string) {
        dataTablePage.salaryKutusu.sendKeys(string);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablePage.createButonu.click();
    }



    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String arg0) {
        dataTablePage.searchBox.sendKeys(arg0);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String arg0) {
        Assert.assertTrue(dataTablePage.ilkAramaSonucu.getText().contains(arg0));
    }

    @And("{string} saniye bekler")
    public void saniyeBekler(String arg0) throws InterruptedException {
        int sure=Integer.parseInt(arg0);
        Thread.sleep(sure*1000);
    }
}
