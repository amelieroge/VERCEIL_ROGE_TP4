/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_roge_eudes;

/**
 *
 * @author ASUS
 */
public class TP2_manip_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Question 4
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        */
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette res = assiette1;
        assiette1 = assiette2;
        assiette2 = res;
        
        // Question 6 : ce n'est pas bon, un type Moussaka ne peut pas être référencé à un type Tartiflette
        
        Moussaka [] Tab = new Moussaka[10]; 
        
        for (int i = 0 ; i < Tab.length ; i++){
            Tab[i] = new Moussaka(i*100);
        }
        
    }
    
}
