import java.util.Scanner;
import java.lang.Math;
public class Any_Base_Less_Than_10_To_Any_Base_Less_Than_10 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in any base(less than 10) :... ");
        int num=sc.nextInt();
        System.out.print("Enter the input base :... ");
        int ipb=sc.nextInt();
        System.out.print("Enter the base you want the number in now(less than 10) :... ");
        int opb=sc.nextInt();
        if (ipb>opb) {
            long ans=0;
            int i=0;
            while (num>0) {
                ans+=((num%opb)*(Math.pow(10,i)));
                i++;
                num/=opb;
            }
            System.out.println("\nThe number in base "+opb+" is: "+ans);
        }
        else if (ipb<opb) {
            long ans=0;
            int i=0;
            while (num>0) {
                ans+=((num%10)*(Math.pow(ipb,i)));
                i++;
                num/=10;
            }
            long fans=0;
            int j=0;
            while (ans>0) {
                fans+=((ans%opb)*(Math.pow(10,j)));
                j++;
                ans/=opb;
            }
            System.out.println("The number in base "+ipb+" is: "+fans);
        }
        else
            System.out.println("It's the same thing if the bases are same.");
        sc.close();
    }
}
