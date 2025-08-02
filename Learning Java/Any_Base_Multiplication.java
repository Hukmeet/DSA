import java.util.Scanner;
import java.lang.Math;
public class Any_Base_Multiplication {
    public static int add(int n1,int n2,int b) {
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
        return ans;
    }
    public static int prod(int n1,int d2,int b) {
        int ans=0,c=0,d1=0,d=0,i=0;
        while (n1>0||c>0) {
            d1=n1%10;
            d=d1*d2+c;
            ans+=((d%b)*(Math.pow(10,i)));
            c=d/b;
            i++;
            n1/=10;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :... ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number :... ");
        int n2=sc.nextInt();
        System.out.print("Enter the base they're in :... ");
        int b=sc.nextInt();
        int ans=0,p=1;
        if (n1>n2) {
            while (n2>0) {
                int prod=prod(n1,n2%10,b);
                ans=add(ans,prod*p,b);
                p*=10;
                n2/=10;
            }
        }
        else {
            while (n1>0) {
                int prod=prod(n2,n1%10,b);
                ans=add(ans,prod*p,b);
                p*=10;
                n1/=10;
            }
        }
        System.out.println("Product : "+ans);
        sc.close();
    }
}