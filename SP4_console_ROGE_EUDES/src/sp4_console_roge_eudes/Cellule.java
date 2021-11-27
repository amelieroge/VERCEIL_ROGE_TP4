package sp4_console_roge_eudes;

public class Cellule {
    Jeton jetonCourant ;
    boolean trouNoir ;
    boolean desintegrateur ;
    
    public Cellule () { // initialise une cellule vide
        jetonCourant = null ;
        trouNoir = false ;
        desintegrateur = false ;
    }
    
    public boolean affecterJeton(Jeton jeton){ // permet  de mettre un jeton dans une cellule
        if (jetonCourant == null){
            jetonCourant = jeton;
            return true;
        } else return false;
    }
    
    public String lireCouleurDuJeton(){ 
        if (jetonCourant == null) return "vide"; // évite de faire une erreur si la cellule courante est vide
        else return jetonCourant.lireCouleur();
    }
    
    public Jeton recupererJeton(){
        return jetonCourant;
    }

    public boolean placerTrouNoir() { 
        if (trouNoir == false) { 
            trouNoir = true ;
            return true ;
        }
        else { return false ; }
    }
    
    public boolean presenceTrouNoir() {
        if (trouNoir == true){
            return true ;}
        else { return false ;}
    }
    
    public boolean activerTrouNoir() {
        if (presenceTrouNoir()== true) {
            jetonCourant = null ; // active le trou noir en faisant disparaître le jeton
            // qui est ajouté dans la cellule
            trouNoir = false ;
            return true ; }
        else { return false ;}
    }
    
    public boolean supprimerJeton() { // supprime le jeton de la cellule
        if (jetonCourant != null) {
            jetonCourant = null ;
            return true ;
        }
        else return false ;
    }
    
    public boolean placerDesintegrateur(){
        if (desintegrateur == false) {
            desintegrateur = true ;
            return true ;}
        else return false ;
    }
    
    public boolean presenceDesintegrateur() {
        if (desintegrateur == true) return true ;
        else return false ;
    }
    
    public boolean recupererDesintegrateur() { // permet aux joueurs de récupérer les 
        // désintégrateurs des cases pour les utiliser par la suite
        if (desintegrateur == true) {
            desintegrateur = true ;
            return true ;}
        else return false ;
    }
}
