Feature: US1013_Demoqa_Wait
  Scenario: TC20_kullanici_alertin_yazisini_test_edebilmeli
    When kullanici "demoqa_url" anasayfaya gider
    Then alert yazisina tiklar
    And 2. Click Me butonuna tiklar
    And Allert'in gorunur olmasini bekler
    Then Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test eder
    And OK butonuna basip Allert'i kapatir

  Scenario:  TC21_kullanici_butonun_enabled_oldugunu_test_edebilmeli
    When kullanici "demoqa2_url" anasayfaya gider
    And “Will enable 5 seconds” butonunun enable olmasini bekler
    Then “Will enable 5 seconds” butonunun enable oldugunu test eder
