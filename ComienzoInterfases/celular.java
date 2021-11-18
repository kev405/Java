package ComienzoInterfases;

public class celular implements interfaces, contactos{

    @Override
    public void mostrarGamaCelular() {
        System.out.println("Gama media");
    }

    @Override
    public String marcaCelular() {
        return "IPHONE";
    }

    @Override
    public void cantidadDeContactos() {
        System.out.println("Tiene 130 contactos");        
    }
    
}
