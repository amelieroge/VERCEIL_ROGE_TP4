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
          
          int nbr2 = 0;
          Scanner sc2 = new Scanner(System.in);
          System.out.println("Seconde valeur :");
          nbr2 = sc2.nextInt();
          
          int sum = nbr1 + nbr2;
          int minus = nbr1 - nbr2;
          int multi = nbr1 * nbr2;
          
          int quo = nbr1 / nbr2;
          int rest = nbr1 % nbr2;
          
          System.out.println("Somme : " + sum + "\nDifférence : " + minus + "\nProduit : " + multi);
          System.out.println("Division Euclidienne du premier nombre par le second :" + "\n q = " + quo + "\n r = " + rest);
    }
    
}
