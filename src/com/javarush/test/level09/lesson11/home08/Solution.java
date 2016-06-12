package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> lis = new ArrayList<int[]> ();
        int list5 [] = {1, 2, 3, 4, 5};
        int list2 [] = {6, 7};
        int list4 [] = {8, 9, 10, 11};
        int list7 [] = {12, 13, 14, 15, 16, 17, 18};
        int list0 [] = {};
        lis.add (list5);
        lis.add (list2);
        lis.add (list4);
        lis.add (list7);
        lis.add (list0);
        return lis;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
