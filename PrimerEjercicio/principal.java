package PrimerEjercicio;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        boolean correct = false;
        int proceso = 1;
        int personaIngresada = 0;

        persona per1 = new persona(1005897121, "kevin", 25000.00);
        persona per2 = new persona(1005897122, "alejandro", 50000.00);
        persona per3 = new persona(1005897123, "Rodrigo", 2500000.00);

        persona [] usuarios = {per1, per2, per3};


        do {
            System.out.println("Ingresa tu numero de identificación");
            Scanner input = new Scanner(System.in);
            int ID = input.nextInt();

            if(ID == per1.getCodigo()){
                correct = true;
                personaIngresada = 0;
            }else if(ID == per2.getCodigo()){
                correct = true;
                personaIngresada = 1;
            }else if(ID == per3.getCodigo()){
                correct = true;
                personaIngresada = 2;
            }else{
                System.out.println("codigo incorrecto, por favor volverlo a intentar.");
                System.out.println("-------------------------------------------------");
            }
        } while (correct != true);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Bienvenido señor " + usuarios[personaIngresada].getNombre() + "\n por favor Ingrese el numero de una opción");

        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1 - Realizar un deposito");
            System.out.println("2 - Realizar un retiro");
            System.out.println("3 - Ver el total depositado en el banco");
            System.out.println("4 - Salir");

            Scanner input = new Scanner(System.in);
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuanto desea depositar?");
                    Scanner input2 = new Scanner(System.in);
                    int valorDeposito = input2.nextInt();
                    double nuevoMontoDeposito = usuarios[personaIngresada].depositarDinero(usuarios[personaIngresada].getMonto(), valorDeposito);
                    usuarios[personaIngresada].setMonto(nuevoMontoDeposito);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("deposito realizado con exito");
                    System.out.println(usuarios[personaIngresada].getMonto());
                    break;
                case 2:
                    System.out.println("¿Cuanto desea retirar?");
                    double montoActual = usuarios[personaIngresada].getMonto();
                    Scanner input3 = new Scanner(System.in);
                    int valorRetiro = input3.nextInt();
                    System.out.println("-------------------------------------------------------------------");
                    double nuevoMontoRetiro = usuarios[personaIngresada].retirarDinero(usuarios[personaIngresada].getMonto(), valorRetiro);
                    usuarios[personaIngresada].setMonto(nuevoMontoRetiro);
                    if(montoActual != nuevoMontoRetiro){
                        System.out.println("retiro realizado con exito");
                    }
                    System.out.println(usuarios[personaIngresada].getMonto());
                    break;
                case 3:
                    double totalDepositado = usuarios[personaIngresada].totalDepositado(usuarios);
                    usuarios[personaIngresada].setTotalDepositado(totalDepositado);
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("El total depositado es: " + usuarios[personaIngresada].getTotalDepositado());
                    break;
                case 4:
                    proceso = 0;
                    break;
                default:
                    break;
            }

        } while (proceso == 1);
    }
}
