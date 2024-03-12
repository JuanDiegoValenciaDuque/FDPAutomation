package co.com.cloud.inhub.auto.steps;

import co.com.cloud.inhub.auto.pages.InfoAsesor;
import co.com.cloud.inhub.auto.utils.UtilDatosAleatorios;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import co.com.cloud.inhub.auto.utils.AccionesWeb;
import net.thucydides.core.util.EnvironmentVariables;

@Slf4j
public class StepsInfoAsesor {
    AccionesWeb accionesWeb = new AccionesWeb();
    public void buscarAsesor(String asesor, String tipo) {
        System.setProperty("tipo", tipo);

        if(tipo.equals("BackOffice")) {

            if (asesor.isEmpty()) {
                asesor = UtilDatosAleatorios.obtenerDatoAleatorioTxt("src/test/resources/data/NumerosAsesores.txt");
            }
            InfoAsesor.setAsesorElegir(asesor);
            log.info("Buscando asesor...");
            accionesWeb.bordearElemento(InfoAsesor.getAsesor());
            accionesWeb.escribirTexto(InfoAsesor.getAsesor(), asesor);
            accionesWeb.esperaTiempoSegundos(10);
            accionesWeb.clickBoton(InfoAsesor.getAsesorElegir());
            accionesWeb.esperaTiempoSegundos(10);
            accionesWeb.tomarEvidencia();
            accionesWeb.clickBoton(InfoAsesor.getContinuar());
            accionesWeb.esperaTiempoSegundos(10);
        }
    }
}
