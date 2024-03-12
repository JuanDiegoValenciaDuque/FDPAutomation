package co.com.cloud.inhub.auto.models;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@ToString
public class DatosOfertaModel {
    private final String producto;
    private final String asistencia;

    public String getProducto() {
        return producto;
    }

    public String getAsistencia() {
        return asistencia;
    }
}
