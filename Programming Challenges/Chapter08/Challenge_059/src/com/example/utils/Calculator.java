package com.example.utils;

import com.example.geometry.*;

public class Calculator {
    /*
     * 59. Create a simple application with at least two packages:
     * com.example.geometry and com.example.utils. In the geometry
     * package, define classes like Circle and Rectangle. In the utils
     * package, create a Calculator class that can compute areas of these
     * shapes.
     */
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of the circle is: %f\nArea of the rectangle is: %f",
                cirArea, rectArea);
    }
}