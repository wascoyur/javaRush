package com.javarush.test.level22.lesson18.big01;
/**
 *  Класс Tetris - содержит основной функционал игры.
 */
public class Tetris {
    Field field;
    public static Tetris game;
    public Field getField() {
        return field;
    }
    public Figure getFigure() {
        return figure;
    }
    public void run(){}
    public void step(){}

    Figure figure;
    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }
}
