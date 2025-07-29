import java.util.*;
public class Digits_Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        System.out.print("Enter the digit :... ");
        int dig=sc.nextInt();
        int cnt=0;
        while (num>0) {
            if (num%10==dig)
                cnt++;
            num/=10;
        }
        System.out.println("Frequency of "+dig+" in "+num+" is: "+cnt);
        sc.close();
    }
}