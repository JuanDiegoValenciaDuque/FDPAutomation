package co.com.cloud.inhub.auto.steps;

import co.com.cloud.inhub.auto.models.DatosAdicionalesModel;
import co.com.cloud.inhub.auto.pages.DatosAdicionales;
import co.com.cloud.inhub.auto.utils.AccionesWeb;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.requirements.reports.ScenarioOutcome;

import java.math.BigInteger;
import java.util.Objects;

@Slf4j
public class StepsDatosAdicionales {
    AccionesWeb accionesWeb = new AccionesWeb();

    public void stepsDatosAdicionalesImportacion() {
        log.info("Diligencio datos adicionales de cotizacion...");
        accionesWeb.bordearElemento(DatosAdicionales.getImportacionNo());
        accionesWeb.clickBoton(DatosAdicionales.getImportacionNo());
        accionesWeb.tomarEvidencia();
    }

    public void stepsDatosAdicionalesAccesorios(DatosAdicionalesModel datosAdicionalesModel) {
        String valor = String.valueOf(BigInteger.valueOf((long) (Long.parseLong(accionesWeb.extraerTextodeLabel(DatosAdicionales.getValorAsegurado()).replace(".", "").replace("$", "").trim()) * 0.2)));
        if (Objects.equals(datosAdicionalesModel.getOptAccesorios(), "Si")) {
            accionesWeb.bordearElemento(DatosAdicionales.getAccesoriosSi());
            accionesWeb.clickBoton(DatosAdicionales.getAccesoriosSi());
            if (datosAdicionalesModel.getValorAccesorios() == null) {
                accionesWeb.bordearElemento(DatosAdicionales.getValorAccesorios());
                accionesWeb.escribirTexto(DatosAdicionales.getValorAccesorios(), valor);
            } else {
                accionesWeb.bordearElemento(DatosAdicionales.getValorAccesorios());
                accionesWeb.escribirTexto(DatosAdicionales.getValorAccesorios(), datosAdicionalesModel.getValorAccesorios());
            }
        } else if (Objects.equals(datosAdicionalesModel.getOptAccesorios(), "No")) {
            accionesWeb.bordearElemento(DatosAdicionales.getAccesoriosNo());
            accionesWeb.clickBoton(DatosAdicionales.getAccesoriosNo());
        }
        accionesWeb.tomarEvidencia();
    }

    public void stepsDatosAdicionalesBlindaje(DatosAdicionalesModel datosAdicionalesModel) {
        String valor = String.valueOf(BigInteger.valueOf((long) (Long.parseLong(accionesWeb.extraerTextodeLabel(DatosAdicionales.getValorAsegurado()).replace(".", "").replace("$", "").trim()) * 1.0)));
        if (Objects.equals(datosAdicionalesModel.getOptBlindaje(), "Si")) {
            accionesWeb.bordearElemento(DatosAdicionales.getBlindajeSi());
            accionesWeb.clickBoton(DatosAdicionales.getBlindajeSi());
            if (datosAdicionalesModel.getValorBlindaje() == null) {
                accionesWeb.bordearElemento(DatosAdicionales.getValorBlindaje());
                accionesWeb.escribirTexto(DatosAdicionales.getValorBlindaje(), valor);
            } else {
                accionesWeb.bordearElemento(DatosAdicionales.getValorBlindaje());
                accionesWeb.escribirTexto(DatosAdicionales.getValorBlindaje(), datosAdicionalesModel.getValorBlindaje());
            }
        } else if (Objects.equals(datosAdicionalesModel.getOptBlindaje(), "No")) {
            accionesWeb.bordearElemento(DatosAdicionales.getBlindajeNo());
            accionesWeb.clickBoton(DatosAdicionales.getBlindajeNo());
        }
        accionesWeb.tomarEvidencia();
    }

