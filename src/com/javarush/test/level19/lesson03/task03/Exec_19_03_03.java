package com.javarush.test.level19.lesson03.task03;
import com.javarush.test.level19.lesson03.task03.Solution.*;
/**
 * Created by Юрий on 17.05.16.
 */
public class Exec_19_03_03 {
    public static void main(String[] args) {
        IncomeData list = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "RU";
            }

            @Override
            public String getCompany() {
                return "Wascoyur ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "Yurii";
            }

            @Override
            public String getContactLastName() {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode() {
                return 7;
            }

            @Override
            public int getPhoneNumber() {
                return 982446201;
            }
        };
        Customer cust = new IncomeDataAdapter(list);
        System.out.println(cust.getCompanyName());
        System.out.println(cust.getCountryName());
        Contact myown = new IncomeDataAdapter(list);
        System.out.println(myown.getName());
        System.out.println(myown.getPhoneNumber());
    }

}
