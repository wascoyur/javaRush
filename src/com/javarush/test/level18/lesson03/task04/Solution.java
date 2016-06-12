package com.javarush.test.level18.lesson03.task04;

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
        ArrayList<Integer> sourceList = new ArrayList<>(); //создаем исходный массив из файла
        Map <Integer,Integer> uniqList = new HashMap();
        while (file.available() > 0){
            sourceList.add(file.read());
        }
        for (int i = 0; i < sourceList.size() ; i++) {
            uniqList.put(sourceList.get(i), 0);
        }
        for (Map.Entry<Integer, Integer> el : uniqList.entrySet()){
            for (Integer so : sourceList){
                if (el.getKey().equals(so)){
                    uniqList.put(el.getKey(), (el.getValue() + 1));
                }
            }
        }
        int min = 2147483647;
        for (Map.Entry<Integer, Integer> el : uniqList.entrySet()){
            if (el.getValue() < min){
                min = el.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> znach : uniqList.entrySet()){
            if (znach.getValue().equals(min))
                System.out.print(znach.getKey() + " ");
        }
        reader.close();
        file.close();
    }
}
