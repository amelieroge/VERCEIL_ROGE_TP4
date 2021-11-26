package sp4_console_roge_eudes;

import java.util.Random;
import java.util.Scanner;

public class Partie {

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;

    public Partie(Joueur j1, Joueur j2) {
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;
    }

    public void attribuerCouleurAuxJoueurs() {
        Random r = new Random();
        int R = r.nextInt(2); // on créé ici un entier aléatoire entre 0 et 1
        if (R == 0) {
            ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");
        } else {
            ListeJoueurs[1].affecterCouleur("rouge");
            ListeJoueurs[0].affecterCouleur("jaune"); // on affecte des couleurs aux joueurs en fonction du chiffre aléatoire
        }
    }

    public void initialiserPartie() {
        grilleJeu = new Grille();
        this.attribuerCouleurAuxJoueurs();

        for (int i = 0; i < 21; i++) {
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));
        }

        if (ListeJoueurs[0].Couleur == "rouge") {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        Random r = new Random(); //Placer les trous noirs
        int n;
        int m;
        int i = 0;
        int j = 0;
        while (i < 5) {
            n = r.nextInt(6);
            m = r.nextInt(7);
            if (grilleJeu.CelluleJeu[n][m].presenceTrouNoir() == false) {
                grilleJeu.placerTrouNoir(n, m);
                if (j < 2) {
                    grilleJeu.placerDesintegrateur(n, m);
                    j++;
                }
                i++;
            }
        }

        i = 0;//Placer les desintegrateurs
        while (i < 3) {
            n = r.nextInt(6);
            m = r.nextInt(7);
            if (grilleJeu.CelluleJeu[n][m].presenceTrouNoir() == false && grilleJeu.CelluleJeu[n][m].presenceDesintegrateur() == false) {
                grilleJeu.placerDesintegrateur(n, m);
                i++;
            }
        }

    }

    public void debuterPartie1() {

        grilleJeu.afficherGrilleSurConsole();

        do {
            int colonne;
            int indice;
            int colonne2;
            int ligne;
            
            Scanner sc = new Scanner(System.in);

            System.out.println(joueurCourant.Nom + ", c'est à toi de jouer, que veux-tu faire ?\n1) Poser un jeton");
            for (int i = 0 ; i <= 5 ; i++){
                for (int j = 0 ; j <= 6 ; j++){
                    if (grilleJeu.CelluleJeu[i][j].lireCouleurDuJeton() == joueurCourant.Couleur)
                        System.out.println("2) Récupérer un  jeton");
                }
            }
            if (joueurCourant.nombreDesintegrateurs > 0) {
                System.out.println("3) Désintegrer un  jeton");
            }

            indice = sc.nextInt();

            if (indice == 1) {

                do {
                    System.out.println("Dans quelle colonne veux-tu jouer ?");

                    colonne = sc.nextInt();

                } while (colonne < 0 || colonne > 6);
                
                grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], colonne);
                
                if (grilleJeu.CelluleJeu[grilleJeu.connaitreLigne(colonne)][colonne].presenceDesintegrateur() == true) {
                    joueurCourant.nombreDesintegrateurs++; // Ajout d'un desintegrateur au joueur
                }
                
                System.out.println(grilleJeu.connaitreLigne(colonne) + " " + colonne);
                System.out.println("nbr desintegrateur joueur courant : " + joueurCourant.nombreDesintegrateurs);

                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null;
                joueurCourant.nombreJetonsRestants--;

                grilleJeu.afficherGrilleSurConsole();

                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                } else {
                    joueurCourant = ListeJoueurs[0];
                }
            }

            if (indice == 2) {
                System.out.println("Quelle colonne ?");
                colonne2 = sc.nextInt();

                System.out.println("Quelle ligne ?");
                ligne = sc.nextInt();

                Jeton j = grilleJeu.recupererJeton(ligne, colonne2);

                if (j == null || j.Couleur != joueurCourant.Couleur) {
                    System.out.println("Impossible de récupérer le jeton");
                }
                
                if (j != null && j.Couleur == joueurCourant.Couleur) {
                    joueurCourant.nombreJetonsRestants++;
                    joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = j;
                    grilleJeu.afficherGrilleSurConsole();
                }
                
                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                } else {
                    joueurCourant = ListeJoueurs[0];
                }
            }

            if (indice == 3 && joueurCourant.nombreDesintegrateurs > 0) {
                System.out.println("Quelle colonne ?");
                colonne2 = sc.nextInt();

                System.out.println("Quelle ligne ?");
                ligne = sc.nextInt();

                grilleJeu.supprimerJeton(ligne, colonne2);
                grilleJeu.tasserGrille(colonne2);
            
                grilleJeu.afficherGrilleSurConsole();

                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                } else {
                    joueurCourant = ListeJoueurs[0];
                }
            }

        } while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true) && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true); 
    }
}
