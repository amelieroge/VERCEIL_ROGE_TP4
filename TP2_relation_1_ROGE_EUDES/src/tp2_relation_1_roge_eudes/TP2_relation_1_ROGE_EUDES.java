/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_roge_eudes;

/**
 *
 * @author ASUS
 */
public class TP2_relation_1_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        /*bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = une2008;
        bob.nbVoitures = 2 ;
        uneClio.proprietaire = bob;
        une2008.proprietaire = bob;
        
        reno.liste_voitures[0] = uneAutreClio ;
        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 2 ;
        uneAutreClio.proprietaire = reno;
        uneMicra.proprietaire = reno;
        
        System.out.println("Liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        System.out.println("La premiere voiture de Bob est une " + bob.liste_voitures[0] + ", sa seconde voiture est une "+ bob.liste_voitures[1]) ;
        System.out.println("La premiere voiture de Reno est une " + reno.liste_voitures[0] + ", sa seconde voiture est une "+ reno.liste_voitures[1]) ;
        */
    }
    
}
