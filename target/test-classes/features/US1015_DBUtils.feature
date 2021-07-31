Feature: US1015_DBUtils ile yapilan sorgular
 @dbread
  Scenario: TC_23 Kullanici tHOTEL tablosundan mail fieldini okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundan "EMail" verilerini okur
    Then IDHotel degeri 8 olan kaydin Email bilgisinin "atab@update.com" oldugunu test eder
  @dbupdate1
   Scenario: TC_24 Kullanici tHOTEL tablosundan istedigi Emaili update eder
     Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
     Then IDHotel degeri 6 olan kaydin Email degerini "goodbye@java.com" yapar

   @dbupdate
   Scenario: TC_25 Kullanici tHotel tablosunda update yapar
     Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
     Then IDHotel degeri 11 olan kaydin Email bilgisini buisbukadar@gmail.com yapar

   @dbcreate
   Scenario: TC_26 Kullanici uygun degerlerle tHOTEL tablosuna yeni kayit ekler
     Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
     And uygun degerlerle tabloya yeni kayit ekler