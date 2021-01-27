package com.company;

import java.util.Arrays;

public class Student extends User{
    double gpa;
    String courses[];

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

    public Student(double gpa, String[] courses) {
        this.gpa = gpa;
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
