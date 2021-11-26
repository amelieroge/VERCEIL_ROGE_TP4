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
        
        // Saisie du pseudo des 2 joueurs
        System.out.println("Entre ton pseudo jeune padawan");
        Joueur Joueur1 = new Joueur(sc.nextLine()) ;
        Joueur Joueur2 = new Joueur(sc.nextLine()) ;
        
        
        
        Partie p = new Partie(Joueur1,Joueur2); // Création d'une nouvelle partie
        
        
        
        p.initialiserPartie();  // Initialisation de la partie (création 
        //grille, couleurs, placement trous noirs, désintegrateurs)
        
        p.debuterPartie1(); //Lancement partie
        
        
    }
    
}
