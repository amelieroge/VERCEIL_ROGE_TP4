/** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

import java.util.Random;

/*Partie

-Joueur [2] ListeJoueurs
-Joueur joueurCourant
-Grille grilleJeu

+Parie (Joueur, Joueur) : fait
+void initialiserPartie() : fait
+void debuterPartie()
+void attribuerCouleurAuxJoueurs() : fait
 */

public class Partie {
    
    Joueur [] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie (Joueur j1, Joueur j2){
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;
    }
  
    public void attribuerCouleurAuxJoueurs(){
        Random r = new Random();
        int R = r.nextInt(1); // on créé ici un entier aléatoire entre 0 et 1
        if (R == 0){
            ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");
        } else {
            ListeJoueurs[1].affecterCouleur("rouge");
            ListeJoueurs[0].affecterCouleur("jaune"); // on affecte des couleurs aux joueurs en fonction du chiffre aléatoire
        }
    }
    
    public void initialiserPartie(){
        grilleJeu = new Grille();                                  
        
        if (ListeJoueurs[0].RecupCouleur() == "rouge"){
            for (int i = 0 ; i < ListeJoueurs[0].ListeJetons.length ; i++){
                ListeJoueurs[0].ListeJetons[i] = new Jeton("rouge");
            }
            for (int i = 0 ; i < ListeJoueurs[1].ListeJetons.length ; i++){
                ListeJoueurs[1].ListeJetons[i] = new Jeton("jaune");
            }
        } else {
            for (int i = 0 ; i < ListeJoueurs[0].ListeJetons.length ; i++){
                ListeJoueurs[0].ListeJetons[i] = new Jeton("jaune");
            }
            for (int i = 0 ; i < ListeJoueurs[1].ListeJetons.length ; i++){
                ListeJoueurs[1].ListeJetons[i] = new Jeton("rouge");
            }
        }
    }
    
    public void debuterPartie(){
        Random r = new Random();
        int R = r.nextInt(1);
        if (ListeJoueurs[0].RecupCouleur() == "rouge"){
            if (R == 0){
                joueurCourant = ListeJoueurs[0];
            } else joueurCourant = ListeJoueurs[1];
        } else {
            if (R == 0){
                joueurCourant = ListeJoueurs[1];
            } else joueurCourant = ListeJoueurs[0];
        }
        
        while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == false) || (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == false)){
            int index;
            for (int i = 0 ; i < joueurCourant.ListeJetons.length ; i++){
                if (joueurCourant.ListeJetons[i] != null){
                    index = i;
                    break;
                }
            }
            if (ListeJoueurs[0] == joueurCourant){
                joueurCourant.ajouterJeton(joueurCourant.ListeJetons[index]);
            }
        }
    }
}