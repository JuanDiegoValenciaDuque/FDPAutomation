package co.com.cloud.inhub.auto.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InfoAsesor extends PageObject {

    @Getter private static By asesor = By.id("adviser");
    @Getter private static By asesorElegir;
    @Getter private static By continuar = By.xpath("//div[@id=\"root\"]/form/div[4]/div/div/div[2]/button");
    public static void setAsesorElegir(String valor) {
        InfoAsesor.asesorElegir = By.xpath("//*[contains(text(),'("+valor+")')]");
    }
}
