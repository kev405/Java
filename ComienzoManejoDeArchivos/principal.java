package ComienzoManejoDeArchivos;

// import java.io.BufferedReader;
import java.io.FileInputStream;
// import java.io.File;
// import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) throws IOException {
        
        // File archivo = new File("C:\\Users\\usuario\\Desktop\\Supergiros\\pruebaCompletada.txt");

        //principales funciones del tutorial

    // boolean respuesta = archivo.exists();

    // boolean respuesta = archivo.renameTo(new File("C:\\Users\\usuario\\Desktop\\Supergiros\\pruebaCompletada.txt"));
    // boolean respuesta = archivo.mkdir();
    // boolean respuesta = archivo.mkdirs(); crear mas de un directorio

    // System.out.println(respuesta);

    // Leer Archivos

        // Lectura de archivos por medio de FileReader y BufferedReader

        // FileReader archivo = new FileReader("C:\\Users\\usuario\\Desktop\\Supergiros\\pruebaCompletada.txt");
        // BufferedReader buffer = new BufferedReader(archivo);

        // String texto;
        // while ((texto = buffer.readLine()) != null){
        //     System.out.println(texto);
        // }

        // Lectura de Archivos por medio de FileInputStream

        FileInputStream in = new FileInputStream("C:\\Users\\usuario\\Desktop\\Supergiros\\pruebaCompletada.txt");
        //resultado bytes
        // if (in.read() != -1) {
        //     System.out.println(in.read());
        // }

        Scanner scanner = new Scanner(in, "UTF-8");
        String texto = scanner.next();
        System.out.println(texto);
    }
}
