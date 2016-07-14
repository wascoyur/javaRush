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
        Solution[] mass = new Solution[2];
        Solution sol1 = new Solution();
        Solution sol2 = new Solution();
        InnerClass innerClass = sol1.new InnerClass();
        InnerClass inner2Class = sol1.new InnerClass();
        InnerClass innerClass2 = sol1.new InnerClass();
        InnerClass inner2Class2 = sol1.new InnerClass();

        mass[0] = sol1;
        mass[1] = sol2;
        return mass;
    }

    public static void main(String[] args) {
        getTwoSolutions();
        System.out.println(getTwoSolutions());


    }
}
