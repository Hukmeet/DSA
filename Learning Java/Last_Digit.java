import java.util.*;
public class Last_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int n=sc.nextInt();
        System.out.println("The last digit of "+n+" is: "+(n%10));
        sc.close();
    }
}
