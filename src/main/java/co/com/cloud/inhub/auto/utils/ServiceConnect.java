package co.com.cloud.inhub.auto.utils;

import co.com.cloud.inhub.auto.models.UrlApiModel;
import io.restassured.http.Header;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.apache.http.HttpStatus;
import java.util.jar.JarException;
import static org.junit.Assert.assertTrue;

public class ServiceConnect {


    private static final String URL_API_PERFIL = "https://uat-api.inhub.cloud/api/v1/7f407882-2fdc-4093-bee5-ca514f19a855/axa-cotizacion-portal/c/digital/actions/cotizacion-axa-colpatria/v1/start_session_external?product[portal]=axa-cotizacion-portal&product[route]=root";
    private static final String CONTENT_TYPE = "Content-type";
    private static final String APPLICATION = "application/json";
    private static final String X_CTI_DEBUG = "x-cti-debug";
    private static final String TRUE = "true";
    static String mensaje = "Para el servicio no se genero la url se esperaba un <200> pero la respuesta fue <";

    private ServiceConnect() {
    }

    public static String obtenerPerfil(UrlApiModel uriApiModel) throws JarException {
          try {
            Response response = SerenityRest.given()
                    .header(new Header(CONTENT_TYPE, APPLICATION))
                    .header(X_CTI_DEBUG, TRUE)
                    .body("{\"claveDeAgente\":" +uriApiModel.getClaveAgente()+ ",\"stage\": \"uat\",\"" +uriApiModel.getStage()+ "\": \"" +uriApiModel.getTipoBienCotizar()+ "\"}")
                    .when()
                    .post(URL_API_PERFIL);

            assertTrue(mensaje + response.getStatusCode() + ">", response.getStatusCode() == HttpStatus.SC_OK);
            return response.getBody().jsonPath().getString("data.url");
        } catch (Exception e) {
            ExceptionsProyecto.excepcionCunsultaDataServiciosJson("Error en el service obtener url  ", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }

    }
}
