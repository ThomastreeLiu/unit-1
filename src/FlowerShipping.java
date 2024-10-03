//Author:Thomas
//Name:FlowerShipping
//purpose:calculate the number of box needed minimum

import java.util.Scanner;
public class FlowerShipping {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of flower pots");
        int numPots = scan.nextInt();
        int numVeryBig = numPots/9;
        numPots = numPots%9;

        int total = numVeryBig;

        int numBig = numPots/4;
        numPots = numPots%4;

        total = total+numBig+numPots;
        System.out.println(numVeryBig+" Very Big Box,\n"+numBig+" Big Box,");
        System.out.println(numPots+" Small Box,\n"+total+" Total");

    }
}
