package com.javarush.test.level09.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yur on 02.03.2016.
 */
public class SimpleDateFormatExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("date: " + dateFormat.format( new Date() ) );
    }
}
