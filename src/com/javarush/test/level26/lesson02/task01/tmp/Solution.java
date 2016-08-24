package com.javarush.test.level26.lesson02.task01.tmp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by vasiliev on 16.08.2016.
 */
public class Solution {
    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        final double med;
        if (array.length % 2 == 0) {
            med = (array[array.length/2 - 1] + array[array.length/2]) / 2.0;
        } else{
            med = array[array.length/2];
        }
        Comparator<Integer> median = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double value = Math.abs(o1-med) - Math.abs(o2-med);
                if (value == 0)
                    value = o1 - o2;
                return (int)value;
            }
        };
        Arrays.sort(array, median);
        for (int a : array) {
            System.out.print(a + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[] {-100,-200,300,500,800,900};//{2, 5, 6, 7, 21, 1,100};
        sort(array);
    }
}
