import java.util.*;
public class Sum_Of_N_Odd_Natural_Numbers {
    public static void sum_odd(int n) {
        int Sum=0;
        for (int i=1;i<=n;i++) {
            if (i%2!=0)
                Sum+=i;
        }
        System.out.println("Sum of all odd natural numbers till "+n+" is: "+Sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit :... ");
        int num=sc.nextInt();
        sum_odd(num);
        sc.close();
    }
}
