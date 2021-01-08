package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

public class DemoqaStepdefinitions {

    DemoqaPage demoqaPage=new DemoqaPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    @Then("alert yazisina tiklar")
    public void alert_yazisina_tiklar() {
        demoqaPage.allerts.click();
    }

    @Then("2. Click Me butonuna tiklar")
    public void click_me_butonuna_tiklar() {

        demoqaPage.besSaniyeSonra.click();
    }

    @Then("Allert'in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Allert uzerindeki yazinin “This alert appeared after {int} seconds” oldugunu test eder")
    public void allert_uzerindeki_yazinin_this_alert_appeared_after_seconds_oldugunu_test_eder(Integer int1) {

        String expectedYazi="This alert appeared after 5 seconds";
        String actualYazi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedYazi,actualYazi);
    }

    @Then("OK butonuna basip Allert'i kapatir")
    public void ok_butonuna_basip_allert_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("“Will enable 5 seconds” butonunun enable olmasini bekler")
    public void willEnableSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.elementToBeClickable(demoqaPage.enableAfter5Second));
    }

    @Then("“Will enable 5 seconds” butonunun enable oldugunu test eder")
    public void willEnableSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demoqaPage.enableAfter5Second.isEnabled());
    }
}
