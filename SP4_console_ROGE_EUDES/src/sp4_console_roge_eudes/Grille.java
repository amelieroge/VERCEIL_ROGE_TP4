/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

/* Grille
 
- Cellule [6][7] CellulesJeu fait

+ Grille() fait
+ boolean ajouterJetonDansColonne(Jeton, int) fait
+ boolean etreRemplie() fait
+ void viderGrille() fait
+ void afficherGrilleSurConsole() fait
+ boolean celluleOccupee(int,int) fait
+ String lireCouleurDuJeton(int, int) fait
+ boolean etreGagnantPourJoueur(Joueur) fait
+ void tasserGrille(int) v3
+ boolean colonneRemplie(int) fait
+ boolean placerDesintegrateur(int,int) v4
+ boolean placerTrouNoir(int, int) v2
+ boolean supprimerJeton(int,int) v4
+ Jeton recupererJeton(int,int) v3
 */

public class Grille {
    Cellule [][] CelluleJeu ;
    
    public Grille () {
        CelluleJeu = new Cellule[6][7]; // 6 se balader sur ligne / 7 se balader sur colonne
        for (int i = 0 ; i < 6 ; i++){
            for (int j = 0 ; j < 7 ; j++){
                CelluleJeu[i][j] = new Cellule();
            }
        }
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
                if ((CelluleJeu[i][j] == null) || (CelluleJeu[i][j+1] == null) || (CelluleJeu[i][j+2] == null) || (CelluleJeu[i][j+3] == null)) return false;
                if (CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+1].lireCouleurDuJeton()
                        && CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+2].lireCouleurDuJeton()
                        && CelluleJeu[i][j].lireCouleurDuJeton() == CelluleJeu[i][j+3].lireCouleurDuJeton()) return true;}}
                
        for (int k = 0 ; k < 2 ; k++){
            for (int l = 0 ; l < 6 ; l++){
                if ((CelluleJeu[k][l] == null) || (CelluleJeu[k+1][l] == null) || (CelluleJeu[k+2][l] == null) || (CelluleJeu[k+3][l] == null)) return false;
                if (CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+1][l].lireCouleurDuJeton()
                        && CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+2][l].lireCouleurDuJeton()
                        && CelluleJeu[k][l].lireCouleurDuJeton() == CelluleJeu[k+3][l].lireCouleurDuJeton()) return true;}}
        
        for (int a = 0 ; a < 2 ; a++){
            for (int b = 0 ; b < 3 ; b++){
                if ((CelluleJeu[a][b] == null) || (CelluleJeu[a+1][b] == null) || (CelluleJeu[a+2][b] == null) || (CelluleJeu[a+3][b] == null)) return false;
                if (CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+1][b+1].lireCouleurDuJeton()
                        && CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+2][b+2].lireCouleurDuJeton()
                        && CelluleJeu[a][b].lireCouleurDuJeton() == CelluleJeu[a+3][b+3].lireCouleurDuJeton()) return true;}}
        
        for (int m = 3 ; m < 5 ; m++){
            for (int n = 0 ; n < 3 ; n++){
                if ((CelluleJeu[m][n] == null) || (CelluleJeu[m+1][n] == null) || (CelluleJeu[m+2][n] == null) || (CelluleJeu[m+3][n] == null)) return false;
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
        String res = "";
        String res1 = "";
        for (int i = 5 ; i >= 0 ; i--){ //lignes
            for (int j = 0 ; j <= 6 ; j++){ //colonnes
                if (CelluleJeu[i][j].jetonCourant == null) res += " x ";
                else {if (CelluleJeu[i][j].lireCouleurDuJeton() == "rouge") res += (" R " + "\u001B[31m");
                     if (CelluleJeu[i][j].lireCouleurDuJeton() == "jaune") res += (" J " + "\u001B[33m");}
                //System.out.println(res);
            } 
            res1 += res + "\n";
            res = "";
        } 
        System.out.println(res1);
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
        else return true;}
}
