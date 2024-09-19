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
        System.out.println("Now input the h in meters");
        double h =scan.nextDouble();
        double area = (a+b)*h/2;
        double perimeter = a+b+c+d;
        System.out.println("Area of the trapezoid is "+area+" square meters.\n" +
                "Perimeter of the trapezoid is "+perimeter+" meters.");


    }
}
