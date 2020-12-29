Feature: US1003_amazon_search_parametreli


  Scenario: TC05_parametre_kullanma
    When kullanici amazon anasayfaya gider
    And "mehmet" icin arama yapar
    Then sonucun "yasin" icerdigini test eder
    And kullanici sayfayi kapatir