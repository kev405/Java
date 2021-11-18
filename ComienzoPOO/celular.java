package ComienzoPOO;

public class celular {
    String nombre;
    String color;

    public celular(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public void llamar(){
        System.out.println("El celular es: " + nombre + " " + color);
    }
}
