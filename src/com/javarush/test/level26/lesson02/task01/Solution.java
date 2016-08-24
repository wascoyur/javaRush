package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать
 данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        final int mediana;
        int length = array.length;
        if (length % 2 == 0) {
            mediana = ((array[length/2] + array[length/2 -1])) / 2;
        }
        else
            mediana = array[length / 2];
        final Comparator<Integer> med = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int val = Math.abs(o1 - mediana) - Math.abs(o2 - mediana);
                if (val == 0)val = o1 - o2;
                return val;
            }
        };
        Arrays.sort(array,med);
        return array;
    }

    public static void main(String[] args) {
        Integer[] arr = {100,200,500,800,300,900};
        sort(arr);
    }
}
