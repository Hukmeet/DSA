import java.util.*;
public class Table {
    public static void table(int n) {
        for (int i=1;i<=10;i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        table(num);
        sc.close();
    }
}
