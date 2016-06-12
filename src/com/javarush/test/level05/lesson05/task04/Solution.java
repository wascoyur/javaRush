package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat("Bob",2, 3, 5);
        Cat cat2 = new Cat("Bob",2, 3, 5);
        Cat cat3 = new Cat("Bob",2, 3, 5);
//        System.out.println(cat.name + cat.age + cat.weight + cat.strength );
//        System.out.println(cat2.name + cat2.age + cat2.weight + cat2.strength );
//        System.out.println(cat3.name + cat3.age + cat3.weight + cat3.strength );
//        System.out.println(cat.equals(cat2));
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
