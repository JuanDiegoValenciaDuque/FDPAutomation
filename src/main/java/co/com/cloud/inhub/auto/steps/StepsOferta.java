package co.com.cloud.inhub.auto.steps;

import co.com.cloud.inhub.auto.models.DatosOfertaModel;
import co.com.cloud.inhub.auto.pages.DatosAdicionales;
import co.com.cloud.inhub.auto.pages.Oferta;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import co.com.cloud.inhub.auto.utils.AccionesWeb;
import java.util.Objects;

@Slf4j
public class StepsOferta {
    AccionesWeb accionesWeb = new AccionesWeb();

    public void stepsOfertaSeleccionar(DatosOfertaModel datosOfertaModel) {
        accionesWeb.bordearElemento(DatosAdicionales.getOferta());
        accionesWeb.clickBoton(DatosAdicionales.getOferta());

        accionesWeb.esperaDesaparezcaElemento(Oferta.getMuiCircular());

        log.info("Elijo plan o...");
        if (Objects.equals(datosOfertaModel.getProducto(), "ESENCIAL")) {
            accionesWeb.bordearElemento(Oferta.getEsencial());
            accionesWeb.clickBoton(Oferta.getEsencial());
        } else if (Objects.equals(datosOfertaModel.getProducto(), "PLUS")) {
            accionesWeb.bordearElemento(Oferta.getPlus());
            accionesWeb.clickBoton(Oferta.getPlus());
        }
        switch (datosOfertaModel.getAsistencia()) {
            case "Esencial":
                accionesWeb.bordearElemento(Oferta.getOfertaEsencial());
                accionesWeb.clickBoton(Oferta.getOfertaEsencial());
                break;
            case "VIP":
                accionesWeb.bordearElemento(Oferta.getOfertaVip());
                accionesWeb.clickBoton(Oferta.getOfertaVip());
                break;
            case "PLUS":
                accionesWeb.bordearElemento(Oferta.getOfertaPlus());
                accionesWeb.clickBoton(Oferta.getOfertaPlus());
                break;
            case "SIN ASISTENCIA":
                accionesWeb.bordearElemento(Oferta.getSinAsistencia());
                accionesWeb.clickBoton(Oferta.getSinAsistencia());
                break;
            default:
                break;
        }
        accionesWeb.tomarEvidencia();
    }
    public void stepsOfertaGuardar(){
        accionesWeb.bordearElemento(Oferta.getGuardarCotizacion());
        accionesWeb.clickBoton(Oferta.getGuardarCotizacion());

        accionesWeb.isElementVisible(Oferta.getAceptarExitosamente());

        accionesWeb.tomarEvidencia();
        accionesWeb.bordearElemento(Oferta.getAceptarExitosamente());
        accionesWeb.clickBoton(Oferta.getAceptarExitosamente());

        accionesWeb.esperaDesaparezcaElemento(Oferta.getAceptarExitosamente());

    }
    public void stepsOfertaEmail(){
        accionesWeb.bordearElemento(Oferta.getEnviarCorreo());
        accionesWeb.clickBoton(Oferta.getEnviarCorreo());
        accionesWeb.tomarEvidencia();
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.cerrarPagina();
    }
}
