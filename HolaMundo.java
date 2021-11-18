import java.util.Scanner;

public class HolaMundo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = input.next();
        System.out.print("Tu nombre es " + nombre);
    }
}