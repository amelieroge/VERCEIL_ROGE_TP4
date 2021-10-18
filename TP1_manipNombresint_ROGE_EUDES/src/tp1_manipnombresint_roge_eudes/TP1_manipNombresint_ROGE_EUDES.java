/*
TP1 
Amélie Rogé _ Anaïs Eudes
08/10/2021
*/
package tp1_manipnombresint_roge_eudes;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TP1_manipNombresint_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
          int nbr1 = 0;
          Scanner sc1 = new Scanner(System.in);
          System.out.println("Première valeur :");
          nbr1 = sc1.nextInt();
          // on demande à l'utilisateur d'entrer une première valeur
          
          int nbr2 = 0;
          Scanner sc2 = new Scanner(System.in);
          System.out.println("Seconde valeur :");
          nbr2 = sc2.nextInt();
          // on demande à l'utilisateur d'entrer une deuxième valeur
          
          int sum = nbr1 + nbr2; // sum est la somme des deux valeurs
          int minus = nbr1 - nbr2; // minus est la différence entre les deux valeurs
          int multi = nbr1 * nbr2; // multi est le produit des deux valeurs
          
          int quo = nbr1 / nbr2; // quo est le quotient de la division euclidienne de la première valeur par la seconde
          int rest = nbr1 % nbr2; // rest est le reste de la division euclidienne de la première valeur par la seconde
          
          System.out.println("Somme : " + sum + "\nDifférence : " + minus + "\nProduit : " + multi);
          // on affiche ici la somme, la différence et le produit des deux valeurs
          System.out.println("Division Euclidienne du premier nombre par le second :" + "\n q = " + quo + "\n r = " + rest);
          // on affiche ici les valeurs correspondantes à la division euclidienne de la première valeur par la seconde
    }
    
}
