import java.util.Scanner;
import java.lang.Math;
public class Any_Base_Addition {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :... ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number :... ");
        int n2=sc.nextInt();
        System.out.print("Enter the base they're in :... ");
        int b=sc.nextInt();
        int ans=0,carry=0,dig=0,d1=0,d2=0,i=0;
        while (n1>0||n2>0||carry>0) {
            d1=n1%10;
            d2=n2%10;
            n1/=10;
            n2/=10;
            dig=d1+d2+carry;
            ans+=((dig%b)*(Math.pow(10,i)));
            carry=dig/b;
            i++;
        }
        System.out.println("Sum: "+ans);
        sc.close();
    }
}