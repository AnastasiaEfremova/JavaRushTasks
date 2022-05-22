package com.company.JavaCore.Level_9.DataBase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        String UA = "Ukraine";
        String RU = "Russia";
        String CA = "Canada";
    }
    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
       private IncomeData incomeData;

       public IncomeDataAdapter(IncomeData incomeData) {
           this.incomeData = incomeData;
       }

        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
           if(incomeData.getCountryCode().equals("UA")) {
               return "Ukraine";
           } else if(incomeData.getCountryCode().equals("RU")) {
               return "Russia";
           } else
               return "Canada";
        }

        @Override
        public String getName() {
            return incomeData.getContactFirstName() + ", " + incomeData.getContactLastName();
        }
        //For example1: +38(050)123-45-67
        @Override
        public String getPhoneNumber() {
            String code = "+" + incomeData.getCountryCode();
            String str = new String(String.valueOf(incomeData.getPhoneNumber()));
            // мы получим 501234567
            char[] num = str.toCharArray();
            String number = "";
            num[0] = '(';
            num[4] = ')';
            return code + number;
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}
