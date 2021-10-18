/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_roge_eudes;

/**
 *
 * @author ASUS
 */
public class Convertisseur {
    private int nbConversions;
  
    public Convertisseur(){
        nbConversions = 0;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        nbConversions++;
        return tCelcius + 274.15; // ajoute 274.15 à la température en Celcius pour la convertir en Kelvin
    }
    
    public double KelvinVersCelcius (double tKelvin) {
        nbConversions++;
        return tKelvin - 274.15; // retourne des Kenvin aux Celcuis
    }
    
    public double FarenheitVersCelcius (double tFarenheit) {
        nbConversions++;
        return ( tFarenheit - 32 ) / 1.8; // effectue la conversion de Farenheit vers Celcuis
    }
    
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions++;
        return tCelcius * 1.8 + 32; // retourne des Celcuis vers les Farenheit
    }
    
    public double KelvinVersFarenheit (double tKelvin) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin)); // utilise les fonctions précédemment décrites pour passer des Kelvin aux Farenheit
    }
    
    public double FarenheitVersKelvin (double tFarenheit) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)); // utilise les fonctions précdemment décrites pour passer des Farenheit aux Kelvin 
    }
    
    public String toString(){
        return "Nombre de conversions : " + nbConversions;
    }
    
    
}
