import java.util.*;
public class AP_Nth_Term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first term (a) of AP :... ");
        int a=sc.nextInt();
        System.out.print("Enter the common difference (d) of AP :... ");
        int d=sc.nextInt();
        System.out.print("Enter the index of nth term (n) of AP :... ");
        int n=sc.nextInt();
        int term= a+(n-1)*d;
        System.out.println("The "+n+"th term of AP is: "+term);
        sc.close();
    }
}
