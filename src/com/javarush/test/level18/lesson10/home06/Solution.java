package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Integer> map = new TreeMap<>();

        char[] ch = new char[(int) new File(args[0]).length()];
        br.read(ch);
        for (char add : ch) {
            String tmp = (String.valueOf(add));
            if (tmp.matches("[A-z]"))map.put(tmp, null);
        }

        for (char x : ch) {
            Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,Integer> pair = iterator.next();
                String key = pair.getKey();
                Integer value = pair.getValue();
                if (key.equals(String.valueOf(x))) {
                    if (value == null){value = 1;} else value++;
                    map.put(key, value);break;
                }
            }

        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            String pr = String.valueOf(value);
            System.out.println(key +" " + pr);
        }

    }
}
