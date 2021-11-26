/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_roge_eudes;

/**
 *
 * @author ASUS
 */
public class SP4_console_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Joueur anais = new Joueur("Anais");
        Joueur amelie = new Joueur("Amelie");
        
        Partie p = new Partie(anais,amelie);
        
        p.initialiserPartie();

        p.debuterPartie1();
        
        /*p.grilleJeu.afficherGrilleSurConsole();
        p.grilleJeu.ajouterJetonDansColonne(anais.ListeJetons[anais.nombreJetonsRestants-1], 0);
        p.grilleJeu.ajouterJetonDansColonne(amelie.ListeJetons[amelie.nombreJetonsRestants-1], 0);
        p.grilleJeu.ajouterJetonDansColonne(anais.ListeJetons[anais.nombreJetonsRestants-1], 0);
        p.grilleJeu.afficherGrilleSurConsole();
        p.grilleJeu.recupererJeton(1, 0);
        p.grilleJeu.afficherGrilleSurConsole();*/
    }
    
}
