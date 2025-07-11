import java.util.*;
public class Factorial {
    public static void factorial(int n) {
        if (n<0) {
            System.out.println("Enter a positive value.");
            return;
        }
        int fact=1;
        for (int i=n;i>0;i--) {
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        factorial(num);
        sc.close();
    }
}
