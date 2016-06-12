package com.javarush.test.level19.lesson03.task05;
import com.javarush.test.level19.lesson03.task05.Solution.*;
/**
 * Created by Юрий on 17.05.16.
 */
public class Exec_19_03_05 {
    public static void main(String[] args)
    {
        Customer customer = new Customer() {
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            public String getCountryName() {
                return "Ukraine";
            }
        };
        Contact contact = new Contact() {
            public String getName() {
                return "Ivanov, Ivan";
            }

            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        };

        RowItem rowItem = new DataAdapter(customer, contact);
        System.out.println(rowItem.getCountryCode());
        System.out.println(rowItem.getCompany());
        System.out.println(rowItem.getContactFirstName());
        System.out.println(rowItem.getContactLastName());
        System.out.println(rowItem.getDialString());
    }
}
