/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class Main {
    public static void main(String args[]) {
        Manager manager = new Manager();
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ancho del tablero"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el alto del tablero"));
        manager.drawBoard(x, y);
        while (true)
            manager.shuffleBoard();
        
    }
}
