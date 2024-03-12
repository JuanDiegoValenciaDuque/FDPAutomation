package co.com.cloud.inhub.auto.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosBasicos extends PageObject {

    @Getter private static By tratamientoDatosSi  = By.xpath("//div[@id=\"acceptsTerms\"]/button[text()='Si']");
    @Getter private static By inspeccionSi  = By.xpath("//div[@id=\"requiredInspection\"]/button[text()='Si']");
    @Getter private static By tipoDocumento  = By.id("documentType");
    @Getter private static By documento  = By.id("documentNumber");
    @Getter private static By genero  = By.id("gender");
    @Getter private static By fechaNacimiento  = By.id("birthdate");
    @Getter private static By placaNo  = By.xpath("//div[@id=\"hasLicensePlate\"]/button[text()='No']");
    @Getter private static By placaSi  = By.xpath("//div[@id=\"hasLicensePlate\"]/button[text()='Si']");
    @Getter private static By fasecoldaSi  = By.xpath("//div[@id=\"hasCodeFasecolda\"]/button[text()='Si']");
    @Getter private static By fasecoldaNo  = By.xpath("//div[@id=\"hasCodeFasecolda\"]/button[text()='No']");
    @Getter private static By fasecolda  = By.id("codeFasecolda");
    @Getter private static By servicioSelect  = By.id("typeService");
    @Getter private static By zonaCirculacion  = By.id("circulationZone");
    @Getter private static By continuar  = By.xpath("//*[@id=\"root\"]/form/div[4]/div/div/div[2]");
    @Getter private static By placa  = By.id("licensePlate");
    @Getter private static By buscar  = By.xpath("//button[contains(text(),'Buscar')]");
    @Getter private static By valorAsegurado  = By.id("insuredValue");
    @Getter private static By marca = By.id("carBrand");
    @Getter private static By linea = By.id("carLine");
    @Getter private static By clase = By.id("carClass");
    @Getter private static By modelo = By.id("carModel");
    @Getter private static By valorAseguradoSuperado = By.xpath("//div[contains(text(),'El valor asegurado supera el límite establecido. ¿Desea continuar la cotización?')]");

    @Getter private static By seleccion;
    public static void setSeleccion(String seleccion) {
        DatosBasicos.seleccion = By.xpath("//*[text()='"+seleccion+"']");
    }


}
