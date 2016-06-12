package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListDemo{

    public static void main(String args[]) {

        //Здесь происходит привычное создание и инициализация массива в одну строку
        String[] coolStringArray = new String[]{"Java" , "Scala" , "Groovy"};
        System.out.println(" Array : " + Arrays.toString(coolStringArray));

        //Теперь вручную создадим ArrayList с тремя элементам
        List<String> notSoCoolStringList = new ArrayList<String>();
        notSoCoolStringList.add("Java");
        notSoCoolStringList.add("Scala");
        notSoCoolStringList.add("Groovy");

        //На это нам потребовалось 4 строки
        System.err.println(" List : " + notSoCoolStringList);

        //Здесь происодит создание и инициализация List в одну строку
        List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
        System.err.println(" List создан и инициализирован в одну строку : " + coolStringList);
    }
}