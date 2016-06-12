package com.javarush.test.level20.lesson07.task04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Serializable Solution
Сериализуйте класс Solution.
Подумайте, какие поля не нужно сериализовать, пометить ненужные поля — transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream)
2) создать экземпляр класса Solution - savedObject
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть)
4) создать другой экземпляр класса Solution с другим параметром
5) загрузить из потока на чтение объект - loadedObject
6) проверить, что savedObject.string равна loadedObject.string
7) обработать исключения
*/
public class Solution implements Serializable {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));
        FileOutputStream fileOut = new FileOutputStream("d:\\f1");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        FileInputStream fileInput = new FileInputStream("d:\\f1");
        ObjectInputStream objInput = new ObjectInputStream(fileInput);
        Solution savedObject = new Solution(100);
        objOut.writeObject(savedObject);
        objOut.close();
        Solution secObj = new Solution(50);
        Object loadedObject = objInput.readObject();
        System.out.println(savedObject.equals(loadedObject));
        System.out.println(savedObject.toString());
        System.out.println(loadedObject.toString());
        System.out.println(secObj.toString());
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
     String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
