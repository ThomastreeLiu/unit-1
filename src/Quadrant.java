//Author:Thomas
//Name:Quadrant
//Purpose:enter a point, print a quadrant

import java.util.Scanner;
public class Quadrant {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point, in x,y.\nEnter x");
        double x = scan.nextDouble();
        System.out.println("Enter y");
        double y = scan.nextDouble();

        if (x > 0) {
            if (y > 0)
                System.out.println("This point located at quadrant 1.");
            else if (y < 0)
                System.out.println("This point located at quadrant 4");
            else
                System.out.println("This point is not belongs to any quadrant");
        }

        else if (x <0) {
            if (y >0)
                System.out.println("This point located at quadrant 2");
            else if (y < 0)
                System.out.println("This point locates at quadrant 3");
            else
                System.out.println("This point is not belongs to any quadrant");
        }
        else
            System.out.println("This point is not belongs to any quadrant");

    }
}