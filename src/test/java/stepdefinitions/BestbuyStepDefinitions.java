package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {
    @When("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string)); //amazon_url
    }  // driver.get("https://www.amazon.com")

    @Then("{string} de oldugunu test eder")
    public void deOldugunuTestEder(String istenenUrl) { //amazon_url
        // amazon_url=https://www.amazon.com/   current_url : driver.getCurrentUrl
        Assert.assertEquals(ConfigReader.getProperty(istenenUrl),Driver.getDriver().getCurrentUrl());
    }
}

