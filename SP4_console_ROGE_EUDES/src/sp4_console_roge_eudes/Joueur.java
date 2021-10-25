/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;
/* Joueur

-String Nom
-String Couleur
-Jeton [] ListeJetons
-int nombreDesintegrateurs
-int nombreJetonsRestants

+Joueur (String)
+void affecterCouleur(String)
+boolean recevoirJeton(Jeton)
+void obtenirDesintegrateur()
+boolean utiliserDesintegrateur()
 */
public class Joueur {
   String Nom ;
   String Couleur ;
   int nombreJetonsRestants ;
   Jeton [] ListeJetons ;
   public Joueur(String nom){ // Constructeur
       Nom = nom ;
       Couleur = "" ;
       ListeJetons= new Jeton [21] ;
       nombreJetonsRestants = 21 ;
   }
   
   public void affecterCouleur(String couleur){
       Couleur = couleur;
   }
   
   
// +boolean recevoirJeton(Jeton)
// +void obtenirDesintegrateur()
// +boolean utiliserDesintegrateur()
        
    public boolean recevoirJeton(Jeton) {
        
    }
}
