package com.javarush.test.level22.lesson05.task01.tmp;

/**
 * Created by vasiliev on 04.09.2016.
 */
import java.lang.*;

public class StringDemo {

    public static void main(String[] args) {

        String str = "a d, m, i.n";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        // analyzing the string
        String[] tokensVal = str.split(delimiters);

        // prints the count of tokens
        System.out.println("Count of tokens = " + tokensVal.length);

        for(String token : tokensVal) {
            System.out.print(token);
        }

        // analyzing the string with limit as 3
        tokensVal = str.split(delimiters, 3);

        // prints the count of tokens
        System.out.println("\nCount of tokens = " + tokensVal.length);

        for(String token : tokensVal) {
            System.out.print(token);
        }
    }
}
