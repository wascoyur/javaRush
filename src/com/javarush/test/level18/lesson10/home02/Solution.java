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
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(args[0]);
//        FileOutputStream fos = new FileOutputStream(args[1]);
        FileInputStream fis = new FileInputStream("\\f1");
        FileOutputStream fos = new FileOutputStream("\\f2");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        char[] ch = new char[fis.available()];
        StringBuilder str;
        br.read(ch,0,fis.available());
        int sign = ch.length;
        System.out.println("sign = " + sign);
        char[] preSpace = ((ch.toString()).replaceAll(" ","")).toCharArray();
        int presLi = preSpace.length;// длина без пробелов
        System.out.println(preSpace);
        System.out.println("preSpace = " + presLi);
        int space = sign - presLi;
        System.out.println("space = " + space);
        System.out.println(ch);

    }
}
