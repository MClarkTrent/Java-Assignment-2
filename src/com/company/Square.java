package com.company;

class Square extends Rectangle{

    //Fields (D1)
    private double side;

    //constructor (D2)
    public Square(double side, double side1, double side2){
        //pass from super
        super(side1, side2);

        //Set side1 and side2
        side1 = side;
        side2 = side;
    }

    //Override getArea from GeometricObject (D3)
    @Override
    public double getArea(){
        return (side * side);
    }

    //Override getPerimeter from GeometricObject (D4)
    @Override
    public double getPerimeter(){
        return (4 * side);
    }

}//End of Class
