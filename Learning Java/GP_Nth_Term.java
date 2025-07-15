import java.util.*;
import java.lang.Math;
public class GP_Nth_Term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first term (a) of GP :... ");
        int a=sc.nextInt();
        System.out.print("Enter the common ratio (r) of GP :... ");
        int r=sc.nextInt();
        System.out.print("Enter the index of nth term (n) of GP :... ");
        int n=sc.nextInt();
        double term=a*(Math.pow(r,(n-1)));
        System.out.println("The "+n+"th term of AP is: "+term);
        sc.close();
    }
}
