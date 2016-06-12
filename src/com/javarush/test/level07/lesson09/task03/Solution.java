package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> uborka = new ArrayList<String>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        uborka.add("мама");
        uborka.add("мыла");
        uborka.add("раму");
        for (int i = 0; i < uborka.size(); i ++){
            uborka.add(i + 1,"именно");
            i = i +1;
        }
        for (int i = 0; i < uborka.size(); i++){
            System.out.println(uborka.get(i));
        }



    }
}
