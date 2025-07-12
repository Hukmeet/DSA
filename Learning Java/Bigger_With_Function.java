import java.util.*;
public class Bigger_With_Function {
    public static int bigger(int a,int b) {
        if (a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a :... ");
        int a=sc.nextInt();
        System.out.print("Enter b :... ");
        int b=sc.nextInt();
        System.out.println(bigger(a,b)+" is greater.");
        sc.close();
    }
}