package co.com.cloud.inhub.auto.utils;

import co.com.cloud.inhub.auto.models.DatosAdicionalesModel;
import co.com.cloud.inhub.auto.models.DatosBasicosModel;
import co.com.cloud.inhub.auto.models.DatosOfertaModel;
import co.com.cloud.inhub.auto.models.UrlApiModel;
import io.cucumber.java.Transpose;
import java.util.Map;

public class DatatableToClass {

    public DatosBasicosModel defineDatosDatosBasicosModel(@Transpose Map<String, String> entry) {
        return new DatosBasicosModel(
                entry.get("tipoId"),
                entry.get("id"),
                entry.get("genero"),
                entry.get("fecha"),
                entry.get("optPlaca"),
                entry.get("optFasecolda"),
                entry.get("fasecolda"),
                entry.get("servicio"),
                entry.get("zona"),
                entry.get("placa"),
                entry.get("valorAsegurado"),
                entry.get("marca"),
                entry.get("linea"),
                entry.get("clase"),
                entry.get("modelo")
        );
    }
    public DatosAdicionalesModel defineDatosAdicionalesModel(@Transpose Map<String, String> entry) {
        return new DatosAdicionalesModel(
                entry.get("optAccesorios"),
                entry.get("valorAccesorios"),
                entry.get("optBlindaje"),
                entry.get("valorBlindaje"),
                entry.get("optLocatario"),
                entry.get("tipoIdLocatario"),
                entry.get("idLocatario"),
                entry.get("nombreLocatario"),
                entry.get("generoLocatario"),
                entry.get("fechaLocatario"),
                entry.get("optHabitual"),
                entry.get("tipoIdHabitual"),
                entry.get("idHabitual"),
                entry.get("nombreHabitual"),
                entry.get("generoHabitual"),
                entry.get("fechaHabitual")
        );
    }
    public DatosOfertaModel defineDatosOfertaModel(@Transpose Map<String, String> entry) {
        return new DatosOfertaModel(
                entry.get("producto"),
                entry.get("asistencia")
        );
    }
    public UrlApiModel defineUrlApiModel(@Transpose Map<String, String> entry) {
        return new UrlApiModel(
                entry.get("claveAgente"),
                entry.get("stage"),
                entry.get("tipoBienCotizar")
        );
    }

}
