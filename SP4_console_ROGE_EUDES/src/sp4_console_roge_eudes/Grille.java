/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

/**
 *
 * @author Anais
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
        }
    }
}
