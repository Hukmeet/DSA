import java.util.*;
import java.lang.Math;
public class Decimal_To_Any_Base_Less_Than_10 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in decimal :... ");
        int num=sc.nextInt();
        System.out.print("Enter the base(considering base<10) :... ");
        int base=sc.nextInt();
        int ans=0,i=0;
        while (num>0) {
            ans+=((num%base)*(Math.pow(10,i)));
            i++;
            num/=base;
        }
        System.out.println("The number in base "+base+" is : "+ans);
        sc.close();
    }
}
