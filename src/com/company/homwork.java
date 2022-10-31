package com.company;

import java.util.Locale;

public class homwork {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";

        String fullName = lastName + firstName +middleName;
        System.out.println(fullName);

        //Задание2
        String fullNameApp = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameApp);


        //Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName1.replace("ё","е");
        System.out.println(fullNameCorrect);

    }
}