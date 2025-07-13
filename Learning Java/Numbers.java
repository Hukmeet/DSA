import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch="";
        int pos_cnt=0,neg_cnt=0,zer_cnt=0;
        do {
            System.out.print("Enter the number :... ");
            int num=sc.nextInt();
            System.out.print("Do you wanna enter another number? (y/n) :... ");
            ch=sc.next();
            if (num>0)
                pos_cnt++;
            else if (num==0)
                zer_cnt++;
            else
                neg_cnt++;
        }while (ch.equalsIgnoreCase("y"));
        System.out.println("The number of positive numbers you entered is: "+pos_cnt);
        System.out.println("The number of negative numbers you entered is: "+neg_cnt);
        System.out.println("The number of zeroes you entered is: "+zer_cnt);
        sc.close();
    }
}
