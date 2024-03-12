package co.com.cloud.inhub.auto.models;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@ToString
public class DatosAdicionalesModel {
    private final String optAccesorios;
    private final String valorAccesorios;
    private final String optBlindaje;
    private final String valorBlindaje;
    private final String optLocatario;
    private final String tipoIdLocatario;
    private final String idLocatario;
    private final String nombreLocatario;
    private final String generoLocatario;
    private final String fechaLocatario;
    private final String optHabitual;
    private final String tipoIdHabitual;
    private final String idHabitual;
    private final String nombreHabitual;
    private final String generoHabitual;
    private final String fechaHabitual;

    public String getOptAccesorios() {
        return optAccesorios;
    }

    public String getValorAccesorios() {
        return valorAccesorios;
    }

    public String getOptBlindaje() {
        return optBlindaje;
    }

    public String getValorBlindaje() {
        return valorBlindaje;
    }

    public String getOptLocatario() {
        return optLocatario;
    }

    public String getTipoIdLocatario() {
        return tipoIdLocatario;
    }

    public String getIdLocatario() {
        return idLocatario;
    }

    public String getNombreLocatario() {
        return nombreLocatario;
    }

    public String getGeneroLocatario() {
        return generoLocatario;
    }

    public String getFechaLocatario() {
        return fechaLocatario;
    }

    public String getOptHabitual() {
        return optHabitual;
    }

    public String getTipoIdHabitual() {
        return tipoIdHabitual;
    }

    public String getIdHabitual() {
        return idHabitual;
    }

    public String getNombreHabitual() {
        return nombreHabitual;
    }

    public String getGeneroHabitual() {
        return generoHabitual;
    }

    public String getFechaHabitual() {
        return fechaHabitual;
    }
}
