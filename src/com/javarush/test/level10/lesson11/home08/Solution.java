package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ва
        ArrayList<String> str = new ArrayList<String> ();//1 массив строк
        str.add ("qwe1");
        str.add ("asd1");
        str.add ("zxc1");
        ArrayList<String> str2 = new ArrayList<String> ();//2 массив
        str2.add ("ert2");
        str2.add ("sdf2");
        ArrayList<String>[] list = new ArrayList[2];//массив списков строк
        list[0] = str;
        list[1] = str2;


        return  list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}