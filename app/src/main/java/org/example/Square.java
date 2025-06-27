package org.example;

public class Square extends Rectangle implements Polygon{
    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
