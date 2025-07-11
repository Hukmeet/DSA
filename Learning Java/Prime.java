import java.util.*;
public class Prime {
    public static void prime(int n) {
        boolean pr=true;
        for (int i=2;i<=(n/2);i++) {
            if (n%i==0) {
                pr=false;
                break;
            }
        }
        if (pr)
            System.out.println(n+" is prime.");
        else
            System.out.println(n+" is not prime.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        prime(num);
        sc.close();
    }
}
