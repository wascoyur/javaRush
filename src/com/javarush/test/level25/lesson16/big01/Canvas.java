package com.javarush.test.level25.lesson16.big01;

/**
 * Created by yur on 28.07.2016.
 */
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;
    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[width][height];
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setPoint(double x, double y, char c) {
        int x1 = (int) Math.round(x);
        int y1 = (int) Math.round(y);
        if (x1 < 0 || y1 <0 || y1 >= matrix.length || x1 >= matrix.length)return;
        matrix[y1][x1] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix [i][j]!=0)setPoint(x+j, y+i, c);
            }
            
        }
    }
    public void clear(){

    }

    public void print() {

    }


}
