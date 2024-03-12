package co.com.cloud.inhub.auto.utils;

import com.itextpdf.text.DocumentException;
import utils.GenerarEvidenciasSerenityEnPDF;
import java.io.*;

public class GenerarEvidenciasEnPDF {

    public static void main(String[] args) throws DocumentException, IOException {
        GenerarEvidenciasSerenityEnPDF.identificaJson("target/site/serenity","src/test/resources/archivos/Logos.png");
    }

}