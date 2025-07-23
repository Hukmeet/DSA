import java.util.*;
public class Username_From_Email {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your email id(no spaces) :... ");
    String s=sc.next();
    boolean atrate=false;
    boolean dot=false;
    String s2="";
    for (int i=0;i<s.length();i++) {
        if (s.charAt(i)=='@')
            atrate=true;
    }
    for (int i=0;i<s.length();i++) {
        if (s.charAt(i)=='.')
            dot=true;
    }
    if ((atrate)&&(dot)) {
        int i=0;
        while (s.charAt(i)!='@') {
            s2+=s.charAt(i);
            i++;
        }
        System.out.println("Username: "+s2);
    }
    else
        System.out.println("The E-mail id u entered is invalid. Try again.");
    sc.close();
    }
}
