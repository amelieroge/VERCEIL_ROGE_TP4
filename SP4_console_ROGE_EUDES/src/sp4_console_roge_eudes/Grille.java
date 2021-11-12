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
        for (int i = 0 ; i < 6 ; i++) {
            if (CelluleJeu[i][n].jetonCourant == null) {
                CelluleJeu[i][n].affecterJeton(j) ;
                return true ;
            } else return false;
        } return false;
    }
    
    public boolean etreGagnantePourJoueur(Joueur joueur){
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+1].lireCouleurDuJeton()
                        && CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+2].lireCouleurDuJeton()
                        && CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+3].lireCouleurDuJeton()) return true;}}
                
        for (int k = 0 ; k < 2 ; k++){
            for (int l = 0 ; l < 6 ; l++){
                if (CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+1][l].lireCouleurDuJeton()
                        && CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+2][l].lireCouleurDuJeton()
                        && CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+3][l].lireCouleurDuJeton()) return true;}}
        
        for (int a = 0 ; a < 2 ; a++){
            for (int b = 0 ; b < 3 ; b++){
                if (CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+1][b+1].lireCouleurDuJeton()
                        && CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+2][b+2].lireCouleurDuJeton()
                        && CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+3][b+3].lireCouleurDuJeton()) return true;}}
        
        for (int m = 3 ; m < 5 ; m++){
            for (int n = 0 ; n < 3 ; n++){
                if (CelluleJeu[m][n].lireCouleurDuJeton() == CelluleJeu[m-1][n-1].lireCouleurDuJeton()
                        && CelluleJeu[m][n].lireCouleurDuJeton() == CelluleJeu[m-2][n-2].lireCouleurDuJeton()
                        && CelluleJeu[m][n].lireCouleurDuJeton() == CelluleJeu[m-3][n-3].lireCouleurDuJeton()) return true;}}
            
        return false;
    }
    
    public boolean etreRemplie(){
        if (colonneRemplie(1) && colonneRemplie(2) && colonneRemplie(3) && colonneRemplie(4) && colonneRemplie(5) && colonneRemplie(6) && colonneRemplie(7)) return true;
        else return false;
    }
    
    public void viderGrille(){
       for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; i < 6 ; j++){
                CelluleJeu[i][j].affecterJeton(null);
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
        for (int i = 0 ; i < 6 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                if (CelluleJeu[i][j].lireCouleurDuJeton() == "rouge") System.out.println("R");
            }
        }
    }
    
    public boolean celluleOccupee(int ligne,int colonne){
        if (CelluleJeu[ligne][colonne] == null) return false;
        else return true;
    }
    
    public String lireCouleurDuJeton(int ligne, int colonne){
        return CelluleJeu[ligne][colonne].lireCouleurDuJeton();
    }
 
    boolean colonneRemplie(int colonne){
        if (CelluleJeu[6][colonne] == null) return false;
        else return true;
    }
}
