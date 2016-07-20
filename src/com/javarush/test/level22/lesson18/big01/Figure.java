package com.javarush.test.level22.lesson18.big01;

/**
 * Created by vasiliev on 20.07.2016.
 */
public class Figure {
    int x;
    int y;
    int[][] matrix;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Figure(int x, int y, int[][] matrix) {

        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }
    public void left(){};// - для движения фигурки влево.
    public void right(){};// - для движения фигурки вправо.
    public void down(){};// - для движения фигурки вниз.
    public void up(){};// - для движения фигурки вверх.
    public void downMaximum(){};// - падение фигурки в низ до дна.
    public void rotate(){};// - для поворота фигурки вокруг главной диагонали.
    public boolean isCurrentPositionAvailable(){return true;};// - проверка - может ли фигурка быть помещена в текущую позицию. Для теста захардкодь результат в true.
    public void landed(){};// - вызывается, когда фигурка достигла дна или уперлась в другую фигурку
}
