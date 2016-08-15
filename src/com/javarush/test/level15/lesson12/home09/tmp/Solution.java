package com.javarush.test.level15.lesson12.home09.tmp;

/**
 * Created by vasiliev on 15.08.2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        Obj(url);
    }
    public static void Obj(String url){
        String small_url = url.substring(url.indexOf("?")+1, url.length());
        List<String> list = Arrays.asList(small_url.split("&"));
        String outpat = "";
        for (String i: list){
            if (i.contains("="))
            {
                outpat += (i.substring(0, i.indexOf("=")) + " ");
            }
            else outpat += i + " ";
        }
        System.out.println(outpat.trim());
        for (String i: list){
            if (i.contains("obj=")){
                try
                {
                    alert(Double.parseDouble(i.substring(4)));
                }
                catch (Exception e){
                    alert(i.substring(4));
                }
            }
        }
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }
    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
