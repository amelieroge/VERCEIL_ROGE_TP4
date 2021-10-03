/*
 * Amélie Rogé
 * TDC
 * TD0
 * 27 sept 2021
 */
package calculette.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        
        int operateur;
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt(); // On demande a sc de donner le prochain entier
    
        int operateur1;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the fisrt number :");
        operateur1 = sc.nextInt(); // On demande a sc de donner le prochain entier
    
        int operateur2;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the second number :");
        operateur2 = sc.nextInt(); // On demande a sc de donner le prochain entier
    
        int plus = operateur1 + operateur2;
        if (operateur == 1){
            System.out.println("The result is : " + plus);
        }
        
        int moins = operateur1 - operateur2;
        if (operateur == 2){
            System.out.println("The result is : " + moins);
        }
        
        if (operateur == 3){
            System.out.println("The result is : " + operateur1 * operateur2);
        }
        
        if (operateur == 4){
            System.out.println("The result is : " + operateur1 / operateur2);
        }
        
        if (operateur == 5){
            System.out.println("The result is : " + operateur1 % operateur2);
        }
        
        if ((operateur < 1) || (operateur > 5)){
            System.out.println("ERROR : incorrect operator");
        }

    }
    
}
