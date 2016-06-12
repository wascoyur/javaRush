package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Иван") + " "
                + getCountTheSameLastName(createMap(), "Смирнов"));
    }
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Смирнов", "Иван");
        map.put("Соболев", "Илья");
        map.put("Петров", "Антон");
        map.put("Саперов", "Алексей");
        map.put("Новиков", "Иван");
        map.put("Яковлев", "Анатолий");
        map.put("Волков", "Артем");
        map.put("Мешков", "Сергей");
        map.put("Москвин", "Антон");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String str : map.values()) {
            if (str.equals(name)) count++;
        }
        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        //напишите тут ваш код
        int count = 0;
        for (String str : map.keySet()) {
            if (str.equals(familiya)) count++;
        }
        return count;

    }
}
