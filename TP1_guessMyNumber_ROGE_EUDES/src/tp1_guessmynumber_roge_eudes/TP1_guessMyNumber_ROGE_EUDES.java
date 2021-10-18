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
        System.out.println("Choisis ton niveau de difficulté : \n 1) Facile \n 2) Normal \n 3) Difficile : tu as 7 essais");
        difficulte = sc.nextInt();
        // cette commande permet de choisir le niveau de difficulté 
        
        if (difficulte == 1){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(50); // pour simplifier le jeu, on réduit la plage de choix de la valeur à trouver à 50 au lieu de 100
            int i = 0;
            int nbr1 = 0;
        
            System.out.println("Devine ma valeur, humain (elle est entre 0 et 50)");
        
            do {
            Scanner sc1 = new Scanner(System.in);
            nbr1 = sc1.nextInt(); // permet à l'utilisateur de rentrer une nouvelle valeur à chaque nouvelle boucle
        
            if (nbr1 == n) {
                System.out.print("Bravo ! Tu as trouvé ma valeur !");
            }
        
            if (nbr1 <  n) { // actions à effectuer si le nombre entré est inférieur à la valeur de l'ordinateur
                System.out.print ("C'est plus !");
            }
        
            if (nbr1 > n) { // actions à effectuer si le nombre entré est supérieur à la valeur de l'ordinateur
                System.out.print("C'est moins !");
            }
       
            i++; // on incrémente i pour augmenter le nombre de tentative à chaque boucle
            System.out.println(" C'était ta " + i + "° tentative.");} // affiche le nombre de tentatives
        
            while ( nbr1 != n) ; // effectue les actions du "do" tant que la valeur de l'ordinateur n'est pas trouvée, il n'y a pas de limite de tentative
        }
        
    if ((difficulte == 2) || (difficulte == 3)){ // comme l'intervalle dans laquelle peut être choisie la valeur est la même entre la difficulté 2 et 3, on fait un "if" commun aux deux pour déterminer la valeur
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100); // la valeur est entre 0 et 100
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
        
            while ( nbr1 != n) ; // le code est sensiblement identique au niveau facile, seule l'intervalle de valeur change
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
            int reste = 7-i; // on définit la valeur des tentatives restantes
            System.out.println(" C'était ta " + i + "° tentative, attention, il ne te reste plus que " + reste + " tentatives !");
            } // on ajoute ici au print un compte à rebours des tentatives possibles
        
            while ( nbr1 != n && i < 7); // on ajoute ici une instruction pour sortir de la boucle si le nombre de tentatives dépasse 7
        }
        
        if (i == 7){
            System.out.println("C'est perdu ! Ma valeur était " + n + "."); // on affiche un message de défaite si la valeur n'a pas été trouvée en 7 tentatives
        }
    }
    
    }
}
