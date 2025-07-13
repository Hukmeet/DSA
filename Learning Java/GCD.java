import java.util.*;
public class GCD {
    public static int gcd(int a,int b) {
        int rem=a%b;
        if (rem==0)
            return b;
        else {
            a=b;
            b=rem;
            return (gcd(a,b));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :... ");
        int a=sc.nextInt();
        System.out.print("Enter the second number :... ");
        int b=sc.nextInt();
        System.out.println("The greatest common devisor of "+a+" and "+b+" is: "+gcd(a,b));
        sc.close();
    }
}
