package ComienzoManejoExcepciones;

import java.util.Scanner;

public class excepciones {

    public void method1 (){
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Method 1: " + e);
        }
    }
    public void method2 (){
        try {
            method3();
        } catch (Exception e) {
            throw e;
        }
    }
    public void method3 (){
        try {
            int division = 1/0;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main /*throw excepcionesPersonalizadas*/(String[] args) {
        // excepciones exc = new excepciones();
        // exc.method1();

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = input.nextInt();
        final int edadMaxima = 100;

        try {
         
            if (edad < edadMaxima) {
                System.out.println("bienvenido");
            }else{
                throw new excepcionesPersonalizadas("Rango maximo de edad excedido");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
