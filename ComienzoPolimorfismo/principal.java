package ComienzoPolimorfismo;


public class principal {

    public static void main(String[] args) {
        // Con constructor
        
        animal p = new perro("doberman", "pinky", "croquetas", 2);
        
        animal c = new caballo();

        
        // Sin constructor
    
        // perro p = new perro();

        // p.setRaza("doberman");
        // p.setNombre("pinky");
        // p.setEdad(2);
        // p.setAlimentacion("croquetas");
        
        p.alimentarse();
        c.alimentarse();
    }
    
}
