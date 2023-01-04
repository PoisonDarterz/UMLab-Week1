package L9Q1;

import java.util.Scanner;

public class Shape {
    static Scanner sc = new Scanner(System.in);
    protected String name;
    protected double perimeter;
    protected double area;

    public Shape(String n){
        this.name = n;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String n) {
        super(n);
        System.out.print("Enter length for " + this.name + ": ");
        this.length = sc.nextDouble();
        System.out.print("Enter width for " + this.name + ": ");
        this.width = sc.nextDouble();
        this.perimeter = 2 * (this.length + this.width);
        this.area = this.length * this.width;
    }
}

class Square extends Shape {
    private double side;

    public Square(String n) {
        super(n);
        System.out.print("Enter side for " + this.name + ": ");
        this.side = sc.nextDouble();
        this.perimeter = 4 * this.side;
        this.area = this.side * this.side;
    }
}

class Circle extends Shape {
    private double diameter;

    public Circle(String n) {
        super(n);
        System.out.print("Enter diameter for " + this.name + ": ");
        this.diameter = sc.nextDouble();
        this.perimeter = Math.PI * this.diameter;
        this.area = Math.PI * Math.pow(this.diameter / 2, 2);
    }
}

class l9q1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle r = new Rectangle("Rectangle");
        Square s = new Square("Square");
        Circle c = new Circle("Circle");

        System.out.println("-----------------------------------------------");
        System.out.println("Rectangle");
        System.out.printf("Perimeter: %.2f\n", r.perimeter);
        System.out.printf("Area: %.2f\n", r.area);
        System.out.println("-----------------------------------------------");
        System.out.println("Square");
        System.out.printf("Perimeter: %.2f\n", s.perimeter);
        System.out.printf("Area: %.2f\n", s.area);
        System.out.println("-----------------------------------------------");
        System.out.println("Circle");
        System.out.printf("Perimeter: %.2f\n", c.perimeter);
        System.out.printf("Area: %.2f", c.area);
    }
}