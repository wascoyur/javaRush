package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        boolean sex;
        String son;
        String dother;
        String address;
        Human(String name){
            this.name = name;
        }
        Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        Human(String name, int age, boolean sex){}
        Human(String name, int age, boolean sex, String son){}
        Human(String name, int age, boolean sex, String son, String dother){}
        Human(String name, int age, boolean sex, String son, String dother, String address){}
        Human(String name, boolean sex, String son, String dother, String address){}
        Human(String name, boolean sex, String son, String dother){}
        Human(String name, boolean sex, String dother){}
        Human(String name, boolean sex){}

    }
}
