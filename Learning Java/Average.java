import java.util.*;
public class Average {
    public static double avg(int a,int b,int c) {
        return (a+b+c)/3.0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a :... ");
        int a=sc.nextInt();
        System.out.print("Enter b :... ");
        int b=sc.nextInt();
        System.out.print("Enter c :... ");
        int c=sc.nextInt();
        System.out.println("The average of "+a+", "+b+" and "+c+" is: "+avg(a,b,c));
        sc.close();
    }
}