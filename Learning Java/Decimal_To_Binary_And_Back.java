import java.util.*;
import java.lang.Math;
public class Decimal_To_Binary_And_Back {
    public static StringBuilder bin(int n) {
        StringBuilder binary=new StringBuilder();
        while (n>0) {
            binary.append(n%2);
            n/=2;
        }
        binary.reverse();
        return binary;
    }
    public static double dec(StringBuilder s) {
        double decimal=0;
        for (int i=0;i<s.length();i++ )
            decimal+=(((int)(s.charAt(i))-48)*(Math.pow(2,(s.length()-(i+1)))));
        return decimal;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in decimal format :... ");
        int num=sc.nextInt();
        System.out.println(num+" in binary format is: "+bin(num));
        System.out.println(bin(num)+" in decimal format is: "+dec(bin(num)));
        sc.close();
    }
}
