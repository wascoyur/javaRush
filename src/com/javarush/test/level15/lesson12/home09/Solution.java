package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ?
и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        String[] parsParam = (tmp.substring(tmp.indexOf('?') + 1)).split("&");
        String out = "";
        Map<String, String> map = new LinkedHashMap<>();
        for (String x : parsParam) {
            String parametr = x.replaceAll("(=).+", "");
            String value = x.replaceAll(".+(=)", "");
            map.put(parametr, value);
        }
        if (map.containsKey("obj")) {
            for (Map.Entry<String, String> pair : map.entrySet()) {
                String key = pair.getKey();
                out = out + key + " ";
            }
            System.out.println(out.trim());
                try {
                    alert(Double.parseDouble(map.get("obj")));
                }catch (NumberFormatException e){
                    alert(map.get("obj"));
                }
        } else {
            for (Map.Entry<String, String> pair : map.entrySet()) {
                String key = pair.getKey();
                out = out + key + " ";
            }
            System.out.println(out.trim());
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
