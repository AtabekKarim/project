package com.company;

import java.util.Arrays;

public class Staff extends User{
    double salary;
    String subjects[];

    public Staff(int id, String login, String password, String name, String surname, double salary, String[] subjects) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
    }

    public Staff(double salary, String[] subjects) {
        this.salary = salary;
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
