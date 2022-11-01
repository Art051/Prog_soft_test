package exercises;

import java.util.Scanner;

public class Ex2_ShapeArea
{

        /*
        Calculate the area of a shape using two measurements input by a user:
        The shape has a triangle on each side of the square, just imagine that's what I've drawn. It's a flattened square-based pyramid.

        User provides the following measurements:
        L1 - the height of each triangle
        L2 - the base of the triangle

            /\
           /__\
          |    |
          |____|

        area of triangle = (L1 * L2) / 2
        area of square = L2 * L2
         */

    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args)
    {

        double triangleBase, triangleHeight, triangleArea, squareArea, totalArea;

        //establish triangle's dimensions (the base dimension will be used to calculate the square's area)
        System.out.print("Please enter the base of one of the triangles (L2): ");
        triangleBase = Double.parseDouble(stdin.nextLine());
        System.out.print("Please enter the height of one of the triangles (L1): ");
        triangleHeight = Double.parseDouble(stdin.nextLine());


        triangleArea = (triangleBase * triangleHeight) / 2.00;  //calculate area of 1 triangle
        squareArea = triangleBase * triangleBase;               //calculate area of 1 square
        totalArea = (triangleArea * 4) + squareArea;            //calculate area of 4 triangles plus 1 square

        System.out.printf("The area of each triangle is %.2f^2, the area of the square is %.2f^2 and the total area of the shape is %.2f^2",
                triangleArea,
                squareArea,
                totalArea);

    }
}

