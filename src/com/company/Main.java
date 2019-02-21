package com.company;

public class Main {

    public static void main(String[] args) {

        //Welcome Message
        System.out.println("welcome -- this program will find the area and perimeter of geometric shapes");
        System.out.println(" ");

        //Create Geometric Object Array
        GeometricObject gObject[] = new GeometricObject [5];

        //Fill Array
        gObject[0] = new Circle(5,5,5); //Circle
        gObject[1] = new Triangle(5,5,5); //Triangle
        gObject[2] = new EquilateralTriangle(5,0, 0, 0); //Equilateral Triangle
        gObject[3] = new Rectangle(5, 5); //Rectangle
        gObject[4] = new Square(5, 0, 0); //Square

        //Get Area and Perimeter of Object
        for(Integer i = 0;i < 5; i++){
            printAreaAndPerimeter(gObject,i);
        }

        //End Message
        System.out.println(" ");
        System.out.println("Complete -- Ending Program");


    }//End of Main method


    private static void printAreaAndPerimeter(GeometricObject gObject[], Integer i) {
        //Retrieve Area and Perimeter
        double area = gObject[i].getArea();
        double perimeter = gObject[i].getPerimeter();

        //Print results
        System.out.println("Area: " + area + " --- Perimeter: "+ perimeter);
    }

}//End of Class
