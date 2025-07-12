import java.util.*;
import java.lang.Math;
public class Circumference {
    public static double circum(double r) {
        double pi=Math.PI;
        return (2*pi*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius :... ");
        double rad=sc.nextDouble();
        System.out.println("The circumference of circle of radius "+rad+" is: "+circum(rad));
        sc.close();
    }
}