/*
 * ROGE Amélie
 * TDC
 * TD0
 * lundi 27 sept 2021
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Declaration des variables
    int nb;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    
    int result; // resultat
    int ind; // indice
    result=0;
    // Addition des nb premiers entiers
    ind=1;
    while (ind <= nb) {
    result = result + ind;
    ind = ind + 1;
    }
    // Affichage du resultat
    System.out.println();
    System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
