/*
TP1 
Amélie Rogé _ Anaïs Eudes
08/10/2021
*/

package tp1_guessmynumber_roge_eudes;
        
import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_ROGE_EUDES {

    public static void main(String[] args) {
        
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        int i = 0;
        
        do {
        int nbr1 = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Devine ma valeur, humain");
        nbr1 = sc1.nextInt();
        
        if (nbr1 == n) {
            System.out.print("Bravo ! Tu as trouvé mon nombre !");
        }
        
        if (nbr1 <  n) {
            System.out.println ("C'est plus !");
        }
        
        if (nbr1 > n) {
            System.out.println("C'est moins !");
        }
       
        i++;}
       while ( nbr1 != n) ;
        
        System.out.print(i);
    }
    
}
