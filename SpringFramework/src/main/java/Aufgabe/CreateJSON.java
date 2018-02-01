package Aufgabe;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

/**
 * Dies ist die Dokumentation der Klasse CreateJSON. CreateJSON erstellt ein Mapper für das JSON
 * @author Maxime Tchangou
 * @version 1.0
 */
public class CreateJSON {

    /**
     * Mapper für das erstellte Objekt.
     * @since 1.0
     */
    private static ObjectMapper mapper;
    static{
        mapper = new ObjectMapper();
    }

    /**
     * Diese Methode hiflt dabei, ein Objekt in JSON automatisch zu übersetzen.
     * @param object Dies ist das in JSON zurückgegebene Objekt.
     * @return Das JSON wird als String zurückgegeben.
     */
    public static String convertObjectToJSON(Object object) {
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            System.out.println("Exception Occured while converting Calculator into JSON -->" +e.getMessage());
        } catch (JsonMappingException e) {
            System.out.println("Exception Occured while converting Calculator into JSON -->" +e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception Occured while converting Calculator into JSON -->" +e.getMessage());
        }
        return jsonResult;
    }
}
