package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.WebtablePage;
import utilities.Driver;

import java.util.List;

public class WebTableStepDefinitions {
    WebtablePage webtablePage=new WebtablePage();

    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        for (WebElement w: webtablePage.sirketlerListesiWE
             ) {
            System.out.println(w.getText());
        }
    }


    @And("{string}'in listede oldugunu test eder")
    public void inListedeOldugunuTestEder(String sirket) {

        int flag=0;
        for (WebElement w: webtablePage.sirketlerListesiWE
        ) {
            if (w.getText().equals(sirket)){
                flag=1;
            }
        }

        Assert.assertTrue(flag==1);

    }


    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String sirket) {
        int sirketSatirNo=12;
        int flag=0;

        for (int i=0; i<webtablePage.sirketlerListesiWE.size();i++){

            if (webtablePage.sirketlerListesiWE.get(i).getText().equals(sirket)){
                sirketSatirNo=i+1;
                flag=1;
            }
        }

        if (flag ==1){
            //tbody//tr[15]//td[3]

            String arananPrevCloseXpath="//tbody//tr[" + sirketSatirNo + "]//td[3]";
            String arananPrevClose= Driver.getDriver().findElement(By.xpath(arananPrevCloseXpath)).getText();
            System.out.println("aradiginiz " + sirket + " sirketinin Prev.Close degeri : " + arananPrevClose);

        } else {
            System.out.println("aradiginiz sirket tabloda yok");

        }


    }

    @Then("satir sayisi {string}, sutun sayisi {string} olan elementi yazdirir")
    public void satirSayisiSutunSayisiOlanElementiYazdirir(String satir, String sutun) {

        //tbody//tr[5]//td[3]

        String arananXpath="//tbody//tr["+satir+"]//td["+sutun+"]";
        WebElement arananElement=Driver.getDriver().findElement(By.xpath(arananXpath));
        System.out.println(satir + ". satir "+ sutun + ".sutundaki yazi : " + arananElement.getText());
    }

    @Then("basligi {string} olan sutundaki tum bilgileri yazdirir")
    public void basligiOlanSutundakiTumBilgileriYazdirir(String baslik) {
        int baslikIndex=-1;
        for (int i=0;i<webtablePage.basliklarListesi.size();i++){
            if (webtablePage.basliklarListesi.get(i).getText().equals(baslik)){
                baslikIndex=i+1;
            }
        }
        
        if (baslikIndex>0){
            String sutunXpath="//tbody//tr//td["+baslikIndex+"]";
            List<WebElement> istenenSutunListesi=Driver.getDriver().findElements(By.xpath(sutunXpath));
            for (WebElement w:istenenSutunListesi
                 ) {
                System.out.println(w.getText());
            }
            
            
        }else System.out.println("istediginiz baslik bulunamadi");;

    }
}
