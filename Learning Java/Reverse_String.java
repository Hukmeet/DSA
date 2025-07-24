import java.util.*;
public class Reverse_String {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :... ");
        String str=sc.nextLine();
        String str2="";
        for (int i=0;i<(str.length());i++)
            str2+=str.charAt((str.length()-(i+1)));
        System.out.println("The reversed string is: "+str2);
        sc.close();
    }
}
