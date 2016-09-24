package com.javarush.test.level25.lesson02.task02;


import java.util.LinkedList;
import java.util.List;

/* Машину на СТО не повезем!
Инициализируйте поле wheels используя данные из loadWheelNamesFromDB.
Обработайте некорректные данные.
Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels = new LinkedList<>();

        public Car() {

            //init wheels here
            String[] strings = loadWheelNamesFromDB();
            if (strings.length == Wheel.values().length){
                for (int i = 0; i < strings.length; i++) {
                    Wheel wheel = Wheel.valueOf(strings[i]);
                    int j = wheel.ordinal();
                    wheels.add(wheel);
                }
            }


        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.wheels);
    }
}
