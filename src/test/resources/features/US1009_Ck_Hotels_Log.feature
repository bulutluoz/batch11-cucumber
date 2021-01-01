@wip
Feature: US1009 Ck Hotels Log
  Scenario: TC11 kullanici gecersiz bilgilerle giris yapamaz
    Given kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici sayfayi kapatir
