package com.company;

class Triangle extends GeometricObject {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    // Constructor
    public Triangle() {
    }

    //Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Override method findArea in GeometricObject
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //Override method getPerimeter in GeometricObject
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //Override the toString method
    public String toString() {
        // Implement it to return the three sides
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}//End of class