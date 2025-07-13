import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit :... ");
        int n=sc.nextInt();
        int a=0,b=1,term;
        System.out.println("Here goes the series: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0;i<n-2;i++) {
            term=a+b;
            System.out.print(term+" ");
            a=b;
            b=term;
        }
        System.out.println("...");
        sc.close();
    }
}