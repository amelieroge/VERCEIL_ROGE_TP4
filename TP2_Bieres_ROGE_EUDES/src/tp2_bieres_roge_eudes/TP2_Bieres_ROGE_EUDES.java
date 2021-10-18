/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_roge_eudes;

/**
 *
 * @author ASUS
 */
public class TP2_Bieres_ROGE_EUDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        uneBiere.Decapsuler(); // on créé une bouteille de Cuvée des Trolls avec toutes ses caractéristiques, puis on l'ouvre
        
        BouteilleBiere uneAutreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        // on créé une bouteille de Leffe avec toutes ses caractéristiques, cette fois sans l'ouvrir (on la garde pour plus tard)
        
        System.out.println(uneBiere);
        System.out.println(uneAutreBiere); // on affiche les infomations de nos biières (leur nom, degré d'alcool et si elles sont ouvertes
    }
    
}
