/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Board {
    private int height;
    private int width;
    private List<Point> points;
    private String matrix[][];

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void initialize() {
        matrix = new String[this.width][this.height];
         for (int i = 0 ; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                matrix[i][j] = "   ";
            }
        }
    }
    
    public void draw() {
        for (int i = 0 ; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("   ");
        }
        System.out.println("------------------------------");
    }

    public void drawPoints() {
       this.initialize();
        
        for (Point point : points) {
            matrix[point.getxCoordinate()][point.getyCoordinate()] = " * ";
      }
      draw();
    }

    public boolean isColisioned() {
        int flag = 0;
        
        for (Point pointA : points) {
            for (Point pointB : points) {
                if ((pointA.getxCoordinate() == pointB.getxCoordinate()) &&
                        pointA.getyCoordinate() == pointB.getyCoordinate()){
                    flag ++;
                }
            }
            if (flag >= 2){
                return true;
            }
            flag = 0;
        }
        return false;
    }
    
    
    
}
