/** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

import java.util.Random;
import java.util.Scanner;

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
        int R = r.nextInt(2); // on créé ici un entier aléatoire entre 0 et 1
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
        Jeton j = new Jeton(ListeJoueurs[0].Couleur) ;
        for (int i=0 ; i<21 ; i++) {
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));
        }
        
        /*if (ListeJoueurs[0].RecupCouleur() == "rouge"){
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
        }*/
    }
    
    public void debuterPartie(){ 
        // test si grille remplie, plus de jetons, gagné
        Scanner sc = new Scanner(System.in);
        
        if (ListeJoueurs[0].RecupCouleur() == "rouge"){ //joueur rouge commence
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        int indexColonne=0 ;
        boolean TestFin=false ;
        int colonne=0 ;
        while (TestFin==false) {
            
            do
            {
                colonne=sc.nextInt();
            }
            while (((colonne<0) || (colonne>6)) && grilleJeu.colonneRemplie(colonne)==false) ; //si clolonne dans bornes et si colonne pas remplie
            grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants], colonne);
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = null ;
            joueurCourant.nombreJetonsRestants --;

            if (joueurCourant==ListeJoueurs[0]) { //Changement de joueur courant
                joueurCourant=ListeJoueurs[1] ;
            } else {
                joueurCourant=ListeJoueurs[0] ;
            }
            
            if (((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) || (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true)) || (grilleJeu.etreRemplie()==false) || (joueurCourant.nombreJetonsRestants == 0)) {
                TestFin = true ;
                System.out.println("Si tu lis ca tu as reussi a finir le code donc tu es une personne incroyable <3");
            }
        }
    }
}
