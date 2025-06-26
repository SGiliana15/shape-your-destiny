package org.example;

public class Circle extends Shape{
     private double radius;
     private static final double PI = Math.PI;


     public Circle(double radius) {
        this.radius = radius;
     }

     @Override
     public double getArea() {
        return PI * radius * radius;
     }
 
     @Override
     public double getPerimeter() {
        return 2 * PI * radius;
     }
}
    

