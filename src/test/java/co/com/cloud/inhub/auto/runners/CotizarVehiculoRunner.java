package co.com.cloud.inhub.auto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.cloud.inhub.auto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags =
//        "@CPExcel"
//      "@regresion"
      "@CP001 and @regresion.backoffice and @regresion"
        )
public class CotizarVehiculoRunner {

        /*@BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
                DataToFeature.overrideFeatureFiles("/src/test/resources/features/cotizar_excel.feature");
        }*/
}
