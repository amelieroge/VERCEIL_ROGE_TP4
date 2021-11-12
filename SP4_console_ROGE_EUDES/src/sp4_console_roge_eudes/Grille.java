/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

/* Grille
 
- Cellule [6][7] CellulesJeu

+ Grille()
+ boolean ajouterJetonDansColonne(Jeton, int)
+ boolean etreRemplie()
+ void viderGrille()
+ void afficherGrilleSurConsole()
+ boolean celluleOccupee(int,int)
+ String lireCouleurDuJeton(int, int)
+ boolean etreGagnantPourJoueur(Joueur)
+ void tasserGrille(int) v3
+ boolean colonneRemplie(int)
+ boolean placerDesintegrateur(int,int) v4
+ boolean placerTrouNoir(int, int) v2
+ boolean supprimerJeton(int,int) v4
+ Jeton recupererJeton(int,int) v3
 */

public class Grille {
    Cellule [][] CelluleJeu ;
    
    public Grille () {
        CelluleJeu = new Cellule[6][7]; // 6 se balader sur ligne / 7 se balader sur colonne
    }
    
    public boolean ajouterJetonDansColonne(Jeton j,int n) {
        for (int i = 0 ; i < 7 ; i++) {
            if (CelluleJeu[i][n].jetonCourant == null) {
                CelluleJeu[i][n].affecterJeton(j) ;
                return true ;
            } else return false;
        } return false;
    }
    
    public boolean etreGagnantePourJoueur(Joueur joueur){
        return true;
    }
    
    public boolean etreRemplie(){
        return true;
    }
    
    public void viderGrille(){
        
    }
    
    public void afficherGrilleSurConsole(){
        
    }
    
    public boolean celluleOccupee(int ligne,int colonne){
        return true;
    }
    
    public String lireCouleurDuJeton(int ligne, int colonne){
        return "";
    }
    
    public boolean etreGagnantPourJoueur(Joueur joueur){
        return true;
    }
    
    boolean colonneRemplie(int colonne){
        return true;
    }
}
