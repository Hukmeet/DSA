import java.util.*;
public class Array_Of_Words_Length {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of words :...");
        int size=sc.nextInt();
        String arr[]=new String[size];
        System.out.println("Enter the words 1-by-1 separated by spaces: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.next();
        int len=0;
        for (int i=0;i<size;i++)
            len+=arr[i].length();
        System.out.println("The combined length of all these strings is: "+len);
        sc.close();
    }
}
