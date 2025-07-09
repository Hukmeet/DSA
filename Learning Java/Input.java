import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name??");
        String name=sc.next();
        System.out.println("Hello, "+name+"!");
        sc.close();
    }    
}
