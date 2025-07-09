import java.util.*;
public class Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :... ");
        double num1=sc.nextDouble();
        System.out.print("Enter another number :... ");
        double num2=sc.nextDouble();
        System.out.print("Enter an operation (+,-,*,/) :... ");
        char op=sc.next().charAt(0);
        switch (op) {
            case '+' -> System.out.println("Sum : "+num1+" + "+num2+" = "+(num1+num2));
            case '-' -> System.out.println("Difference : "+num1+" - "+num2+" = "+(num1-num2));
            case '*' -> System.out.println("Product : "+num1+" * "+num2+" = "+(num1*num2));
            case '/' -> System.out.println("Quotient : "+num1+" / "+num2+" = "+(num1/num2));
            default -> System.out.println("Enter a valid operation...(T-T)");
        }
        sc.close();
    }    
}
