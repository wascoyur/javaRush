package com.javarush.test.level24.lesson14.big01;

import java.util.ArrayList;

/**
 * Created by vasiliev on 24.07.2016.
 */
public class Arcanoid {
    int width;
    int height;
    Ball ball;
    Stand stand;
    ArrayList bricks = new ArrayList<>();
    public static Arcanoid game;

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void setBricks(ArrayList bricks) {
        this.bricks = bricks;
    }

    public Ball getBall() {

        return ball;
    }

    public Stand getStand() {
        return stand;
    }

    public ArrayList getBricks() {
        return bricks;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public int getHeight() {
        return height;
    }

    public Arcanoid(int width, int height) {

        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }

    public void run() {

    }

    public void move() {

    }
}
