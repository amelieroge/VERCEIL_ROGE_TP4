/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

/*Jeton

-String Couleur

+Jeton (String)
+String lireCouleur()
*/
public class Jeton {
    String Couleur ;
    
    public Jeton (String couleur) {
        Couleur = couleur ;
    }
    public String lireCouleur (){
        return Couleur ;
    }
    
    public String toString(){
        return Couleur;
    }
}
