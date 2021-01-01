@regression
Feature:
  Scenario: TC10 kullanici gecerli bilgilerle giris yapar
    Given kullanici "Ck_Hotels_Url" anasayfaya gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kullanici sayfayi kapatir



