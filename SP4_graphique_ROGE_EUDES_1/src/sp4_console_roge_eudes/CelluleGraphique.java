/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_roge_eudes;

import javax.swing.JButton;

/**
 *
 * @author Anais
 */
 public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule ;
    }
}
