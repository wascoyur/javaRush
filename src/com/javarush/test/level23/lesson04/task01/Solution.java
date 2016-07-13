package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен
 возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution
инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
        String s = "Create Inner class";
    }

    public static Solution[] getTwoSolutions() {
//        Solution[] mass = new Solution[2];
        Solution sol1 = new Solution();
        Solution.InnerClass innerClass;

        return null;
    }

    public static void main(String[] args) {
        getTwoSolutions();

    }
}
