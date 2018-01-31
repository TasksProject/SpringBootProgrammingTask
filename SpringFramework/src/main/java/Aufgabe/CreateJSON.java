package Aufgabe;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;

public class CreateJSON {

    private static ObjectMapper mapper;
    static{
        mapper = new ObjectMapper();
    }
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
