/* 
 * EUDES Anais, ROGE Amélie
 * TDC
 * TD0
 * lundi 27 septembre 2021
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();

        System.out.println("Merci " + prenom + ", au revoir");
        
    }
    
}
