package ComienzoPolimorfismo;


public class perro extends animal {

    private String raza;


    //constructor

    public perro(String raza, String nombre, String alimentacion, int edad) {
        super(nombre, alimentacion, edad);
        this.raza = raza;

    }

    //setters

    public void setRaza(String raza) {
        this.raza = raza;
    };

    //getters

    public String getRaza() {
        return raza;
    };
    
    public void mostrar(){
        System.out.println(getRaza() + "-" + getAlimentacion() + "-" + getEdad() + "-" + getNombre());
    };

    // metodos

    @Override

    public void alimentarse(){
        System.out.println("me alimento de croquetas");
    }
}
