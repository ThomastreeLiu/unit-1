import java.util.Scanner;

public class cone {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate the volume & surface area of a cone.\n"+
                "Now input the radius of the cone in meter.\n");

        double radius = scan.nextDouble();
        System.out.println("Now input the height of the cone");
        double height = scan.nextDouble();;


        double radiusc = Math.pow(radius,2);
        double heightc = Math.pow(height,2);
        double SA = (Math.pow(radiusc+heightc,-2)+radius)*Math.PI*radius;
        double volume = Math.pow(radius,2)*Math.PI*height/3;

        System.out.println("Volume of the cone is "+volume+" cubic meters.\nSurface area of the cone is "+ SA +" meters.");


    }
}
