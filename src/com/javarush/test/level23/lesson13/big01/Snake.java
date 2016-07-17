package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by vasiliev on 17.07.2016.
 */
public class Snake {
    public Snake(ArrayList<SnakeSection> sections, boolean isAlive, SnakeDirection direction) {
        this.sections = sections;
        isAlive = true;
        this.isAlive = isAlive;
        this.direction = direction;

        SnakeSection head = new SnakeSection(0, 0);
        sections.add(head);

    }
    public int getX() {
        SnakeSection tmp = sections.get(0);
        int x = tmp.getX();
        return x;
    }

    public int getY() {
        SnakeSection tmp = sections.get(0);
        int y = tmp.getY();
        return y;
    }

    public void move() {

    }
    ArrayList<SnakeSection> sections = new ArrayList<>();
    boolean isAlive;
    SnakeDirection direction;

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
