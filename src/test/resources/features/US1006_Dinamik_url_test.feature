
@diger
Feature: US1006_Dinamik_url_test

  Scenario Outline: TC08_her_url'e_gitmeli
    When kullanici "<istenenUrl>" anasayfaya gider
    Then "<istenenUrl>" de oldugunu test eder
    And kullanici sayfayi kapatir

    Examples:
      | istenenUrl |
      |amazon_url  |
      |bestbuy_url |
      |walmart_url |



