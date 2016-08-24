package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Юрий on 07.05.16.
 */
public class Hippodrome {
    static ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses() {
        return horses;
    }
    public void run(){
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }

    }
    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();
        }
    }
    public Horse getWinner() {
        double max = 0;
        Horse win = null;
        
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).distance > max) {
                win = horses.get(i);
            }
        }

        return win;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        game = new Hippodrome();
        Horse a = new Horse("Alpha", 3, 0);
        Horse b = new Horse("Beta", 3, 0);
        Horse g = new Horse("Gamma", 3, 0);
        game.horses.add(a);
        game.horses.add(b);
        game.horses.add(g);
        game.run();
        game.printWinner();

    }

}
