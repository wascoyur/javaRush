package com.javarush.test.level20.lesson02.task05.tmp;

import java.io.*;

/**
 * Created by vasiliev on 23.08.2016.
 */
class Cat
{
    public String name = "daf";
    public int age = 5;
    public int weight = 10;

    public void save(OutputStream outputStream) throws Exception
    {
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(name);
        printWriter.println(age);
        printWriter.println(weight);
        printWriter.flush();
    }

    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.save(new FileOutputStream("d:\\f1"));
        cat.age = 0; cat.name = null; cat.weight = 0;
        cat.load(new FileInputStream("d:\\f1"));
    }
}
