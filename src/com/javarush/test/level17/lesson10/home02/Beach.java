package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable <Beach>{
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
   synchronized public int compareTo(Beach o) {
        int distIndex = (int) (distance - o.getDistance());
        int qualIndex = quality - o.getQuality();
        return 10000 * name.compareTo(o.getName()) + 100 * distIndex + qualIndex;
    }



}
