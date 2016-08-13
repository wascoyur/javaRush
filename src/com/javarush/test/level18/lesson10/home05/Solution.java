package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rFn = new BufferedReader(new InputStreamReader(System.in));
        String input = rFn.readLine();
        String output = rFn.readLine();
        BufferedReader br = new BufferedReader(new FileReader(input)); //input
        BufferedWriter bw = new BufferedWriter(new FileWriter(output)); //output
        ArrayList<Double> doubles = new ArrayList<>();
        Scanner scanner = new Scanner(br);
        while ((scanner.hasNext())) {
            doubles.add(Double.parseDouble(scanner.next()));
        }
        String s = "";
        for (Double x : doubles) {
            int tmp = (int) Math.round(x);
            s = s + tmp + " ";
        }
        String out = s.toString().trim();
        bw.write(out);
        bw.close();
        br.close();
        rFn.close();
        scanner.close();

    }
}
