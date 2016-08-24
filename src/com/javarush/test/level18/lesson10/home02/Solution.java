package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream(args[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));
        char[] chars = new char[fos.available()];
        double space = 0;
        double all = 0;
        br.read(chars);

        for (int i = 0;i< chars.length; i++) {
            if (chars[i] == ' ')space++;
            all++;
        }
        String str = new String(chars);
        double d = space/all * 100;
        System.out.printf("%.2f", d);
        br.close();fos.close();


    }
}
