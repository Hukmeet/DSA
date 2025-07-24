import java.util.*;
public class Username_From_Email_By_String_Builder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email id(no spaces) :... ");
        String str=sc.next();
        StringBuilder s=new StringBuilder(str);
        boolean atrate=false;
        boolean dot=false;
        int index=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='@') {
                index=i;
                atrate=true;
                break;
            }
        }
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='.') {
                dot=true;
                break;
            }
        }
        if ((atrate)&&(dot)) {
            System.out.println("Username: "+s.substring(0,index));
        }
        else
            System.out.println("The E-mail id u entered is invalid. Try again.");
        sc.close();
    }
}
