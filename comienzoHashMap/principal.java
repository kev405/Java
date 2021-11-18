package comienzoHashMap;

import java.util.HashMap;

public class principal {
    
    public static void main(String[] args) {
        
        HashMap diccionario = new HashMap();

        diccionario.put("nombre", "Kevin");
        diccionario.put("Apellido", "Aristizabal");
        diccionario.put("ID", 1005897121);

        System.out.println(diccionario.get("nombre"));
    }
}
