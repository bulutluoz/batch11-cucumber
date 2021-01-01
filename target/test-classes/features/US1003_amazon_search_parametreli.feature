Feature: US1003_amazon_search_parametreli

  @amazon
  Scenario: TC05_parametre_kullanma
    When kullanici amazon anasayfaya gider
    And "abdullah" icin arama yapar
    Then sonucun "cemal" icerdigini test eder
