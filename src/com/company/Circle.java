package com.company;

class Circle extends GeometricObject {

    //private variables (A1/A2)
    private double centerX;
    private double centerY;
    private double radius;

    //Constructor (A3) -- Create object
    public Circle(){ }
    //Constructor (A3) -- Set default properties
    public Circle(double centerX, double centerY, double radius){
        this.centerX = 0.0;
        this.centerY = 0.0;
        this.radius = 1.0;
    }

    //Constructor (A4) -- Set specified properties
    public Circle(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    //get center cordinates (A1)
    public double getCenterX() { return centerX; }
    public double getCenterY() { return centerY; }
    //get radius (A2)
    public double getRadius() { return radius; }

    //Override getArea from GeometricObject Class (A5)
    public double getArea(){ return (radius * radius * Math.PI); }

    //Override getPerimeter from GeometricObject Class (A6)
    public double getPerimeter(){return (2 * Math.PI * (radius * 2))}


}// End of classs