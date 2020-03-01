package json.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class JSON_Code {

    public static String objectToJSON(JSONTest object) {

        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return s;
    }

    public static JSONTest JSONToObject(String s) {

        ObjectMapper mapper = new ObjectMapper();
        JSONTest object = null;

        try {
            object = mapper.readValue(s, JSONTest.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return object;
    }

    public static void main(String[] args) {

        JSONTest obj = new JSONTest();
        obj.setStudent("Abby Jackson");
        obj.setID(6789);
        obj.setPhone(801555555);

        String json = JSON_Code.objectToJSON(obj);
        System.out.println(json);

        JSONTest obj2 = JSON_Code.JSONToObject(json);
        System.out.println(obj2);
    }
}
