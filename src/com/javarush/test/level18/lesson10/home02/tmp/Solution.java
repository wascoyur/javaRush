package com.javarush.test.level18.lesson10.home02.tmp;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by vasiliev on 04.08.2016.
 */
public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        FileInputStream file = new FileInputStream(filename);
        int valueByte = file.available();
        int date = 0;
        int valueSpase = 0;
        while (file.available()>0){
            date = file.read();
            if (date == 32)
                valueSpase ++;
        }
        double a = (double) valueSpase/valueByte *100;
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(a);
        System.out.println(format);

    }
}