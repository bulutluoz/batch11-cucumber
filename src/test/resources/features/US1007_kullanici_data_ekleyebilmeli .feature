
Feature: US1007_kullanici_data_ekleyebilmeli
  @diger
  Scenario Outline: TC09_5_farkli kisi_ile_farkli_kombinasyonlari_calismali

    When kullanici "datatable_url" anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
    And "1" saniye bekler
    And Last name girer "<lastname>"
    And Position girer "<position>"
    And Office girer "<office>"
    And Extention girer "<extention>"
    And Start date girer "<date>"
    And Salary girer "<salary>"
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici sayfayi kapatir
    Examples:
      | firstname | lastname | position | office | extention | date | salary |
      |mehmet     |bulut     |teacher  |ankara  |---        |2020-12-10|1000|
      |yasin      |kaya      |manager  |ankara  |--         |2020-10-15|10000|
      |cevat      |fehmi     |tester   |istanbul|Dr         |2020-05-15|12500000|
      |adnan      |calis     |QA lead  |berlin  |Master     |2020-03-16|-25000  |
      |selin      |gul       |Manuel tester|munih|--        |2020-12-12 |1256125|


