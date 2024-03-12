package co.com.cloud.inhub.auto.stepdefinitions;

import co.com.cloud.inhub.auto.models.DatosAdicionalesModel;
import co.com.cloud.inhub.auto.models.DatosBasicosModel;
import co.com.cloud.inhub.auto.models.DatosOfertaModel;
import co.com.cloud.inhub.auto.models.UrlApiModel;
import co.com.cloud.inhub.auto.steps.*;
import co.com.cloud.inhub.auto.utils.DatatableToClass;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.Map;
import java.util.jar.JarException;

public class CotizarVehiculoStepDefinitions {

    @Steps private StepsHomePage stepsHomePage;
    @Steps private StepsInfoAsesor stepsInfoAsesor;
    @Steps private StepsDatosBasicos stepsDatosBasicos;
    @Steps private StepsDatosAdicionales stepsDatosAdicionales;
    @Steps private StepsOferta stepsOferta;
    @Steps private StepsConsultarURL stepsObtenerURL;
    @Steps private DatatableToClass datatableToClass;

    @Given("Deseo realizar cotizacion de un vehiculo")
    public void deseoRealizarCotizacionDeUnVehiculo() throws InterruptedException {
        stepsHomePage.abrirPaginaWeb();
    }

    @Given("Consulto e ingreso a URL del asesor")
    public void consultoEIngresoAURLDelAsesor(UrlApiModel urlApiModel) throws InterruptedException, JarException {
        stepsHomePage.abrirPaginaWebAsesor(stepsObtenerURL.stepsObtenerURL(urlApiModel));
    }

    @When("Elijo la opcion Cotizar Automotores")
    public void elijoLaOpcionCotizarAutomotores(){
        stepsHomePage.elegirPoducto();
    }

    @When("Consulto y elijo el asesor que cotizara {string} con tipo {string}")
    public void consultoYElijoElAsesorQueCotizaraConTipo(String asesor, String tipo) {
        stepsInfoAsesor.buscarAsesor(asesor, tipo);
    }

    @When("Diligencio los campos necesarios en el formulario Datos Basicos")
    public void diligencioLosCamposNecesariosEnElFormularioDatosBasicos(DatosBasicosModel datosBasicosModel) {
        stepsDatosBasicos.diligenciarDatosBasicosDatosInspeccion();
        stepsDatosBasicos.diligenciarDatosBasicosCliente(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosPlaca(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosFasecolda(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosVehiculo(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosServicios(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosZonaCirculacion(datosBasicosModel);
        stepsDatosBasicos.diligenciarDatosBasicosModelo(datosBasicosModel);
    }

    @When("Diligencio los campos necesarios en el formulario Datos Adicionales")
    public void diligencioLosCamposNecesariosEnElFormularioDatosAdicionales(DatosAdicionalesModel datosAdicionalesModel) {
        stepsDatosAdicionales.stepsDatosAdicionalesImportacion();
        stepsDatosAdicionales.stepsDatosAdicionalesAccesorios(datosAdicionalesModel);
        stepsDatosAdicionales.stepsDatosAdicionalesBlindaje(datosAdicionalesModel);
        stepsDatosAdicionales.stepsDatosAdicionalesLocatario(datosAdicionalesModel);
        stepsDatosAdicionales.stepsDatosAdicionalesHabitual(datosAdicionalesModel);
    }

    @When("Elijo la oferta ofrecida")
    public void elijoLaOfertaOfrecida(DatosOfertaModel datosOfertaModel) {
        stepsOferta.stepsOfertaSeleccionar(datosOfertaModel);
    }

    @Then("Valido guardado exitoso")
    public void validoGuardadoExitoso() {
        stepsOferta.stepsOfertaGuardar();
    }

    @Then("Valido condigo entregado")
    public void validoCondigoEntregado() {
        stepsOferta.stepsOfertaEmail();
    }

    @Then("Valido mensaje de valor accesorios superado")
    public void validoMesajeDeValorAccesoriosSuperado() {
        stepsDatosAdicionales.stepsDatosAdicionalesValidarLimite();
    }

    @Then("Valido mensaje de valor blindaje superado")
    public void validoMesajeDeValorBlindajeSuperado() {
        stepsDatosAdicionales.stepsDatosAdicionalesValidarLimite();
    }



    @DataTableType
    public DatosBasicosModel defineDatosDatosBasicosModel(Map<String, String> entry){
        return datatableToClass.defineDatosDatosBasicosModel(entry);
    }

    @DataTableType
    public DatosAdicionalesModel defineDatosAdicionalesModel(Map<String, String> entry) {
        return datatableToClass.defineDatosAdicionalesModel(entry);
    }

    @DataTableType
    public DatosOfertaModel defineDatosOfertaModel(Map<String, String> entry) {
        return datatableToClass.defineDatosOfertaModel(entry);
    }

    @DataTableType
    public UrlApiModel defineUrlApiModel(Map<String, String> entry) {
        return datatableToClass.defineUrlApiModel(entry);
    }
}
