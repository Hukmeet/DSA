import java.util.*;
public class LCM {
    public static int gcd(int a,int b) {
        if (a>b) {
            int rem=a%b;
            if (rem==0)
                return b;
            else {
                a=b;
                b=rem;
                return (gcd(a,b));
            }
        }
        else
            return (gcd(b,a));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :... ");
        int a=sc.nextInt();
        System.out.print("Enter the second number :... ");
        int b=sc.nextInt();
        System.out.println("The least commom multiple of "+a+" and "+b+" is: "+((a*b)/gcd(a,b)));
        sc.close();
    }
}
