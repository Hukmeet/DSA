import java.util.*;
public class Reverse_String_By_String_Builder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a srting :... ");
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        for (int i=0;i<(s.length()/2);i++) {
            int f=i,b=s.length()-(i+1);
            char fCh=s.charAt(i),bCh=s.charAt((s.length()-(i+1)));
            s.setCharAt(f,bCh);
            s.setCharAt(b,fCh);
        }
        System.out.println("The reversed string is: "+s);
        sc.close();
    }
}
