package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFath = new Human( "Ded",true, 55, null, null);
        Human grandFath2 = new Human( "Ded2",true, 65, null, null);
        Human grandMother = new Human( "Baba",false, 54, null, null);
        Human grandMother2 = new Human( "Baba2",false, 60, null, null);
        Human Fath = new Human( "Father",true, 40, grandFath, grandMother);
        Human Mother = new Human( "Mother",false, 35, grandFath2, grandMother2);
        Human son1 = new Human( "Ivan",true, 21, Fath, Mother);
        Human doth = new Human( "Marya",false, 17, Fath, Mother);
        Human son2 = new Human( "Nikita",true, 15, Fath, Mother);
        System.out.println(grandFath);
        System.out.println(grandFath2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(Fath);
        System.out.println(Mother);
        System.out.println(son1);
        System.out.println(doth);
        System.out.println(son2);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
