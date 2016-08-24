package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

<<<<<<< HEAD
import java.util.Comparator;

=======
>>>>>>> origin/master
public class Beach implements Comparable {
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

<<<<<<< HEAD
    public void setName(String name) {
=======
    synchronized public void setName(String name) {
>>>>>>> origin/master
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

<<<<<<< HEAD
    public void setDistance(float distance) {
=======
    synchronized public void setDistance(float distance) {
>>>>>>> origin/master
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
<<<<<<< HEAD
    public int compareTo(Object o) {
        return 0;
=======
    synchronized public int compareTo(Object o) {
        Beach obj = (Beach)o;
        int distanceParam = (int) (distance - obj.getDistance());
        int qualityParam = quality - obj.getQuality();
        return 10000 * name.compareTo(obj.getName()) + 100 * distanceParam + qualityParam;
>>>>>>> origin/master
    }
}
