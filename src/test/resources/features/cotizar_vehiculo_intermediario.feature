# Author: Juan Diego Valencia Duque
# encoding:utf-8

Feature: Realizar cotizacion de vehiculo con usuario intermediario

  @CP001 @regresion.intermediario @regresion
  Scenario: Cotización persona natural existente, codigo fasecolda, con datos adicionales e inhabilitado vehiculo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               |              |                 |             |                 |                 |                |             |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP002 @regresion.intermediario @regresion
  Scenario: Cotización persona natural inexistente, código fasecolda con datos adicionales e inhabilitado vehículo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania | 45641234 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               |              |                 |             |                 |                 |                |             |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP003 @regresion.intermediario @regresion
  Scenario: Cotización persona jurídica inexistente, código fasecolda y sin datos adicionales - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 89653212 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | No            |                 | No          |               | No           |                 |             |                 |                 |                | No          |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP004 @regresion.intermediario @regresion
  Scenario: Cotización persona jurídica inexistente, código fasecolda, con datos adicionales y vehículo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id       | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 89653217 | Femenino | 10061996 | No       | Si           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP005 @regresion.intermediario @regresion
  Scenario: Cotización persona natural existente, código fasecolda y que súpere el limite de accesorios - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            | 50000000        | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    Then Valido mensaje de valor accesorios superado


  @CP006 @regresion.intermediario @regresion
  Scenario: Cotización persona natural existente, código fasecolda y que súpere el limite de blindaje - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          | 200000000     | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    Then Valido mensaje de valor blindaje superado


  @CP007 @regresion.intermediario @regresion
  Scenario: Cotización persona natural en inbroker con placa en fasecolda, con datos adicionales e inhabilitado vehículo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | Si       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               |              |                 |             |                 |                 |                |             |                |            |                |                |               |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP008 @regresion.intermediario @regresion
  Scenario: Cotización persona jurídica inexistente en inbroker con placa en fasecolda, con datos adicionales, vehículo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId     | id        | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Nro De Nit | 445464651 | Femenino | 10061996 | Si       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP009 @regresion.intermediario @regresion
  Scenario: Cotización persona natural en inbroker, sin placa, sin código fasecolda, con datos adicionales e inhabilitado vehículo en leasing y conductor habitual - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca | linea            | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | MAZDA | 121 LX MT 1300CC | Automovil | 2024   |
    And Diligencio los campos necesarios en el formulario Datos Adicionales
      | optAccesorios | valorAccesorios | optBlindaje | valorBlindaje | optLocatario | tipoIdLocatario      | idLocatario | nombreLocatario | generoLocatario | fechaLocatario | optHabitual | tipoIdHabitual       | idHabitual | nombreHabitual | generoHabitual | fechaHabitual |
      | Si            |                 | Si          |               | Si           | Cedula De Ciudadania | 125898713   | Cliente AXA     | Femenino        | 10061996       | Si          | Cedula De Ciudadania | 89563247   | Habitual AXA   | Femenino       | 10061996      |
    And Elijo la oferta ofrecida
      | producto | asistencia |
      | PLUS     | VIP        |
    Then Valido guardado exitoso
    And Valido condigo entregado


  @CP010 @regresion.intermediario @regresion
  Scenario: Cotización persona natural inexistente en inbroker con marca no asegurable - Intermediario
    Given Consulto e ingreso a URL del asesor
      | claveAgente | stage | tipoBienCotizar |
      | 33426       | uat   | autoLiviano     |
    And Consulto y elijo el asesor que cotizara "" con tipo "Intermediario"
    When Diligencio los campos necesarios en el formulario Datos Basicos
      | tipoId               | id | genero   | fecha    | optPlaca | optFasecolda | fasecolda | servicio   | zona   | placa | valorAsegurado | marca   | linea                   | clase     | modelo |
      | Cedula De Ciudadania |    | Femenino | 10061996 | No       | No           |           | Particular | Bogota |       | 50000000       | FERRARI | 458 ITALIA TP 4500CC V8 | Automovil | 2024   |