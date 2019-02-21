package com.company;

public class EquilateralTriangle extends Triangle {

    //Define fields (B1)
    private double side;

    //Constructor (B2)
    public EquilateralTriangle(double side, double side1, double side2, double side3){
        super(side1, side2,side3);
        this.side = side;

        //Set Values of sides from Triangle Class
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

}// End of Class


