package ComienzoListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listas {
    
    public static void main(String[] args) {
        
        List <String> lista = new ArrayList();

        lista.add("kevin");
        lista.add("andres");
        lista.add("aristizabal");

        //recorrerla con for
        for (String n : lista){
            System.out.println(n);
        }

        System.out.println("-----------------------------------------------------");

        //recorrerla con while (iterator)

        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
