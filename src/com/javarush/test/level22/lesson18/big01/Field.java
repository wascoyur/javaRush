package com.javarush.test.level22.lesson18.big01;

/**
 * Created by vasiliev on 20.07.2016.
 */
public class Field {
    int width;
    int height;
    int [][] matrix;

    public Field(int width, int height, int[][] matrix) {
        this.width = width;
        this.height = height;
        this.matrix = matrix;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    void print(){// - объект будет отрисовывать на экран свое текущее состояние;
        int height = 0; int width = 0;
        if (matrix[y][x] == 0) {

        }
    }
    void removeFullLines(){};// - будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз;
    Integer getValue(int x, int y){return null;}// - возвращает значение которое находится в матрице с координатами x и y;
    void setValue(int x, int y, int value){}// - устанавливает переданное значение в ячейку массива (матрицы
}
