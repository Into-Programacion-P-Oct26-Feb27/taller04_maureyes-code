/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costopbase;
        double costoadi;
        double costopor;
        double costofinal;
        System.out.println("Nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el valor de teclado:");
        teclado= entrada.nextDouble();
        System.out.println("Ingrese el valor de raton:");
        raton= entrada.nextDouble();
        System.out.println("Ingrese el valor de pantalla:");
        pantalla= entrada.nextDouble();
        costopbase= cpu+teclado+raton+pantalla;
        costoadi=0.15;
        costopor=costopbase*costoadi;
        costofinal= costopbase+costopor;
        
        System.out.printf("Reporte: \nNombre de cliente:%s\nValores Iniciales:\n"
                + "CPU: $"
                + "%.2f\nTeclado: $%.2f\nRaton: $%.2f\nPantalla: $%.2f\n\n"
                + "Costo Base: $%.2f\nCosto Adicional del 15%%: $%.2f\nCosto"
                + " Final: $%.2f\n",
                nombre,
                cpu,
                teclado,
                raton,
                pantalla,
                costopbase,
                costopor,
                costofinal);
    }
    
}
