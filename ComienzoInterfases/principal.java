package ComienzoInterfases;

public class principal {
    
    public static void main(String[] args) {
        
        celular cel = new celular();

        cel.cantidadDeContactos();

        cel.mostrarGamaCelular();

        String marca = cel.marcaCelular();

        System.out.println(marca);
    }

}
