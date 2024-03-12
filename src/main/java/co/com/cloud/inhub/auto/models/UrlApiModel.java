package co.com.cloud.inhub.auto.models;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.HashMap;
import java.util.Map;

@Setter
@AllArgsConstructor
@ToString
public class UrlApiModel {
    private String claveAgente;
    private String stage;
    private String tipoBienCotizar;
    public static String toString(String claveAgente, String stage, String tipoBienCotizar) {
        Map<String, Object> map = new HashMap<>();
        map.put("\"claveDeAgente\"", "\""+claveAgente+"\"");
        map.put("\"stage\"", "\""+stage+"\"");
        map.put("\"tipoBienCotizar\"", "\""+tipoBienCotizar+"\"");

        return map.toString();
    }

    public String getClaveAgente() {
        return claveAgente;
    }

    public String getStage() {
        return stage;
    }

    public String getTipoBienCotizar() {
        return tipoBienCotizar;
    }
}
