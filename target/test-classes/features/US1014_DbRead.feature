@db
Feature: US1014_DbRead
  Scenario: TC_21 kullanici veri okur

    Given kullanici CK_Hotels veritabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur
  @dbread1
  Scenario:  TC_22 kullanici DBUtils ile veri okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundaki "Email" verilerini alir
    And kullanici DBUtils ile "Email" sutunundaki verileri okur