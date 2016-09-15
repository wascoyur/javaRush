package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vasiliev on 15.08.2016.
 */
public class ConsoleHelper {
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static  String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {

        }
        return input;
    }
    public String askCurrencyCode() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            System.out.println("Enter currency code.");
            s = br.readLine();
            boolean code = s.matches("([A-z])");
            if (s.length() == 3 & code){
                s = s.toUpperCase();
                return s;
            }
            System.out.println("Repeat");
        }


    }
    public String[] getValidTwoDigits(String currencyCode) throws IOException {

        BufferedReader brCur = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter nominal and banknot");
            String[] nab = brCur.readLine().split(" ");
            try {
                Integer.parseInt(nab[0]);
                Integer.parseInt(nab[1]);
            } catch (Exception e) {
                System.out.println("Data is incorrect");
            }
            return nab;
        }


    }

}
