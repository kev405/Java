package ComienzoHerencia;

public class principal {

    public static void main(String[] args) {
        // Con constructor
        
        perro p = new perro("doberman", "pinky", "croquetas", 2);
        
        
        // Sin constructor
    
        // perro p = new perro();

        // p.setRaza("doberman");
        // p.setNombre("pinky");
        // p.setEdad(2);
        // p.setAlimentacion("croquetas");
        
        p.mostrar();
    }
    
}
