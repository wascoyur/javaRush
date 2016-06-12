package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

   synchronized public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

   synchronized public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    synchronized public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    synchronized public int compareTo(Object o) {
        Beach tmp = (Beach) o;
        if (this.quality < tmp.getQuality())return -1;
        else
        if (this.quality > tmp.getQuality())return 1;
        else
        return 0;
    }

}
