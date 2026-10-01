package com.sunbeam;

class Student {
    private int rollNo;
    private String name;
    private Address address;

    public Student() {
        rollNo = 0;
        name = "Unknown";
        address = new Address();
    }

    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.address = s.address;      
    }

    public Student(Student s, boolean deepCopy) {
        this.rollNo = s.rollNo;
        this.name = s.name;

        if (deepCopy) {
            this.address = new Address(s.address);
        } else {
            this.address = s.address;
        }
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("City    : " + address.getCity());
        System.out.println();
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private String city;

    public Address() {
        city = "Unknown";
    }

    public Address(String city) {
        this.city = city;
    }

    public Address(Address a) {
        this.city = a.city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Address address = new Address("Pune");

        Student s1 = new Student(101, "Raju", address);

        System.out.println("Original Student:");
        s1.display();

        Student s2 = new Student(s1);

        s2.getAddress().setCity("Mumbai");

        System.out.println("After Shallow Copy:");
        System.out.println("Original Student:");
        s1.display();

        System.out.println("Copied Student:");
        s2.display();

        Student s3 = new Student(102, "Rahul", new Address("Nashik"));

        Student s4 = new Student(s3, true);

        s4.getAddress().setCity("Nagpur");

        System.out.println("After Deep Copy:");
        System.out.println("Original Student:");
        s3.display();

        System.out.println("Copied Student:");
        s4.display();
    }
}