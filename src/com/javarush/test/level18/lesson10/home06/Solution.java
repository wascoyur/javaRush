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
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();
        String file = args[0];
        BufferedReader br = new BufferedReader(new FileReader(file));
        char[] ch = new char[(int) new File(file).length()];
        br.read(ch);
        for (Character x : ch) {
            char y = x;
            if ((map.containsKey(y))) {
                map.put(y,(map.get(y) +1 ));
            }
            else
            map.put(y, 1);
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            String key = String.valueOf(pair.getKey());
            int count = pair.getValue();
            System.out.println(key +" " + count);
        }
        br.close();
    }
}