    public void stepsDatosAdicionalesLocatario(DatosAdicionalesModel datosAdicionalesModel) {
        if ((Objects.equals(System.getProperty("tipo"), "BackOffice")) || ((Objects.equals(System.getProperty("optFasecolda"), "Si") || Objects.equals(System.getProperty("optPlaca"), "Si")) && (Objects.equals(System.getProperty("tipo"), "Intermediario") || Objects.equals(System.getProperty("tipo"), "Aliado")))) {
            if (Objects.equals(datosAdicionalesModel.getOptLocatario(), "Si")) {
                accionesWeb.bordearElemento(DatosAdicionales.getLeasingSi());
                accionesWeb.clickBoton(DatosAdicionales.getLeasingSi());
                accionesWeb.esperaTiempoSegundos(10);
                accionesWeb.bordearElemento(DatosAdicionales.getTipoIdLocatario());
                accionesWeb.clickBoton(DatosAdicionales.getTipoIdLocatario());
                accionesWeb.esperaTiempoSegundos(10);
                DatosAdicionales.setSeleccion(datosAdicionalesModel.getTipoIdLocatario());
                accionesWeb.clickBoton(DatosAdicionales.getSeleccion());
                accionesWeb.bordearElemento(DatosAdicionales.getIdLocatario());
                accionesWeb.escribirTexto(DatosAdicionales.getIdLocatario(), datosAdicionalesModel.getIdLocatario());
                accionesWeb.bordearElemento(DatosAdicionales.getNombreLocatario());
                accionesWeb.escribirTexto(DatosAdicionales.getNombreLocatario(), datosAdicionalesModel.getNombreLocatario());
                accionesWeb.clickBoton(DatosAdicionales.getGeneroLocatario());
                DatosAdicionales.setSeleccion(datosAdicionalesModel.getGeneroLocatario());
                accionesWeb.clickBoton(DatosAdicionales.getSeleccion());
                accionesWeb.bordearElemento(DatosAdicionales.getFechaLocatario());
                accionesWeb.escribirTexto(DatosAdicionales.getFechaLocatario(), datosAdicionalesModel.getFechaLocatario());
            } else if (Objects.equals(datosAdicionalesModel.getOptLocatario(), "No")) {
                accionesWeb.bordearElemento(DatosAdicionales.getLeasingNo());
                accionesWeb.clickBoton(DatosAdicionales.getLeasingNo());
            }
        }
        accionesWeb.tomarEvidencia();
    }

    public void stepsDatosAdicionalesHabitual(DatosAdicionalesModel datosAdicionalesModel) {
        if ((Objects.equals(System.getProperty("tipo"), "BackOffice")) || ((Objects.equals(System.getProperty("optFasecolda"), "Si") || Objects.equals(System.getProperty("optPlaca"), "Si")) && (Objects.equals(System.getProperty("tipo"), "Intermediario") || Objects.equals(System.getProperty("tipo"), "Aliado")))) {
            if (Objects.equals(datosAdicionalesModel.getOptHabitual(), "Si")) {
                accionesWeb.bordearElemento(DatosAdicionales.getHabitualSi());
                accionesWeb.clickBoton(DatosAdicionales.getHabitualSi());
                accionesWeb.esperaTiempoSegundos(10);
                accionesWeb.bordearElemento(DatosAdicionales.getTipoIdHabitual());
                accionesWeb.clickBoton(DatosAdicionales.getTipoIdHabitual());
                accionesWeb.esperaTiempoSegundos(10);
                DatosAdicionales.setSeleccion(datosAdicionalesModel.getTipoIdHabitual());
                accionesWeb.clickBoton(DatosAdicionales.getSeleccion());
                accionesWeb.bordearElemento(DatosAdicionales.getIdHabitual());
                accionesWeb.escribirTexto(DatosAdicionales.getIdHabitual(), datosAdicionalesModel.getIdHabitual());
                accionesWeb.bordearElemento(DatosAdicionales.getNombreHabitual());
                accionesWeb.escribirTexto(DatosAdicionales.getNombreHabitual(), datosAdicionalesModel.getNombreHabitual());
                accionesWeb.clickBoton(DatosAdicionales.getGeneroHabitual());
                DatosAdicionales.setSeleccion(datosAdicionalesModel.getGeneroHabitual());
                accionesWeb.clickBoton(DatosAdicionales.getSeleccion());
                accionesWeb.bordearElemento(DatosAdicionales.getFechaHabitual());
                accionesWeb.escribirTexto(DatosAdicionales.getFechaHabitual(), datosAdicionalesModel.getFechaHabitual());
            } else if (Objects.equals(datosAdicionalesModel.getOptHabitual(), "No")) {
                accionesWeb.bordearElemento(DatosAdicionales.getHabitualNo());
                accionesWeb.clickBoton(DatosAdicionales.getHabitualNo());
            }
        }
        accionesWeb.tomarEvidencia();
    }

    public void stepsDatosAdicionalesValidarLimite() {
        log.info("Valido boton de oferta no activado...");
        if(!accionesWeb.elemetoClikeable(DatosAdicionales.getOferta())) {
            accionesWeb.bordearElemento(DatosAdicionales.getOferta());
            accionesWeb.tomarEvidencia();
            accionesWeb.cerrarPagina();
        }
    }
}
