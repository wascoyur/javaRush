package com.javarush.test.level24.lesson14.big01;

/**
 * Created by vasiliev on 24.07.2016.
 */
public class Canvas {
    int width;
    int height;
    char[][] matrix;
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[width][height];

    }



    public void setPoint(double x, double y, char c) {
        int x2 = (int)Math.round(x);
        int y2 = (int)Math.round(y);
        if (!(x2 < 0 || y2 < 0 || y2 > matrix.length || x2 > matrix[0].length)){
            matrix[y2][x2] = c;
        }

    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i][matrix.length]; j++) {
                if (matrix[i][j] !=0){
                    setPoint((x + j),(y + i), c);
                }
            }

        }
    }


}
