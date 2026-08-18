import java.util.Scanner;

abstract class Shape {
    int length, breadth, radius;
    Scanner sc = new Scanner(System.in);

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.print("Enter base: ");
        length = sc.nextInt();

        System.out.print("Enter height: ");
        breadth = sc.nextInt();

        double area = 0.5 * length * breadth;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.print("Enter radius: ");
        radius = sc.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class Demo {
    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.printArea();

        s = new Triangle();
        s.printArea();

        s = new Circle();
        s.printArea();
    }
}