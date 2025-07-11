import java.util.*;
public class Product_By_Function {
    public static Double Product(Double a,Double b) {
        return (a*b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a :... ");
        double a=sc.nextDouble();
        System.out.print("Enter b :... ");
        double b=sc.nextDouble();
        System.out.println(a+" x "+b+" = "+Product(a,b));
        sc.close();
    }
}
