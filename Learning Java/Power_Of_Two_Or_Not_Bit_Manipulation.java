import java.util.*;
public class Power_Of_Two_Or_Not_Bit_Manipulation {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        if ((num>0)&&(num&(num-1))==0)
            System.out.println(num+" is a power of 2.");
        else
            System.out.println(num+" is not a power of 2.");
        sc.close();
    }
}