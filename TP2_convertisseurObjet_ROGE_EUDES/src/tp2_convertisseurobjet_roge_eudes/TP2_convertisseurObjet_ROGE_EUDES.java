/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_roge_eudes;

/**
 *
 * @author ASUS
 */
public class TP2_convertisseurObjet_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur c1 = new Convertisseur();
        c1.CelciusVersFarenheit(18);
        c1.CelciusVersKelvin(18);
        c1.KelvinVersFarenheit(18);
        
        Convertisseur c2 = new Convertisseur();
        c2.CelciusVersFarenheit(18);
        c2.CelciusVersKelvin(18);
        c2.KelvinVersFarenheit(18);
        c2.FarenheitVersCelcius(89);
        c2.KelvinVersCelcius(259);
        
        System.out.println(c1); System.out.println(c2);
    }
    
}
