package co.com.cloud.inhub.auto.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    @Getter private static By automotoresCotizar = By.xpath("//div[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div[2]/button");
    @Getter private static By flotasCotizar = By.xpath("//div[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[2]/button");
    public void abrirPaginaConURL(String url) {
        getDriver().get(url);
    }
}

