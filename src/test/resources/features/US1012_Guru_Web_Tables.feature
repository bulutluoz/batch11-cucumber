Feature: US1012_Guru_Web_Tables
  Scenario: TC_16_kullanici_liste_alabilmeli
    
    When kullanici "Web_Table_url" anasayfaya gider
    Then Company listesini consola yazdirir
    And "IDFC L"'in listede oldugunu test eder

  Scenario: TC_17_kullanici_sirket_Prev_Close_alabilmeli
    When kullanici "Web_Table_url" anasayfaya gider
    And "Bata India" Prev.Close degerini yazdirir

  Scenario: TC_18_kullanici_satir_sutun_degeri_ile_yazi_alabilmeli

    When kullanici "Web_Table_url" anasayfaya gider
    Then satir sayisi "5", sutun sayisi "5" olan elementi yazdirir

  Scenario:  TC_19_kullanici_sutun_basligi_ile_liste_alabilmeli
    When kullanici "Web_Table_url" anasayfaya gider
    Then basligi "Current Price (Rs)" olan sutundaki tum bilgileri yazdirir
