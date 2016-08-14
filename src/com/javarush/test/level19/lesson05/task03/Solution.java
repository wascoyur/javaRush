package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName = br.readLine();
        String out = br.readLine();
        BufferedReader rf = new BufferedReader(new FileReader(fName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(out));
        String tmpStr = "";
        while (rf.ready()) {
            String[] str = rf.readLine().split("\\s+");
            for (String x : str) {
                Pattern pattern = Pattern.compile("\\b\\d+\\b");
                Matcher m = pattern.matcher(x);
                if (m.find()) {
                    tmpStr = tmpStr + (x + " ");
                }
            }

        }
        tmpStr = tmpStr.trim();
        bw.write(tmpStr);
        br.close();
        rf.close();
        bw.close();
    }
}
