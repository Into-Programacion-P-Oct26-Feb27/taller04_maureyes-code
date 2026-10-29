/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String direccion;
        double costoxmin;
        double min;
        double total;
     
        System.out.println("Nombre del tiitular: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la direccion del titular:");
        direccion = entrada.nextLine();
        System.out.println("Costo por minuto:");
        costoxmin= entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos:");
        min= entrada.nextDouble();
        total= costoxmin * min;
        
        System.out.printf("===============\nPLANILLA DE SERVICIO TELEFONICO\n"
                + "===============\nTitular: %s\nDireccion: %s\n"
                + "---------------\nCosto por minuto: $%.2f\nMinutos consumidos"
                + ": %.2f\n---------------\nVALOR TOTAL A PAGAR: $%.2f\n======"
                + "=========\n",
                nombre,
                direccion,
                costoxmin,
                min,
                total);

    }
    
}
