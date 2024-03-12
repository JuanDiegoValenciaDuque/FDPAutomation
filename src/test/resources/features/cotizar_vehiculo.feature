# Author: Juan Diego Valencia Duque
# encoding:utf-8

Feature: Realizar cotizacion de vehiculo

  @CP001 @regresion.backoffice @regresion
  Scenario: Cotización persona natural existente, codigo fasecolda, con datos adicionales, con vehiculo en leasing y conductor habitual - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado

  @CP002 @regresion.backoffice @regresion
  Scenario: Cotización persona natural inexistente, codigo fasecolda con datos adicionales, con vehiculo en leasing y conductor habitual - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id        | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania | 123654897 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            | 2000000         | Si          | 2000000       | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado

  @CP003 @regresion.backoffice @regresion
  Scenario: Cotización persona juridica inexistente, codigo fasecolda y sin datos adicionales - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 98756421 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | No            |                 | No          |               | No           |                 |             |                 |                 |                | No          |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado

  @CP004 @regresion.backoffice @regresion
  Scenario: Cotización persona juridica inexistente, codigo fasecolda, con datos adicionales y vehiculo en leasing y conductor habitual - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id        | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 568742155 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            | 2000000         | Si          | 2000000       | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado

  @CP005 @regresion.backoffice @regresion
  Scenario: Cotización persona natural existente en inbroker, sin placa, sin codigo fasecolda, sin datos adicionales, sin vehiculo en leasing y sin conductor habitual - Backoffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | No            |                 | No          |               | No           |                 |             |                 |                 |                | No          |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP006 @regresion.backoffice @regresion
  Scenario: Cotización persona natural inexistente en inbroker con placa en fasecolda, con datos adicionales, con vehículo en leasing y conductor habitual - BackOffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania | 44454546 | Femenino | 10061996 | Si       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP007 @regresion.backoffice @regresion
  Scenario: Cotización persona natural en inbroker con placa en fasecolda, con datos adicionales, con vehículo en leasing y conductor habitual - BackOffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania | 44454546 | Femenino | 10061996 | Si       | No           |           | Particular | Bogota |       | 20000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP008 @regresion.backoffice @regresion
  Scenario: Cotización persona jurídica inexistente en inbroker con placa en fasecolda, con datos adicionales, vehículo en leasing y conductor habitual - BackOffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania | 44454557 | Femenino | 10061996 | Si       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            | 2000000         | Si          | 2000000       | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP009 @regresion.backoffice @regresion
  Scenario: Cotización persona natural en inbroker, sin placa, sin código fasecolda, con datos adicionales, con vehículo en leasing y conductor habitual - BackOffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            | 2000000         | Si          | 2000000       | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP010 @regresion.backoffice @regresion
  Scenario: Cotización persona jurídica inexistente en inbroker, sin placa, sin código fasecolda, con datos adicionales, con vehículo en leasing y conductor habitual - BackOffice
    Given Deseo realizar cotizacion de un vehiculo
    When Elijo la opcion Cotizar Automotores
    And Consulto y elijo el asesor que cotizara "" con tipo "BackOffice"
    And Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id         | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 1254789625 | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado
