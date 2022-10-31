package com.company;

public class Main {

    public static void main(String[] args) {
        String phone = " 960-415-75-37";
        phone = phone.replace("-", "");;
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком динный");
        } else if (phone.length() < 10){
            throw new RuntimeException("телефон слишком короткий");
        }else  if (phone.length() == 11 && phone.charAt(0) != '7'){
            throw new RuntimeException("Среди нас другой");
        }

        System.out.println("phone = " + phone);
        String exPhone = "79604157537";
        if (phone.equals(exPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Нудача");
        }
    }
}
