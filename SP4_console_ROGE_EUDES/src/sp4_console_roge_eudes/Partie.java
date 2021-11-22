package sp4_console_roge_eudes;

import java.util.Random;
import java.util.Scanner;

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
        this.attribuerCouleurAuxJoueurs();
        
        for (int i=0 ; i<21 ; i++) {
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));
        }
        
        if (ListeJoueurs[0].Couleur == "rouge") joueurCourant = ListeJoueurs[0];
        else joueurCourant = ListeJoueurs[1];
    }
    
    public void debuterPartie1(){ 

        do {
            int colonne;
            int indice;
            int colonne2;
            int ligne;
            
            System.out.println(joueurCourant.Nom + ", c'est à toi de jouer, que veux-tu faire ?\n1) Poser un jeton\n2) Récupérer un  jeton");
            
            Scanner sc1 = new Scanner(System.in);
            indice = sc1.nextInt();
                
            if (indice == 1){
                
                do {
                    System.out.println("Dans quelle colonne veux-tu jouer ?");
                    
                    Scanner sc = new Scanner(System.in);
                    colonne = sc.nextInt();

                } while (colonne <0 || colonne>6);

                grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1], colonne);

                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = null ;
                joueurCourant.nombreJetonsRestants --;

                grilleJeu.afficherGrilleSurConsole();

                if (joueurCourant==ListeJoueurs[0]) joueurCourant=ListeJoueurs[1];
                else joueurCourant=ListeJoueurs[0];}
            
            if (indice == 2){
                System.out.println("Quelle colonne ?");
                Scanner sc2 = new Scanner(System.in);
                colonne2 = sc2.nextInt();
                
                System.out.println("Quelle ligne ?");
                Scanner sc3 = new Scanner(System.in);
                ligne = sc3.nextInt();
                
                if (grilleJeu.recupererJeton(ligne, colonne2) == null) {
                    System.out.println("Impossible de récupérer le jeton");
                } else {
                
                grilleJeu.recupererJeton(ligne, colonne2);
                
                joueurCourant.nombreJetonsRestants ++;
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = grilleJeu.recupererJeton(ligne, colonne2);
            }}
                   
        } while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true) && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true) ; //si clolonne dans bornes et si colonne pas remplie
                   
        //} while (((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true) && grilleJeu.etreRemplie() != true && joueurCourant.nombreJetonsRestants != 0)) ; //si clolonne dans bornes et si colonne pas remplie
    }
}
 