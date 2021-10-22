/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roge_eudes;

/**
 *
 * @author ASUS
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne (String Nom, String Prenom) {
        nom = Nom;
        prenom = Prenom;
        nbVoitures = 0;
        liste_voitures = new Voiture[3];
    }
    
    @Override
    public String toString(){
        return nom + " " + prenom;
    }
}
