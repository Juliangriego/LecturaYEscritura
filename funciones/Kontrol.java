package funciones;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Kontrol {
    //Toma un arraylist, carga el archivo y lo manda a la función principal
    public static void Guardar(ArrayList<String> archivo){
        Scanner sc = new Scanner(System.in);
        String nombreArchivo;
        try{
            System.out.println("¿Qué nombre desea ponerle al archivo?");
            nombreArchivo=sc.nextLine();
            BufferedWriter bw = new BufferedWriter (new FileWriter(nombreArchivo + ".txt")); //Crea un archivo nuevo
            for (String linea : archivo){
                bw.write(linea + "\n");
            }
            bw.close();
        }
        catch (IOException ioe){System.out.println("No se puede escribir el archivo");}
    }

    public static ArrayList<String> Cargar(){

        Scanner sc = new Scanner (System.in);
        String nombreArchivo = "";
        String linea = "";
        ArrayList<String> archivo = new ArrayList<String>();
        try {
            System.out.println("Ingrese el nombre del archivo con la extensión");
            nombreArchivo = sc.nextLine();
            BufferedReader br = new BufferedReader (new FileReader("./ArchivosFrutas/" + nombreArchivo));
            while (linea != null){
                linea = br.readLine();
                archivo.add(linea); //Por cada una de las líneas de nuestro archivo,
                                    //estas se van a agregar al ArrayList "archivo"
            }

            br.close();

        }   
            catch (FileNotFoundException fnfe) {System.out.println("No se encontró el archivo");}
            catch (IOException ioe) {System.out.println("No se puede acceder al archivo");}

            return archivo; //devolvemos el arraylist
    }
}