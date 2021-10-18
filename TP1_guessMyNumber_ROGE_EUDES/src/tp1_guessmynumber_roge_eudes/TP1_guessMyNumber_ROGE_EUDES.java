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
        
        int difficulte = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisis ton niveau de difficulté : \n 1) Facile \n 2) Normal \n 3)Difficile : tu as 7 essais");
        difficulte = sc.nextInt();
        
        if (difficulte == 1){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(50);
            int i = 0;
            int nbr1 = 0;
        
            System.out.println("Devine ma valeur, humain (elle est entre 0 et 50)");
        
            do {
            Scanner sc1 = new Scanner(System.in);
            nbr1 = sc1.nextInt();
        
            if (nbr1 == n) {
                System.out.print("Bravo ! Tu as trouvé ma valeur !");
            }
        
            if (nbr1 <  n) {
                System.out.print ("C'est plus !");
            }
        
            if (nbr1 > n) {
                System.out.print("C'est moins !");
            }
       
            i++;
            System.out.println(" C'était ta " + i + "° tentative.");}
        
            while ( nbr1 != n) ;
        }
        
    if ((difficulte == 2) || (difficulte == 3)){
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        int i = 0;
        int nbr1 = 0;
        
        System.out.println("Devine ma valeur, humain (elle est entre 0 et 100)");
        
        if (difficulte == 2){
            do {
            Scanner sc1 = new Scanner(System.in);
            nbr1 = sc1.nextInt();
        
            if (nbr1 == n) {
                System.out.print("Bravo ! Tu as trouvé ma valeur !");
            }
        
            if (nbr1 <  n) {
                System.out.print ("C'est plus !");
            }
        
            if (nbr1 > n) {
                System.out.print("C'est moins !");
            }
       
            i++;
            System.out.println(" C'était ta " + i + "° tentative.");}
        
            while ( nbr1 != n) ;
        }
        
        if (difficulte == 3){
            do {
            Scanner sc1 = new Scanner(System.in);
            nbr1 = sc1.nextInt();
        
            if (nbr1 == n) {
                System.out.print("Bravo ! Tu as trouvé ma valeur !");
            }
        
            if (nbr1 <  n) {
                System.out.print ("C'est plus !");
            }
        
            if (nbr1 > n) {
                System.out.print("C'est moins !");
            }
       
            i++;
            int reste = 7-i;
            System.out.println(" C'était ta " + i + "° tentative, attention, il ne te reste plus que " + reste + " tentatives !");
            }
        
            while ( nbr1 != n && i < 7);
        }
        
        if (i == 7){
            System.out.println("C'est perdu ! Ma valeur était " + n + ".");
        }
    }
    
    }
}
