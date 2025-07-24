import java.util.*;
public class Array_Of_Words_Length_By_String_Builder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of words :... ");
        int size=sc.nextInt();
        StringBuilder arr[]=new StringBuilder[size];
        System.out.println("Enter the words 1-by-1 separated by white spaces: ");
        for (int i=0;i<size;i++) {
            String str=sc.next();
            arr[i]=new StringBuilder(str);
        }
        int len=0;
        for (int i=0;i<size;i++) {
            len+=arr[i].length();
        }
        System.out.println("The combined length of these words is: "+len);
        sc.close();
    }
}
