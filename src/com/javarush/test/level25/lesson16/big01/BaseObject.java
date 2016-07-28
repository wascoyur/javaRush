package com.javarush.test.level25.lesson16.big01;

/**
 * Created by yur on 28.07.2016.
 */
public abstract class BaseObject {
    public void move() {

    }
    public void draw(){}
    public void die(){}
    public boolean isIntersec(BaseObject o){
        дистанция_между_объектами < max (радиус_первого_объекта, радиус_второго_объекта)
        int dist =
        return
    }
    private double x;
    private double y;
    private double radius;
    boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public boolean isAlive() {

        return isAlive;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {

        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

}
