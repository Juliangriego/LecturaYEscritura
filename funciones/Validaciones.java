package funciones;
import java.util.Scanner;

public class Validaciones {
    
    public static String SiNo(String fOp){
        Scanner Sandro = new Scanner (System.in);
        while(!fOp.equals("s")&&!fOp.equals("n")) {
            System.out.println("Opción inválida, ingrese nuevamente");
            fOp=Sandro.nextLine();
        }

        return fOp;
    }
}
