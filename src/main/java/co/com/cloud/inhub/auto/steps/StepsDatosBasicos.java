package co.com.cloud.inhub.auto.steps;

import co.com.cloud.inhub.auto.models.DatosBasicosModel;
import co.com.cloud.inhub.auto.pages.DatosAdicionales;
import co.com.cloud.inhub.auto.pages.DatosBasicos;
import co.com.cloud.inhub.auto.utils.UtilDatosAleatorios;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import co.com.cloud.inhub.auto.utils.AccionesWeb;
import net.thucydides.core.util.EnvironmentVariables;
import java.util.Objects;

@Slf4j
public class StepsDatosBasicos {
    AccionesWeb accionesWeb = new AccionesWeb();

    public void diligenciarDatosBasicosDatosInspeccion() {
        log.info("Diligencio datos basicos de cotizacion...");
        accionesWeb.bordearElemento(DatosBasicos.getTratamientoDatosSi());
        accionesWeb.clickBoton(DatosBasicos.getTratamientoDatosSi());
        accionesWeb.esperaTiempoSegundos(10);
        if(Objects.equals(System.getProperty("tipo"), "BackOffice")){
            accionesWeb.clickBoton(DatosBasicos.getInspeccionSi());
        }
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosCliente(DatosBasicosModel datosBasicosModel) {
        String id;
        accionesWeb.bordearElemento(DatosBasicos.getTipoDocumento());
        accionesWeb.clickBoton(DatosBasicos.getTipoDocumento());
        if (Objects.equals(datosBasicosModel.getTipoId(), "Nro De Nit")) {
            accionesWeb.esperaTiempoSegundos(10);
            DatosBasicos.setSeleccion(datosBasicosModel.getTipoId());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            accionesWeb.esperaTiempoSegundos(10);
            accionesWeb.bordearElemento(DatosBasicos.getDocumento());
            accionesWeb.escribirTexto(DatosBasicos.getDocumento(), datosBasicosModel.getId());
        } else if (Objects.equals(datosBasicosModel.getTipoId(), "Cedula De Ciudadania")) {
            accionesWeb.esperaTiempoSegundos(10);
            DatosBasicos.setSeleccion(datosBasicosModel.getTipoId());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            accionesWeb.esperaTiempoSegundos(10);
            if (datosBasicosModel.getId() == null) {
                id = UtilDatosAleatorios.obtenerDatoAleatorioTxt("src/test/resources/data/ClientesExistentes.txt");
                accionesWeb.bordearElemento(DatosBasicos.getDocumento());
                accionesWeb.escribirTexto(DatosBasicos.getDocumento(), id);
            } else if(datosBasicosModel.getId() != null){
                accionesWeb.bordearElemento(DatosBasicos.getDocumento());
                accionesWeb.escribirTexto(DatosBasicos.getDocumento(), datosBasicosModel.getId());
                accionesWeb.bordearElemento(DatosBasicos.getFechaNacimiento());
                accionesWeb.escribirTexto(DatosBasicos.getFechaNacimiento(), datosBasicosModel.getFecha());
                accionesWeb.clickBoton(DatosBasicos.getGenero());
                DatosBasicos.setSeleccion(datosBasicosModel.getGenero());
                accionesWeb.esperaTiempoSegundos(5);
                accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            }
            accionesWeb.esperaTiempoSegundos(10);
        }
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosPlaca(DatosBasicosModel datosBasicosModel) {
        System.setProperty("optPlaca", datosBasicosModel.getOptPlaca());
        String placa;
        if (Objects.equals(datosBasicosModel.getOptPlaca(), "No")) {
            accionesWeb.bordearElemento(DatosBasicos.getPlacaNo());
            accionesWeb.clickBoton(DatosBasicos.getPlacaNo());
        } else if (Objects.equals(datosBasicosModel.getOptPlaca(), "Si")) {
            accionesWeb.bordearElemento(DatosBasicos.getPlacaSi());
            accionesWeb.clickBoton(DatosBasicos.getPlacaSi());
            if (datosBasicosModel.getPlaca() == null) {
                placa = UtilDatosAleatorios.obtenerDatoAleatorioTxt("src/test/resources/data/NumeroPlaca.txt");
                accionesWeb.bordearElemento(DatosBasicos.getPlaca());
                accionesWeb.escribirTexto(DatosBasicos.getPlaca(), placa);
            } else {
                accionesWeb.bordearElemento(DatosBasicos.getPlaca());
                accionesWeb.escribirTexto(DatosBasicos.getPlaca(), datosBasicosModel.getPlaca());
            }
            accionesWeb.clickBoton(DatosBasicos.getBuscar());
            accionesWeb.esperaTiempoSegundos(10);
        }
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosFasecolda(DatosBasicosModel datosBasicosModel) {
        System.setProperty("optFasecolda", datosBasicosModel.getOptFasecolda());
        String fasecolda;
        if (Objects.equals(datosBasicosModel.getOptPlaca(), "No")) {
            if (Objects.equals(datosBasicosModel.getOptFasecolda(), "Si")) {
                accionesWeb.bordearElemento(DatosBasicos.getFasecoldaSi());
                accionesWeb.esperaTiempoSegundos(10);
                accionesWeb.clickBoton(DatosBasicos.getFasecoldaSi());
                if (datosBasicosModel.getFasecolda() == null) {
                    fasecolda = UtilDatosAleatorios.obtenerDatoAleatorioTxt("src/test/resources/data/CodigosFasecolda.txt");
                    accionesWeb.bordearElemento(DatosBasicos.getFasecolda());
                    accionesWeb.escribirTexto(DatosBasicos.getFasecolda(), fasecolda);
                } else {
                    accionesWeb.bordearElemento(DatosBasicos.getFasecolda());
                    accionesWeb.escribirTexto(DatosBasicos.getFasecolda(), datosBasicosModel.getFasecolda());
                }
                accionesWeb.clickBoton(DatosBasicos.getBuscar());
            } else if (Objects.equals(datosBasicosModel.getOptFasecolda(), "No")) {
                accionesWeb.esperaTiempoSegundos(10);
                accionesWeb.bordearElemento(DatosBasicos.getFasecoldaNo());
                accionesWeb.clickBoton(DatosBasicos.getFasecoldaNo());
                accionesWeb.esperaTiempoSegundos(10);
            }
        }
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosVehiculo(DatosBasicosModel datosBasicosModel) {
        if ((Objects.equals(datosBasicosModel.getOptPlaca(), "No")) && (Objects.equals(datosBasicosModel.getOptFasecolda(), "No"))){
            accionesWeb.bordearElemento(DatosBasicos.getMarca());
            DatosBasicos.setSeleccion(datosBasicosModel.getMarca());
            accionesWeb.esperaTiempoSegundos(5);
            accionesWeb.clickBoton(DatosBasicos.getMarca());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            accionesWeb.bordearElemento(DatosBasicos.getLinea());
            DatosBasicos.setSeleccion(datosBasicosModel.getLinea());
            accionesWeb.esperaTiempoSegundos(5);
            accionesWeb.clickBoton(DatosBasicos.getLinea());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            accionesWeb.bordearElemento(DatosBasicos.getClase());
            DatosBasicos.setSeleccion(datosBasicosModel.getClase());
            accionesWeb.esperaTiempoSegundos(5);
            accionesWeb.clickBoton(DatosBasicos.getClase());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
            accionesWeb.clickBoton(DatosBasicos.getBuscar());
        }
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosServicios(DatosBasicosModel datosBasicosModel) {
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.bordearElemento(DatosBasicos.getServicioSelect());
        accionesWeb.clickBoton(DatosBasicos.getServicioSelect());
        DatosBasicos.setSeleccion(datosBasicosModel.getServicio());
        accionesWeb.clickBoton(DatosBasicos.getSeleccion());
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosZonaCirculacion(DatosBasicosModel datosBasicosModel) {
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.bordearElemento(DatosBasicos.getZonaCirculacion());
        accionesWeb.bordearElemento(DatosBasicos.getZonaCirculacion());
        accionesWeb.clickBoton(DatosBasicos.getZonaCirculacion());
        DatosBasicos.setSeleccion(datosBasicosModel.getZona());
        accionesWeb.clickBoton(DatosBasicos.getSeleccion());
        accionesWeb.tomarEvidencia();
    }

    public void diligenciarDatosBasicosModelo(DatosBasicosModel datosBasicosModel) {
        if ((Objects.equals(datosBasicosModel.getOptFasecolda(), "No"))) {
            DatosBasicos.setSeleccion(datosBasicosModel.getModelo());
            accionesWeb.bordearElemento(DatosBasicos.getModelo());
            accionesWeb.clickBoton(DatosBasicos.getModelo());
            accionesWeb.clickBoton(DatosBasicos.getSeleccion());
        }
            accionesWeb.tomarEvidencia();
            accionesWeb.bordearElemento(DatosBasicos.getContinuar());
            accionesWeb.esperaTiempoSegundos(10);

            if(!accionesWeb.isElementVisible(DatosAdicionales.getOferta())){
                accionesWeb.clickBoton(DatosBasicos.getContinuar());
            }
            accionesWeb.esperaTiempoSegundos(10);
    }
}
