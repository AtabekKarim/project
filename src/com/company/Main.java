package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User (050302, "login11", "Password11", "Atabek", "Karim");
        System.out.println(user.toString());
        String [] subs = { "Python, Java, Web"};
        Staff staff = new Staff (060606, "easylogin", "easy password", "easyname", "easysurname", 100000, subs);
        System.out.println(staff.toString());
        String [] courses = { "Math, Physics"};
        Student student = new Student (0300723, "hardlogin", "hardpassword", "hardname", "hardsurname", 4.7, courses );
        System.out .println(student.toString());
    }
}