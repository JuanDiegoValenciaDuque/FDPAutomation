# Author: Juan Diego Valencia Duque
# encoding:utf-8

Feature: Realizar cotizacion de vehiculo

  @CPExcel
  Scenario Outline: Cotización persona natural existente, codigo fasecolda, con datos adicionales, con vehiculo en leasing y conductor habitual - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | <tipoId> | <id> | <genero> | <fecha> | <optPlaca> | <optFasecolda> | <fasecolda> | <servicio> | <zona> | <placa> | <valorAsegurado> | <marca> | <linea> | <clase> | <modelo> |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | <optAccesorios> | <valorAccesorios> | <optBlindaje> | <valorBlindaje> | <optLocatario> | <tipoIdLocatario> | <idLocatario> | <nombreLocatario> | <generoLocatario> | <fechaLocatario> | <optHabitual> | <tipoIdHabitual> | <idHabitual> | <nombreHabitual> | <generoHabitual> | <fechaHabitual> |
    And Elijo la oferta ofrecida
      | <producto> | <asistencia> |
    Then Valido guardado exitoso
    And Valido condigo entregado

    Examples:
      | tipoId | id | genero | fecha | optPlaca | optFasecolda | fasecolda | servicio | zona | placa | valorAsegurado | marca | linea | clase | modelo | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual | producto | asistencia |
    ##@externaldata@./src/test/resources/datadriven/Examples.xlsx@data