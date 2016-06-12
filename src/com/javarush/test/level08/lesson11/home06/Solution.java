package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        ArrayList<Human> papmam = new ArrayList<Human> ();
        ArrayList<Human> children = new ArrayList<Human> ();
        Human ded1 = new Human ("ded1", true, 66, papmam);
        Human ded2 = new Human ("ded1", true, 66, papmam);
        Human baba1 = new Human ("baba1", false, 50, papmam);
        Human baba2 = new Human ("baba2", false, 50, papmam);
        papmam.add (new Human ("pap", true, 40, children));
        papmam.add (new Human ("mam", false, 35, children));

        children.add (new Human ("Child1", true, 20, new ArrayList<Human> ()));
        children.add (new Human ("Child2", false, 18, new ArrayList<Human> ()));
        children.add (new Human ("Child3", true, 16, new ArrayList<Human> ()));
        System.out.println (ded1);
        System.out.println (ded2);
        System.out.println (baba1);
        System.out.println (baba2);

        for (Human Human : papmam){
            System.out.println (Human);
        }
        for (Human Human : children){
            System.out.println (Human);
        }

    }

    public static class Human
    {
        public Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
