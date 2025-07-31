import java.util.*;
import java.lang.Math;
public class Any_Base_Less_Than_10_To_Decimal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in any random base(less than 10) :... ");
        int num=sc.nextInt();
        System.out.print("Enter the base :... ");
        int base=sc.nextInt();
        int ans=0,i=0;
        while (num>0) {
            ans+=((num%10)*(Math.pow(base,i)));
            i++;
            num/=10;
        }
        System.out.println("The number in decimal is : "+ans);
        sc.close();
    }
}
