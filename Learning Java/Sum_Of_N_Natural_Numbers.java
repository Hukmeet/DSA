import java.util.*;
public class Sum_Of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit :... ");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++) {
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
        sc.close();
    }    
}
