import java.util.*;
import java.lang.Math;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value :... ");
        int m=sc.nextInt();
        System.out.print("Enter the poewr value :... ");
        int n=sc.nextInt();
        System.out.println(m+" raised to the power "+n+" is: "+Math.pow(m, n));
        sc.close();
    }
}
