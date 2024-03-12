package co.com.cloud.inhub.auto.models;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@ToString
public class DatosBasicosModel {
    private final String tipoId;
    private final String id;
    private final String genero;
    private final String fecha;
    private final String optPlaca;
    private final String optFasecolda;
    private final String fasecolda;
    private final String servicio;
    private final String zona;
    private final String placa;
    private final String valorAsegurado;
    private final String marca;
    private final String linea;
    private final String clase;
    private final String modelo;

    public String getTipoId() {
        return tipoId;
    }

    public String getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getOptPlaca() {
        return optPlaca;
    }

    public String getOptFasecolda() {
        return optFasecolda;
    }

    public String getFasecolda() {
        return fasecolda;
    }

    public String getServicio() {
        return servicio;
    }

    public String getZona() {
        return zona;
    }

    public String getPlaca() {
        return placa;
    }

    public String getValorAsegurado() {
        return valorAsegurado;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public String getClase() {
        return clase;
    }

    public String getModelo() {
        return modelo;
    }
}
