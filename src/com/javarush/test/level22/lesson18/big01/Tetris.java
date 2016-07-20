package com.javarush.test.level22.lesson18.big01;
//todo: создать геттеры
/**
 * Created by Юрий on 14.05.16.
 */
public class Tetris {
    Field field;
    Figure figure;
    public static Tetris game;

    static void run() {

    }

    void step() {

    }

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public static void main(String[] args) {
        game = new Tetris();
        run();


    }
}
