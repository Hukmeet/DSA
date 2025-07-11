import java.util.*;
public class Hello_By_Function {
    public static void Hello(String name) {
        System.out.println("Hello, "+name+"!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's ur name :... ");
        String name=sc.nextLine();
        Hello(name);
        sc.close();
    }
}
