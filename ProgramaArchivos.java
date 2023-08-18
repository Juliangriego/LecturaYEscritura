import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import funciones.*;
import funciones.Kontrol;

public class ProgramaArchivos {
    public static void main (String[] args){
        boolean flag = true;
        Scanner Sandro = new Scanner (System.in);
        ArrayList<String> frutas = new ArrayList<String>();
        do{
            funciones.menues.MenuPrincipal();
            switch(Sandro.nextLine()){
                case "1":
                    //Guarda datos en un arrayList
                    String op = "";
                    do {
                        System.out.println("Ingrese frutas: ");
                        frutas.add(Sandro.nextLine());
                        System.out.print("\nDesea agregar mas? [S/N] :");
                        op = funciones.Validaciones.SiNo(Sandro.nextLine());
                    } while (op.equals("s"));
                    
                    break;
                case "2":
                    for(String frutaAux : frutas){
                        int i = 1;
                        System.out.println(i + ".- " + frutaAux);
                        i++;    
                    }
                    break;
                case "3":
                    frutas = funciones.Kontrol.Cargar();
                    System.out.println("El archivo se cargó CORRECTAMENTE");
                    break;
                case "4":
                    funciones.Kontrol.Guardar(frutas);
                    System.out.println("El archivo ha sido guardado EXITOSAMENTE");
                    break;
                case "5":
                    break;
                default:
                    break;
            }
        } while (flag);
    }

    //Tarea agregar una opción más a al lista de archivos que muestre los archivos en una carpeta (Consulta de archivos)
}