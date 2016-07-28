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

    public void setName(String name) {
        synchronized (this){
            this.name = name;}
    }

    public float getDistance() {
        return distance;
    }

    public void  setDistance(float distance) {
        synchronized (this){
        this.distance = distance;}
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        synchronized (this) {
            this.quality = quality;
        }
    }

    @Override
    public synchronized int compareTo(Object o) {
        Beach tmp = (Beach)o;
        int distanceParam = (int) (this.distance - tmp.getDistance());
        int qualityParam = this.quality - tmp.getQuality();
        return 10000 * name.compareTo(tmp.getName()) + 100 * distanceParam + qualityParam;

    }
}
