package com.javarush.test.level22.lesson05.task02.tmp;

/**
 * Created by vasiliev on 02.09.2016.
 */
public class Solution {
    public static void main(String[] args) throws TooShortStringException{
        System.out.println(getPartOfString("\t          dasdklkldjakls dkasldj lasdl adsjl \t kjasdlkasj lkdjasld\t"));
    }
    public static String getPartOfString(String string) throws TooShortStringException{
        if(string == null) throw new TooShortStringException();
        String res = "";
        String[] subStrings = string.split("\\t");
        if(subStrings.length < 2) throw new TooShortStringException();
        res = subStrings[1];
        return res;
    }
    public static class TooShortStringException extends Exception {
    }
}
