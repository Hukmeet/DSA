import java.util.*;
public class Toggle_A_Bit_In_Number {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int n=sc.nextInt();
        System.out.print("Enter the position :... ");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if ((n&bitmask)==0)
            System.out.println("The new number is: "+(bitmask|n));
        else
            System.out.println("The new number is: "+((~(bitmask))&n));
        sc.close();
    }
}
