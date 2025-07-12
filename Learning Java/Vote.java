import java.util.*;
public class Vote {
    public static boolean vote(int age) {
        if (age>18)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age :... ");
        int age=sc.nextInt();
        System.out.println("The status of your eligibility to vote is: "+vote(age)+".");
        sc.close();
    }
}