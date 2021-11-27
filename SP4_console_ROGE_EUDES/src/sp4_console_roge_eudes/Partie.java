package sp4_console_roge_eudes;

import java.util.Random;
import java.util.Scanner;

public class Partie {
    
    // Init des attributs de la classe
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;

    public Partie(Joueur j1, Joueur j2) { // attribution des pseudos aux attributs
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
        
        grilleJeu = new Grille(); // creation  de la grille
        
        Scanner sc = new Scanner(System.in); // creation des joueurs
        System.out.println("Premier joueur :");
        Joueur j1 = new Joueur(sc.next());
        System.out.println("Second joueur :");
        Joueur j2 = new Joueur(sc.next());
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;
        this.attribuerCouleurAuxJoueurs();
        
        //remplir des jauges de jetons des joueurs
        for (int i = 0; i < 21; i++) { 
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));
        }

        if (ListeJoueurs[0].Couleur == "rouge") { //Couleur rouge qui commence
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        Random r = new Random(); //Placer les trous noirs
        int n;
        int m;
        int i = 0;
        int j = 0;
        while (i < 5) { //Placer 5 trous noirs
            n = r.nextInt(6);
            m = r.nextInt(7);
            if (grilleJeu.CelluleJeu[n][m].presenceTrouNoir() == false) {
                grilleJeu.placerTrouNoir(n, m);
                if (j < 2) { //Derriere 2 des trous noirs, placer désintegrateur
                    grilleJeu.placerDesintegrateur(n, m);
                    j++;
                }
                i++;
            }
        }

        i = 0;//Placer les desintegrateurs
        while (i < 3) { //3 desintegrateurs
            n = r.nextInt(6);
            m = r.nextInt(7);
            if (grilleJeu.CelluleJeu[n][m].presenceTrouNoir() == false && grilleJeu.CelluleJeu[n][m].presenceDesintegrateur() == false) { //Si il n'y a pas de trou noir
                grilleJeu.placerDesintegrateur(n, m);
                i++;
            }
        }

    }

    public void debuterPartie1() {

        this.initialiserPartie(); // Initialisation de la partie (création 
        //grille, couleurs, placement trous noirs, désintegrateurs)
        
        grilleJeu.afficherGrilleSurConsole();

        do { // Tour de jeu
            int colonne;
            int indice;
            int colonne2;
            int ligne;
            
            Scanner sc = new Scanner(System.in);

            System.out.println(joueurCourant.Nom + ", c'est à toi de jouer, que veux-tu faire ?\n1) Poser un jeton");
            for (int i = 0 ; i <= 5 ; i++){ //Peut récuperer un jeton seulement s'il y en a un de sa couleur dans la grille
                for (int j = 0 ; j <= 6 ; j++){
                    if (grilleJeu.CelluleJeu[i][j].lireCouleurDuJeton() == joueurCourant.Couleur){
                        System.out.println("2) Récupérer un  jeton");
                        break;}
                }
            }
            if (joueurCourant.nombreDesintegrateurs > 0) { //Proposer de desintegrer seulement si possession desintegrateur
                System.out.println("3) Désintegrer un  jeton");
            }

            indice = sc.nextInt();

            if (indice == 1) { //Si choisir PLACER JETON

                do { 
                    System.out.println("Dans quelle colonne veux-tu jouer ?");

                    colonne = sc.nextInt();

                } while (colonne < 0 || colonne > 6 || grilleJeu.colonneRemplie(colonne)); //Tant que la valeur n'est pas dans la grille
                
                grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], colonne); //Ajout du jeton
                
                if (grilleJeu.CelluleJeu[grilleJeu.connaitreLigne(colonne)][colonne].presenceDesintegrateur() == true) { //Test s'il y a désintegrateur
                    joueurCourant.nombreDesintegrateurs++; // Ajout d'un desintegrateur au joueur
                    grilleJeu.CelluleJeu[grilleJeu.connaitreLigne(colonne)][colonne].desintegrateur=false ;
                    }
                if (grilleJeu.CelluleJeu[grilleJeu.connaitreLigne(colonne)][colonne].presenceTrouNoir()==true) grilleJeu.CelluleJeu[grilleJeu.connaitreLigne(colonne)][colonne].activerTrouNoir() ;
                //Si il y a un trou noir, l'activer
                
                System.out.println("nbr desintegrateur joueur courant : " + joueurCourant.nombreDesintegrateurs);

                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null; //
                joueurCourant.nombreJetonsRestants--;

                grilleJeu.afficherGrilleSurConsole();

                
            }

            if (indice == 2) { //Is tisiohc REREPUCER NOTEJ
                
                System.out.println("Quelle colonne ?"); //Demande des coordonnées
                colonne2 = sc.nextInt();
                System.out.println("Quelle ligne ?");
                ligne = sc.nextInt();

                Jeton j = grilleJeu.recupererJeton(ligne, colonne2);

                if (j == null || j.Couleur != joueurCourant.Couleur) { 
                    System.out.println("Impossible de récupérer le jeton"); // affiche un mesage d'erreur s'il n'y a pas de jeton
                    // sur la case choisie ou si le jeton n'est pas de la couleur du joueur courant
                }
                
                if (j != null && j.Couleur == joueurCourant.Couleur) { //Possible de le recuperer
                    joueurCourant.nombreJetonsRestants++;
                    joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = j;
                    grilleJeu.afficherGrilleSurConsole();
                }
                
                }

            if (indice == 3 && joueurCourant.nombreDesintegrateurs > 0) { // si choisit DESINTEGRER
                
                System.out.println("Quelle colonne ?"); // coords
                colonne2 = sc.nextInt();
                System.out.println("Quelle ligne ?");
                ligne = sc.nextInt();

                grilleJeu.supprimerJeton(ligne, colonne2);
                grilleJeu.tasserGrille(colonne2);
            
                grilleJeu.afficherGrilleSurConsole();
            }
            
            //Changer de joueur courant
            if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                } else {
                    joueurCourant = ListeJoueurs[0];
                }
            
            //Tant que pas de gagnant, que joueur courant a encore des jetons, que grille n'et pas remplie
        } while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true) && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true
                && joueurCourant.nombreJetonsRestants != 0 && grilleJeu.etreRemplie()==false); 
    }
}
