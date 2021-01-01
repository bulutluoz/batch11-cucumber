Feature: US1003_amazon_search_parametreli

  @amazontek
  Scenario: TC05_parametre_kullanma
    When kullanici amazon anasayfaya gider
    And "mehmet" icin arama yapar
    Then sonucun "kemal" icerdigini test eder
    And kullanici sayfayi kapatir