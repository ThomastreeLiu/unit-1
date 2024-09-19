import java.util.Scanner;

public class circle {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate the area & circumference of a circle.\n"+
                "Now input the radius of the circle in meter.\n");
        double radius = scan.nextDouble();
        double area = Math.pow(radius,2)*Math.PI;
        double circumference = radius*Math.PI*2;
        System.out.println("Area of the circle is "+area+" square meters.\nCircumference of the circle is "+circumference+" meters.");


    }
}
