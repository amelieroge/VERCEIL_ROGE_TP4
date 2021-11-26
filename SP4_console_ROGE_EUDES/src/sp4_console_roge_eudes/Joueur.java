package sp4_console_roge_eudes;

public class Joueur {
   String Nom ;
   String Couleur ;
   int nombreJetonsRestants ;
   Jeton [] ListeJetons ;
   int nombreDesintegrateurs ;
   
   public Joueur(String nom){ 
       Nom = nom ;
       Couleur = "" ;
       ListeJetons = new Jeton [21] ;
       nombreJetonsRestants = 0 ;
       nombreDesintegrateurs = 0 ;
   }
   
   public void affecterCouleur(String c){ // permet de lier la méthode de "Partie" au joueur
       Couleur = c;
   }
  
   public boolean ajouterJeton(Jeton j) { // ajoute des 21 jetons au joueur
        if (nombreJetonsRestants < 21) {
            ListeJetons[nombreJetonsRestants]=j ;
            nombreJetonsRestants++ ;
            return true ;
        }
        else{
            return false ;
        }
    }
   
   public void obtenirDesintegrateur(){ // incrémente le nombre de désintégrateurs du joueur
       nombreDesintegrateurs = nombreDesintegrateurs +1 ;
   }
   
   public void utiliserDesintegrateur(){ // enlève le désintégrateur utilisé dans "Partie" de la liste des 
       // désintégrateurs du joueur
       nombreDesintegrateurs = nombreDesintegrateurs -1 ;
   }
}
