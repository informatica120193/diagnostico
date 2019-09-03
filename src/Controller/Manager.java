/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Board;
import Model.Point;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class Manager {
    private Board board;
    
    public Manager(){
        board = new Board();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void drawBoard(int x, int y) {
        this.board.setWidth(x);
        this.board.setHeight(y);
        this.board.initialize();
        this.board.draw();
    }
    
    public void shuffleBoard() {
        List<Point> points = movePoints();
        this.board.setPoints(points);
        this.board.drawPoints();
        if (this.board.isColisioned()){
            JOptionPane.showMessageDialog(null, "Dos puntos han colisionado");
            System.exit(0);
        }
    }
    
    private List<Point> movePoints() {
        Point point1 = new Point(new Random().nextInt(this.board.getWidth()),new Random().nextInt(this.board.getHeight()));
        Point point2 = new Point(new Random().nextInt(this.board.getWidth()),new Random().nextInt(this.board.getHeight()));
       return  Arrays.asList(point1, point2);          
    }
    
}
