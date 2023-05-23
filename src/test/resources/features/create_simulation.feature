#Autor:Anderson
  #languege:en

Feature: Crear simulacion de un credito de libre inversion
  Como usuario, quiero poder simular un credito de libre inversion
  en la pagina de Bancolombia.

  Scenario: Simular un credito de libre inversion en la pagina de Bancolombia
    Given dado que estoy en la pagina de Bancolombia
    When navego por la pagina en busca de opciones
    And ingreso la informacion requerida para continuar
    Then se muestra una simulacion del credito de libre inversion con los resultados correspondientes