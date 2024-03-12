package co.com.cloud.inhub.auto.steps;


import co.com.cloud.inhub.auto.models.UrlApiModel;
import co.com.cloud.inhub.auto.utils.ServiceConnect;
import net.thucydides.core.annotations.Step;
import utils.MetodosRest;
import java.util.jar.JarException;
import java.util.logging.Logger;

public class StepsConsultarURL {
    public String stepsObtenerURL(UrlApiModel uriApiModel) throws JarException {
            return ServiceConnect.obtenerPerfil(uriApiModel);
    }
}
