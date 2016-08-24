package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rf = new BufferedReader(new FileReader(args[0]));
        FileInputStream fis = new FileInputStream(args[0]);
        char[] ch = new char[fis.available()];
        rf.read(ch);
        String s = String.valueOf(ch).replaceAll("[^A-z]","");
        int i = s.trim().length();
        System.out.println(i);
        rf.close();
        fis.close();
    }
}
