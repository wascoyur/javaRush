package com.javarush.test.level22.lesson18.big01;

/**
 * Created by vasiliev on 20.07.2016.
 */
public class Tetris {
    Field field;
    Figure figure;
    public static Tetris game;
    public  void run(){}
    void step (){}
    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }


}
