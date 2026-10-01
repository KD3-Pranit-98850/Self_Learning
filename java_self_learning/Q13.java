package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student1 {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student1(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return roll + " " + name + " " + city + " " + marks;
    }
}

public class Q13 {

    public static void main(String[] args) {

        Student1[] students = {
                new Student1(1, "Rahul", "Pune", 85),
                new Student1(2, "Amit", "Mumbai", 90),
                new Student1(3, "Rohit", "Pune", 90),
                new Student1(4, "Akash", "Mumbai", 90),
                new Student1(5, "Neha", "Pune", 85),
                new Student1(6, "Sneha", "Mumbai", 80)
        };

        System.out.println("Before Sorting:");

        for (Student1 s : students) {
            System.out.println(s);
        }

        Comparator<Student1> comparator =
                Comparator.comparing(Student1::getCity, Comparator.reverseOrder())
                        .thenComparing(Student1::getMarks, Comparator.reverseOrder())
                        .thenComparing(Student1::getName);

        Arrays.sort(students, comparator);

        System.out.println("\nAfter Sorting:");

        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}