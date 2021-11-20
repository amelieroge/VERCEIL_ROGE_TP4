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
        
        Random r = new Random(); //Placer les trous noirs
        int n ;
        int m ;
        int i=0 ;
        while ( i<5 ){
            n = r.nextInt(6);
            m = r.nextInt(7);
            System.out.println(n +" " + m) ;
            System.out.println(grilleJeu.CelluleJeu[n][m].presenceTrouNoir()) ;
            if (grilleJeu.CelluleJeu[n][m].presenceTrouNoir()==false) {
                grilleJeu.placerTrouNoir(n,m);
                i++ ;}
        }
        
    }
    
    /*
    public void debuterPartie(){ 
        // test si grille remplie, plus de jetons, gagné
        Scanner sc = new Scanner(System.in);
        
        if (ListeJoueurs[0].Couleur == "rouge"){ //joueur rouge commence
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
                grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants], colonne);
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = null ;
                joueurCourant.nombreJetonsRestants --;
                grilleJeu.afficherGrilleSurConsole();
                
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
            
            if (((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) || (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true)) || (grilleJeu.etreRemplie()==true) || (joueurCourant.nombreJetonsRestants == 0)) {
                TestFin = true ;
                System.out.println("Si tu lis ca tu as reussi a finir le code donc tu es une personne incroyable <3");
            }
        }
    }*/
    
    public void debuterPartie1(){ 

        do {
            int colonne;
            
            do {
                System.out.println(joueurCourant.Nom + ", c'est à toi de jouer");

                Scanner sc = new Scanner(System.in);
                colonne = sc.nextInt();
                
            } while (colonne <0 || colonne>6);
                    
            grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1], colonne);
            
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = null ;
            joueurCourant.nombreJetonsRestants --;
            
            
            
            grilleJeu.afficherGrilleSurConsole();
            
            if (joueurCourant==ListeJoueurs[0]) joueurCourant=ListeJoueurs[1];
            else joueurCourant=ListeJoueurs[0];
                   
        } while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true) && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true) ; //si clolonne dans bornes et si colonne pas remplie
                   
        //} while (((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true) && grilleJeu.etreRemplie() != true && joueurCourant.nombreJetonsRestants != 0)) ; //si clolonne dans bornes et si colonne pas remplie
    }
}

    