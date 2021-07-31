package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbWithDBUtils {

    @Given("kullanici DBUtils ile CK_Hotels veritabanina baglanir")
    public void kullanici_db_utils_ile_ck_hotels_veritabanina_baglanir() {

        DBUtils.getConnection();
    }

    @Given("kullanici DBUtils ile {string} tablosundaki {string} verilerini alir")
    public void kullanici_db_utils_ile_tablosundaki_verilerini_alir(String table, String field) {
        String query = "SELECT " + field + " FROM dbo." + table;
        DBUtils.executeQuery(query);
    }

    @Given("kullanici DBUtils ile {string} sutunundaki verileri okur")
    public void kullanici_db_utils_ile_sutunundaki_verileri_okur(String field) throws SQLException {
        DBUtils.getResultset().first();
        Object ilkSatirdakiObje = DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());

        }

    @Given("kullanici DBUtils ile {string} tablosundan {string} verilerini okur")
    public void kullanici_db_utils_ile_tablosundan_verilerini_okur(String tablo, String field) {
        String readQuery="SELECT "+field+" FROM dbo."+tablo;
        DBUtils.executeQuery(readQuery);
    }

    @Then("IDHotel degeri {int} olan kaydin Email bilgisinin {string} oldugunu test eder")
    public void id_hotel_degeri_olan_kaydin_email_bilgisinin_oldugunu_test_eder(Integer sira, String testDegeri) throws Exception {

        // istenen satirdaki Email verisini okuma ve yazdirma
        DBUtils.getResultset().absolute(sira);
        Object istenenSatirdakiObje=DBUtils.getResultset().getObject("Email");
        System.out.println(istenenSatirdakiObje.toString());

        // Email fieldindaki tum email'leri satir numarasi ile birlikte yazdiralim

        int satirSayisi=DBUtils.getRowCount(); // bu hazir method bize satir sayisini verir
        DBUtils.getResultset().absolute(1);
        int satirNumarasi=DBUtils.getResultset().getRow(); // bu da bize bulundugumuz satirin numarasini verir


        while(satirNumarasi<satirSayisi){
            // baslanan satirdan son satira kadar her bir satirdaki objeyi, sonrada obje uzerinden Email'i alacagim
            // ayrica bu email'in kacinci satirda oldugu gostermek icin satir sayisini da alacagim

            Object satirdakiEmailObjesi=DBUtils.getResultset().getObject("Email"); // satirdaki objeyi veriri
            satirNumarasi=DBUtils.getResultset().getRow(); // satirin numarasini verir
            System.out.println(satirNumarasi+". satirdaki email : "+satirdakiEmailObjesi.toString());
            DBUtils.getResultset().next(); // while loopun sona gitmesi icin degiskeni 1 artiriyoruz
        }

        // istenen satirdaki email degerinin istenen email oldugunu test edelim
        Assert.assertEquals(istenenSatirdakiObje.toString(),testDegeri);
    }

    @Then("IDHotel degeri {int} olan kaydin Email degerini {string} yapar")
    public void idhotelDegeriOlanKaydinEmailDegeriniYapar(int satir, String yeniEmail) {

        // IDHotel degeri 8 olan Email'i batch11@theend.com yapin
        // UPDATE dbo.tHOTEL
        // SET EMail='batch11@theend.com'
        // WHERE IDHotel=8;
        // burada dinamik olan degerleri degistirelim
        String updateQuery= "UPDATE dbo.tHOTEL SET Email='"+yeniEmail+"' WHERE IDHotel="+satir;
        DBUtils.executeQuery(updateQuery);
    }

    @Then("IDHotel degeri 11 olan kaydin Email bilgisini buisbukadar@gmail.com yapar")
    public void idhotelDegeriOlanKaydinEmailBilgisiniBuisbukadarGmailComYapar() {
        String sqlSorgu= "UPDATE dbo.tHOTEL SET Email='buisbitti@gmail.com' WHERE IDHotel=8";
        DBUtils.executeQuery(sqlSorgu);
    }

    @And("uygun degerlerle tabloya yeni kayit ekler")
    public void uygunDegerlerleTabloyaYeniKayitEkler() {
        // tHOTEL tablosuna yeni bir kayit eklemek icin yazmam gereken SQL sorgu
        // INSERT INTO tHOTEL (fieldlar) VALUES(degerler);
        // field isimleri ile tabloya data eklemek istersem
        //
        String createQuery= "INSERT INTO dbo.tHOTEL (Code,Name,Address,Phone,Email,IDGroup,CreateDate,CreateUser) " +
                "VALUES ('146','Mehmet','testAdres','12345678','Batch11Create@gmail.com',10012,'2021-01-26 22:15:45.587',4)";
        DBUtils.executeQuery(createQuery);
    }

    //bilmemiz gereken 3 obje
    // 1- connection : baglanmamamiza yardim ediyor
    //    DBUtils.getConnection();
    // 2- statement : DBUtils kullanmazsak statement objesi ile query calistiriyoruz
    //    Biz DBUtils kullandigimiz icin query calistirmak istedigimizde once bir String degiskene query'i esitliyoruz
    //   SQL de tHOTEL tablosundan Name field'indaki tum Name'leri listeleyin desem
    //   sql sorgumuz : SELECT Name FROM tHOTEL
    //   ayni islemi Jdbc ile yapmak istiyorsak once bu sorguyu String bir degiskene atiyoruz
    //   String query="SELECT Name FROM tHOTEL";
    //   Sonra DBUtils i kullanip bu query'i EXECUTE ediyoruz
    //   DBUtils.executeQuery(query);
}









