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
        BufferedReader rf = new BufferedReader(new FileReader(args[0]));
        char[]inp = new char[(int) new File(args[0]).length()];
        Map<String,Integer> list = new TreeMap<>();
        rf.read(inp);
        System.out.println((int)'z');
        int tmp = 150;
        char e = Character.forDigit(tmp,16);
        for (int i = ((int)'A'); i <= ((int)'z'); i++) {
            list.put((("s")), 0);
            for (char x : inp) {
                if (((int) x) == i) {

                }
            }
        }

    }



}
