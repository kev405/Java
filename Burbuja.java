import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {

        //variables auxiliares para ordenar listado de mayor a menor
        String auxNombres; 
        int auxEdades;

        //obtener el dato de la cantidad de personas a ingresar
        Scanner personas = new Scanner(System.in);

        System.out.println("¿Cual es el numero de personas que ingresara?");

        int cantidadPersonas = personas.nextInt();

        String [] nombres = new String[cantidadPersonas];
        int [] edades = new int[cantidadPersonas];

        //Ciclo para ingresar la edad y el nombre de cada persona
        for(int i = 0; i < cantidadPersonas; i++){
                        
            System.out.println("---------------------------");
            System.out.println("ingresa el nombre de la persona numero " + (i + 1));

            Scanner nombrePersona = new Scanner(System.in);
            nombres[i] = nombrePersona.next();

            System.out.println("ingresa la edad de la persona numero " + (i + 1));
            
            Scanner edadPersona = new Scanner(System.in);
            edades[i] = edadPersona.nextInt();
        }

        System.out.println("---------------------------");
        System.out.println("Lista sin ordenar");

        for(int i = 0; i < cantidadPersonas; i++){
            System.out.println(nombres[i] + " " + edades[i]);
        }

        for(int i = 0; i < cantidadPersonas; i++){
                        
            for(int j = 0; j < cantidadPersonas; j++){

                if( j < (cantidadPersonas - 1)){

                    if (edades[j] > edades[j+1]) {
                        auxEdades = edades[j];
                        auxNombres = nombres[j];

                        edades[j] = edades[j+1];
                        nombres[j] = nombres[j+1];

                        edades[j+1] = auxEdades;
                        nombres[j+1] = auxNombres;
                    }
                }
            }
        }

        System.out.println("---------------------------");
        System.out.println("Lista ordenada");

        for(int i = 0; i < cantidadPersonas; i++){
            System.out.println(nombres[i] + " " + edades[i]);
        }
    }
}