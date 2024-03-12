package co.com.cloud.inhub.auto.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Oferta extends PageObject {

    @Getter private static By esencial  = By.xpath("//div[@id=\"quoteType\"]/button[text()='ESENCIAL']");
    @Getter private static By plus  = By.xpath("//div[@id=\"quoteType\"]/button[text()='PLUS']");
    @Getter private static By ofertaEsencial  = By.xpath("//div[@id=\"root\"]/form/div[3]/div/div/div[4]/div/div[3]/button");
    @Getter private static By ofertaVip  = By.xpath("//div[@id=\"root\"]/form/div[3]/div/div/div[5]/div/div[3]/button");
    @Getter private static By ofertaPlus  = By.xpath("//div[@id=\"root\"]/form/div[3]/div/div/div[6]/div/div[3]/button");
    @Getter private static By sinAsistencia  = By.xpath("//div[@id=\"root\"]/form/div[3]/div/div/div[7]/div/div[3]/button");
    @Getter private static By guardarCotizacion  = By.xpath("//div[@id=\"root\"]/form/div[4]/div/button[text()='GUARDAR COTIZACIÓN']");
    @Getter private static By guardadoExitosamente  = By.xpath("/html/body/div[2]/div[3]/div/div[1]/div");
    @Getter private static By aceptarExitosamente  = By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[text()='Aceptar']");
    @Getter private static By enviarCorreo  = By.xpath("//*[@id=\"root\"]/form/div[4]/div/button[text()='ENVIAR POR CORREO']");
    @Getter private static By muiCircular = By.xpath("//span[contains(@class, 'MuiCircularProgress')]");
}
