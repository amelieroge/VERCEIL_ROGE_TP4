/*
  v1 check
*/
package sp4_console_roge_eudes;

public class Cellule {
    Jeton jetonCourant ;
    
    public Cellule () {
        jetonCourant = null ;
    }
    
    public boolean affecterJeton(Jeton jeton){
        if (jetonCourant == null){
            jetonCourant = jeton;
            return true;
        } else return false;
    }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant == null) return "vide"; 
        else return jetonCourant.lireCouleur();
    }
    
    public Jeton recupererJeton(){
        return jetonCourant;
    }
}
