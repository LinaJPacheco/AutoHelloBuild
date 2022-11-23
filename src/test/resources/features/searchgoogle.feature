#Author: Lina Pacheco
  Feature: Busqueda en google
@BusquedaGoogle

    @BusquedaExitosa
  Scenario Outline: Busqueda de frase existente en google
    Given que Lina quiere realizar una busqueda en google
    When Lina ingrese la frase <frase>
    Then Lina debe ver los resultados de Cristiano Ronaldo y el tiempo que tardo

  Examples:
    |frase|
    |Cristiano Ronaldo       |
    @BusquedaGoogle
      @BusquedaError
    Scenario Outline: Busqueda de frase inexistente en google
        Given que Lina quiere realizar una busqueda en google
        When Lina ingrese la frase <frase>
        Then Lina debe ver el mensaje <mensaje> ingresado con el aviso que no se encontro su busqueda

        Examples:
        |frase| mensaje |
        |hvwajbualfnvbsavaiova| hvwajbualfnvbsavaiova|