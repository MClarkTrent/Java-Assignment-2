package com.company;

class Rectangle extends GeometricObject {

    //Fields (C1)
    public double side1,side2;

    //No arg constructor -- Default Values(C2)
    public Rectangle(){
        this.side1 = 1;
        this.side2 = 1;
    }

    //Constructor -- Set specified values (C3)
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    //Override from GeometricObject (C4)
    @Override
    public double getArea() {
        return (side1 * side2);
    }

    //Override from GeometricObject (C5)
    @Override
    public double getPerimeter() {
        return (2 * (side1+side2));
    }
}//End of Class
