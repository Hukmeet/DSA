import java.util.*;
public class Even {
    public static void even(int n) {
        if (n%2==0)
            System.out.println(n+" is even.");
        else
            System.out.println(n+" is not even.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        even(num);
        sc.close();
    }
}
