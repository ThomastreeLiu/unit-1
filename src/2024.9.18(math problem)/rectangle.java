//Author:Thomas
//Name:rectangle
//Purpose:Calculate the area & perimeter of the rectangle

import java.util.Scanner;

public class rectangle {
        public static void main (String args []){
            System.out.println("Calculate the area & perimeter of the rectangle\n"+"Now input the length in meter\n");
            Scanner scan = new Scanner(System.in);
            double length = scan.nextDouble();
            System.out.println("Now input the width in meter\n");
            double width = scan.nextDouble();
            double area = length*width;
            double perimeter = 2*length+2*width;
            System.out.println("The area of this rectangle is "+area+" square meters.\n");
            System.out.println("The perimeter of this rectangle is "+perimeter+" meters.");
        }
    }

