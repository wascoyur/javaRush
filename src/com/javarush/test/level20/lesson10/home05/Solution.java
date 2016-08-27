package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
         String fullName;
        final String greetingString = "Hello, ";
        String country;
        transient Sex sex;
        transient PrintStream outputStream;
       transient Logger logger;
        final long serialVersionUID = 1L;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();

        }


    }

    enum Sex {
        MALE,
        FEMALE
    }


}
