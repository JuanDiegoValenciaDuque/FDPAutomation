package co.com.cloud.inhub.auto.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosAdicionales extends PageObject {

    @Getter private static By importacionNo  = By.xpath("//div[@id=\"hasDirectImport\"]/button[text()='No']");
    @Getter private static By accesoriosSi  = By.xpath("//div[@id=\"hasAccesories\"]/button[text()='Si']");
    @Getter private static By accesoriosNo  = By.xpath("//div[@id=\"hasAccesories\"]/button[text()='No']");
    @Getter private static By valorAccesorios = By.id("accesoriesValue");
    @Getter private static By blindajeSi  = By.xpath("//div[@id=\"hasArmor\"]/button[text()='Si']");
    @Getter private static By blindajeNo  = By.xpath("//div[@id=\"hasArmor\"]/button[text()='No']");
    @Getter private static By valorBlindaje  = By.id("armorValue");
    @Getter private static By leasingSi  = By.xpath("//div[@id=\"hasVehicleLeasing\"]/button[text()='Si']");
    @Getter private static By leasingNo  = By.xpath("//div[@id=\"hasVehicleLeasing\"]/button[text()='No']");
    @Getter private static By tipoIdLocatario  = By.id("tenantDocumentType");
    @Getter private static By idLocatario  = By.id("tenantDocumentNumber");
    @Getter private static By nombreLocatario  = By.id("tenantName");
    @Getter private static By generoLocatario  = By.id("tenantGender");
    @Getter private static By fechaLocatario  = By.id("tenantBirthDate");
    @Getter private static By habitualSi  = By.xpath("//div[@id=\"hasRegularDriver\"]/button[text()='Si']");
    @Getter private static By habitualNo  = By.xpath("//div[@id=\"hasRegularDriver\"]/button[text()='No']");
    @Getter private static By tipoIdHabitual  = By.id("driverDocumentType");
    @Getter private static By idHabitual  = By.id("driverDocumentNumber");
    @Getter private static By nombreHabitual  = By.id("driverName");
    @Getter private static By generoHabitual  = By.id("driverGender");
    @Getter private static By fechaHabitual  = By.id("driverBirthDate");
    @Getter private static By oferta  = By.xpath("//button[text()='OFERTA']");
    @Getter private static By valorAsegurado  = By.xpath("//div[@id=\"root\"]/form/div[2]/div[2]/div[1]/div[5]/div/p[2]");
    @Getter private static By seleccion;
    public static void setSeleccion(String seleccion) {
        DatosAdicionales.seleccion = By.xpath("//li[text()='"+seleccion+"']");
    }
}
