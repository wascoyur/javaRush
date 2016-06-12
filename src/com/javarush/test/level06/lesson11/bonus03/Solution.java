package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] mas = new int[5];
        for (int i = 0; i < 5; i++){
            int j = Integer.parseInt(reader.readLine());
            mas[i] = j;
        }
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < mas.length - 1; i++){
                if (mas[i] > mas[i +1]){
                    int tmp = mas[i];
                    mas[i] = mas[i +1];
                    mas[i + 1] = tmp;
        }

            }
        }
        for (int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}
