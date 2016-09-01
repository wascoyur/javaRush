package com.javarush.test.level26.lesson02.task02;

import java.util.Set;
import java.util.TreeSet;

/* Был бы ум - будет и успех.
Солдаты всегда строились, строятся и будут строиться по убыванию роста.
<<<<<<< HEAD
Отсортируйте солдат, предварительно подумав, что лучше использовать при таких условиях - Comparable или Comparator.
=======
Отсортируйте солдат, предварительно подумав,
что лучше использовать при таких условиях - Comparable или Comparator.
>>>>>>> origin/master
*/
public class Solution {
    public static void main(String[] args) {
        Set<Soldier> soldiers = new TreeSet<>();
        soldiers.add(new Soldier("Ivanov", 170));
        soldiers.add(new Soldier("Petrov", 180));
        soldiers.add(new Soldier("Sidorov", 175));

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.name);
        }
    }

<<<<<<< HEAD
    public static class Soldier implements Comparable {
=======
    public static class Soldier implements Comparable<Soldier>{
>>>>>>> origin/master
        private String name;
        private int height;

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
<<<<<<< HEAD
        public int compareTo(Object o) {
            Soldier tmp = (Soldier)o;
            return this.height -(tmp.height);
=======
        public int compareTo(Soldier o) {
            return o.height - this.height;
>>>>>>> origin/master
        }
    }
}
