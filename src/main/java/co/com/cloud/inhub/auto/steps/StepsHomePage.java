package co.com.cloud.inhub.auto.steps;

import co.com.cloud.inhub.auto.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import co.com.cloud.inhub.auto.utils.AccionesWeb;
import net.thucydides.core.util.EnvironmentVariables;

@Slf4j
public class StepsHomePage {
    HomePage homePage = new HomePage();
    AccionesWeb accionesWeb = new AccionesWeb();
    private EnvironmentVariables environmentVariables;

     public void abrirPaginaWeb() throws InterruptedException {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").get();
        homePage.abrirPaginaConURL(baseUrl);
        log.info("abrir Pagina Web {}", baseUrl);
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.tomarEvidencia();
    }

    public void abrirPaginaWebAsesor(String url) throws InterruptedException {
        homePage.abrirPaginaConURL(url);
        log.info("abrir Pagina Web {}", url);
        accionesWeb.esperaTiempoSegundos(10);
        accionesWeb.tomarEvidencia();
    }

    public void elegirPoducto() {
        log.info("Elegir producto a cotizar");
        accionesWeb.tomarEvidencia();
        accionesWeb.bordearElemento(HomePage.getAutomotoresCotizar());
        accionesWeb.clickBoton(HomePage.getAutomotoresCotizar());
        accionesWeb.esperaTiempoSegundos(10);
    }
}
