package sp4_console_roge_eudes;

public class Joueur {
   String Nom ;
   String Couleur ;
   int nombreJetonsRestants ;
   Jeton [] ListeJetons ;
   int nombreDesintegrateurs ;
   
   public Joueur(String nom){ // Constructeur
       Nom = nom ;
       Couleur = "" ;
       ListeJetons = new Jeton [21] ;
       nombreJetonsRestants = 0 ;
       nombreDesintegrateurs = 0 ;
   }
   
   public void affecterCouleur(String c){
       Couleur = c;
   }
  
   public boolean ajouterJeton(Jeton j) {
        if (nombreJetonsRestants < 21) {
            ListeJetons[nombreJetonsRestants]=j ;
            nombreJetonsRestants++ ;
            return true ;
        }
        else{
            return false ;
        }
    }
   public void obtenirDesintegrateur(){
       nombreDesintegrateurs = nombreDesintegrateurs +1 ;
   }
   public void utiliserDesintegrateur(){
       nombreDesintegrateurs = nombreDesintegrateurs -1 ;
   }
}
