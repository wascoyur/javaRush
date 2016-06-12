package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String file = reader.readLine ();
        FileInputStream inputStream = new FileInputStream (file);
        int max = -2147483648;
        while(inputStream.available () > 0){
            int data = inputStream.read ();
            if (data > max){
                max = data;
            }
        }
        System.out.println (max);
        inputStream.close ();
    }
}
