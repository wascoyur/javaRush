package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution
{
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        File fileInputStream = new File(re.readLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileInputStream)));
        Scanner scanner = new Scanner(br);
        TreeSet<Integer> list = new TreeSet<>();
        while (true){
            try{
            list.add(Integer.parseInt(br.readLine()));}
            catch (Exception e){break;}

        }
        for (Integer x:list){
            if (x%2 == 0) System.out.println(x);
        }
    }
}
