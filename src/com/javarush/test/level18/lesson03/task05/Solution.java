package com.javarush.test.level18.lesson03.task05;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Solution {
    
    
    
    public static void main(String[] args) throws Exception {
        TreeSet list = new TreeSet();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while(file.available() > 0){
            list.add(file.read());
        }
        reader.close();
        file.close();
            for (Object text : list){
                System.out.println(text);
            }
        }
    }

