import java.util.Scanner;
import java.lang.Math;
public class Any_Base_Subtraction {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :... ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number :... ");
        int n2=sc.nextInt();
        System.out.print("Enter the base they're in :... ");
        int b=sc.nextInt();
        int ans=0,borrow=0,dig=0,d1=0,d2=0,i=0;
        if (n1>n2) {
            while (n1>0) {
                d1=n1%10;
                d2=n2%10;
                n1/=10;
                n2/=10;
                d1+=borrow;
                if (d1>=d2) {
                    borrow=0;
                    dig=d1-d2;
                }
                else {
                    borrow=-1;
                    dig=d1+b-d2;
                }
                ans+=((dig)*(Math.pow(10,i)));
                i++;
            }
            System.out.println("Difference: "+ans);
        }
        else {
            while (n2>0) {
                d1=n1%10;
                d2=n2%10;
                n1/=10;
                n2/=10;
                d2+=borrow;
                if (d2>=d1) {
                    borrow=0;
                    dig=d2-d1;
                }
                else {
                    borrow=-1;
                    dig=d2+b-d1;
                }
                ans+=((dig)*(Math.pow(10,i)));
                i++;
            }
            System.out.println("Difference: -"+ans);
        }
        sc.close();
    }
}