import java.util.*;
public class Replace_E_By_I_In_Word {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string(a single word plz) :... ");
        String s=sc.next();
        String s2="";
        for (int i=0;i<s.length();i++) {
            if ((s.charAt(i)=='e')||(s.charAt(i)=='E'))
                s2+="i";
            else
                s2+=s.charAt(i);
        }
        System.out.println("The udpated string is: "+s2);
        sc.close();
    }
}