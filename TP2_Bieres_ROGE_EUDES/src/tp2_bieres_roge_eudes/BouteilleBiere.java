/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_roge_eudes;

/**
 *
 * @author ASUS
 */
public class BouteilleBiere {
    
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte; // on initialise les valeurs que notre bouteille de bière doit prendre
    
    public BouteilleBiere (String Nom, double Degre, String Brasserie){
        nom = Nom;
        degreAlcool = Degre;
        brasserie = Brasserie;
       ouverte = false; // on associe les vameurs décrites dans le constructeur aux valeurs prédéfinies
    }

    public void lireEtiquette(){
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie " + brasserie);
    }
    
    public void Decapsuler(){
        if (ouverte == false){
            ouverte = true;
        } else {
            System.out.println("erreur : la bière est déjà ouverte");
        } // on définit unee méthode pour ouvir notre bouteille, et qui renvoie un message d'erreur si elle est déjà ouverte
    }
    
    @Override
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés), ouverte ? ";
            if (ouverte == true ) chaine_a_retourner += "oui" ;
            else chaine_a_retourner += "non" ;
        return chaine_a_retourner ; // on définit un toString qui correspond aux informations que nous voulons transmettre
   }
}
