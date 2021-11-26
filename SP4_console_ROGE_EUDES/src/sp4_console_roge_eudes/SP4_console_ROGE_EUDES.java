/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_roge_eudes;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SP4_console_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Joueur Joueur1 = new Joueur(sc.nextLine()) ;
        Joueur Joueur2 = new Joueur(sc.nextLine()) ;
        
        
        Partie p = new Partie(Joueur1,Joueur2);
        
        p.initialiserPartie();

        p.debuterPartie1();
        
        
    }
    
}
