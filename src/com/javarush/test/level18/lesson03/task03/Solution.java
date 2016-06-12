package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> sourceList = new ArrayList<>();
        Map <Integer, Integer > uniqList = new HashMap<>();
        while (file.available() > 0){
            sourceList.add(file.read());// содержит оригинальный список
           }
        for (int i = 0; i < sourceList.size(); i++) {
            uniqList.put(sourceList.get(i), 0); // содержит только уникальные значения оригинального списка.
                                                // key = значение, value = кол повторов
            }
        for (Map.Entry<Integer,Integer> pair: uniqList.entrySet() ){ //берем по очереди каждую пару значения уникального списка
            for (Integer element : sourceList) { // берем по очереди каждый элемент исходного списка
                if (pair.getKey().equals(element)){ //сравниваем уникальное значение  со значением исходного списка
                    uniqList.put(pair.getKey(), (pair.getValue() + 1)); // если совпадает, то добавляем к value соответствующего ключа 1
                                    }
            }
        }
        int max = -2147483648;
        for (Map.Entry<Integer, Integer> el: uniqList.entrySet()){ // ищем максимальные значения валью
            if (el.getValue() > max){
                max = el.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> znach: uniqList.entrySet()){
            if (znach.getValue().equals(max)){
                System.out.print(znach.getKey() + " ");
            }
        } reader.close();
            file.close();
        }
    }


/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/