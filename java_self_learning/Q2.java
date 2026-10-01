package com.sunbeam;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculateVolume();
}

abstract class Shape2D extends Shape {
    @Override
    void calculateVolume() {
        System.out.println("Volume not applicable for 2D shape");
    }
}

abstract class Shape3D extends Shape {
    @Override
    void calculateArea() {
        System.out.println("Area means surface area for 3D shape");
    }
}

class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

class Rectangle extends Shape2D {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
}

class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area = " + surfaceArea);
    }

    @Override
    void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Sphere Volume = " + volume);
    }
}

class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        double surfaceArea = 6 * side * side;
        System.out.println("Cube Surface Area = " + surfaceArea);
    }

    @Override
    void calculateVolume() {
        double volume = side * side * side;
        System.out.println("Cube Volume = " + volume);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        circle.calculateArea();
        circle.calculateVolume();

        System.out.println();

        Shape rectangle = new Rectangle(10, 5);
        rectangle.calculateArea();
        rectangle.calculateVolume();

        System.out.println();

        Shape sphere = new Sphere(5);
        sphere.calculateArea();
        sphere.calculateVolume();

        System.out.println();

        Shape cube = new Cube(5);
        cube.calculateArea();
        cube.calculateVolume();
    }
}