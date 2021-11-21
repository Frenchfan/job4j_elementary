package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String surname = fio[0] + " ";
        String firstName = fio[1].charAt(0) + ".";
        String lastName = fio[2].charAt(0) + ".";
        return surname + firstName + lastName;
    }
}
