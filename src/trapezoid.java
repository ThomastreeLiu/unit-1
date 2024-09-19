import java.util.Scanner;

public class trapezoid {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate the area & perimeter of a trapezoid.\n"+ "watch the graph showed under\n     a");
        System.out.println("   ________\n"+"c /  h |   \\ d\n"+" /_____|____\\\n"+"      b");
        System.out.println("Now input the a in meters");
        double a = scan.nextDouble();
        System.out.println("Now input the b in meters");
        double b = scan.nextDouble();
        System.out.println("Now input the c in meters");
        double c = scan.nextDouble();
        System.out.println("Now input the d in meters");
        double d = scan.nextDouble();
        //double area = Math.pow(radius,2)*Math.PI;
        //double circumference = radius*Math.PI*2;
        //System.out.println("Area of the circle is "+area+"\nCircumference of the circle is "+circumference);


    }
}
