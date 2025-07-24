import java.util.*;
public class Pallindrome_By_String_Builder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word :... ");
        String str=sc.next();
        StringBuilder s=new StringBuilder(str.toLowerCase());
        boolean pall=true;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)!=s.charAt(s.length()-(i+1)))
                pall=false;
        }
        if (pall)
            System.out.println(str+" is a pallindrome.");
        else
            System.out.println(str+" is not a pallindrome.");
        sc.close();
    }
}
