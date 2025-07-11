import java.util.*;
public class Sum_By_Function {
    public static int Sum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a :... ");
        int a=sc.nextInt();
        System.out.print("Enter b :... ");
        int b=sc.nextInt();
        System.out.println(a+" + "+b+" = "+Sum(a,b));
        sc.close();
    }
}
