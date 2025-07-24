import java.util.*;
public class Replace_E_By_I_In_Word_By_String_Builder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word :... ");
        String str=sc.next();
        StringBuilder s=new StringBuilder(str);
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='e')
                s.setCharAt(i,'i');
        }
        System.out.println("The updated string is: "+s);
        sc.close();
    }
}
