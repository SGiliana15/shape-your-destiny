package org.example;

public class App {
  public static void main(String[] args) {

         Circle circle = new Circle(5);
        System.out.println("Circle");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter() + "\n"); 

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Sides: " + rectangle.numberOfSides() + "\n");

        Square square = new Square(3);
        System.out.println("Square");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Sides: " + square.numberOfSides() + "\n");

        RightTriangle rt = new RightTriangle(3, 4);
        System.out.println("Right Triangle");
        System.out.println("Area: " + rt.getArea());
        System.out.println("Perimeter: " + rt.getPerimeter());
        System.out.println("Sides: " + rt.numberOfSides() + "\n");

        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(6);
        System.out.println("Isosceles Right Triangle");
        System.out.println("Area: " + iso.getArea());
        System.out.println("Perimeter: " + iso.getPerimeter());
        System.out.println("Sides: " + iso.numberOfSides() + "\n");
    }
}