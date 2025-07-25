import java.util.*;
public class No_Of_Ones_In_Binary_Of_Number {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int n=sc.nextInt();
        int cnt=0;
        for (int i=0;i<Integer.toBinaryString(n).length();i++) {
            int bitmask=1<<i;
            if ((n&bitmask)!=0)
                cnt++;
        }
        System.out.println("Number of bits in "+n+" that are 1: "+cnt);
        sc.close();
    }
}