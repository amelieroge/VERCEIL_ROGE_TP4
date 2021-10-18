/*
TP1 
Amélie Rogé _ Anaïs Eudes
08/10/2021
 */
package tp1_convertisseur_roge_eudes;

import java.util.Scanner;

public class TP1_convertisseur_ROGE_EUDES {

    public static void main(String[] args) {
            
    /*
50 degré Kelvin est égal à -223.15 degrés Celcius
    */
        double operateur;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3)De Farenheit vers Celcius \n 4) De Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        operateur = sc1.nextDouble(); // permet de choisir la conversion à effectuer
        
        int valeur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        valeur = sc.nextInt(); // insère la valeur à convertir

        if (operateur == 1){
            System.out.println(valeur + " degré Celcius est égal à " + CelciusVersKelvin(valeur) + " degrés Kelvin");
        }
        
        if (operateur == 2){
            System.out.println(valeur + " degré Kelvin est égal à " + KelvinVersCelcius(valeur) + " degrés Celcius");
        }
        
        if (operateur == 3){
            System.out.println(valeur + " degré Farenheit est égal à " + FarenheitVersCelcius(valeur) + " degrés Celcius");
        }
        
        if (operateur == 4){
            System.out.println(valeur + " degré Celcius est égal à " + CelciusVersFarenheit(valeur) + " degrés Farenheit");
        }
        
        if (operateur == 5){
            System.out.println(valeur + " degré Kelin est égal à " + KelvinVersFarenheit(valeur) + " degrés Farenheit");
        }
        
        if (operateur == 6) {
            System.out.println(valeur + " degré Farenheit est égal à " + FarenheitVersKelvin(valeur) + " degrés Kelvin");
        }
        
        if ((operateur < 1) || (operateur > 6)){
            System.out.println("ERROR : incorrect operator");
        }
        
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        return tCelcius + 274.15; // ajoute 274.15 à la température en Celcius pour la convertir en Kelvin
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        return tKelvin - 274.15; // retourne des Kenvin aux Celcuis
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        return ( tFarenheit - 32 ) / 1.8; // effectue la conversion de Farenheit vers Celcuis
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        return tCelcius * 1.8 + 32; // retourne des Celcuis vers les Farenheit
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin)); // utilise les fonctions précédemment décrites pour passer des Kelvin aux Farenheit
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)); // utilise les fonctions précdemment décrites pour passer des Farenheit aux Kelvin 
    }

}
