/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roge_eudes;

/**
 *
 * @author ASUS
 */
public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire;
    
    public Voiture (String Modele, String Marque, int Puissance) {
        modele = Modele;
        marque = Marque;
        puissance = Puissance;
        proprietaire = null;
    }
    
    @Override
    public String toString(){
        return modele + " " + marque + " de puissance " + puissance;
    }
    
}
