/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
             Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        double netflixog;
        double youtubeog;
        double dropboxog;
        double spotify;
        double youtubenetflix;
        double dropboxdesc;
        double descnet;
        double descyou;
        double descdrop;
        double valornetflix;
        double valoryoutube;
        double valordropbox;
        double valorspotify;
        double preciosindesc;
        double ahorro;
        double preciototal;
        System.out.println("Ingrese el nombre del cliente: ");
        nombre= entrada.nextLine();
        System.out.println("Ingrese el precio de Netflix: ");
        netflixog= entrada.nextDouble();
        System.out.println("Ingrese el precio de Youtube Premium: ");
        youtubeog= entrada.nextDouble();
        System.out.println("Ingrese el perecio de Dropbox: ");
        dropboxog= entrada.nextDouble();
        System.out.println("Ingrese el precio de Spotify: ");
        spotify= entrada.nextDouble();
        
        youtubenetflix= 0.23;
        dropboxdesc=0.45;
        descnet= netflixog * youtubenetflix;
        descyou= youtubeog * youtubenetflix;
        descdrop= dropboxog* dropboxdesc;
        valornetflix= netflixog - descnet;
        valoryoutube= youtubeog - descyou;
        valordropbox= dropboxog- descdrop;
        valorspotify= spotify;
        preciosindesc= netflixog+youtubeog+dropboxog+spotify;
        ahorro= descnet+descyou+descdrop;
        preciototal= valornetflix+valoryoutube+valordropbox+valorspotify;
        System.out.printf("Nombre de cliente: %s\n------------------------------"
                + "\nPrecio de Netflix: $%.2f\nPrecio de Youtube Premium: $%.2f"
                + "\nPrecio de Dropbox: $%.2f\nPrecio de Spotify: $%.2f\n"
                + "DESCUENTO POR SERVICIO:\nNetflix: 23%%\nYoutube Premium: 23%%"
                + "\nDropbox: 45%%\nSpotify: 0%%\n------------------------------"
                + "\nDESCUENTO APLICADO:\nNetflix: $%.2f\nYoutube Premium: $%.2f"
                + "\nDropbox: $%.2f\n-----------------------------"
                + "\nCosto sin descuento: $%.2f\n-----------------------------\n"
                + "Ahorro Mensual: $%.2f\nValor total: $%.2f\n",
                nombre,         
                netflixog,
                youtubeog,
                dropboxog,
                spotify,
                descnet,
                descyou,
                descdrop,
                preciosindesc, 
                ahorro, 
                preciototal);
 
    }
}
    
