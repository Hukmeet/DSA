import java.util.*;;
public class Digits {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        System.out.print("The number of digits in "+num+" is: ");
        int cnt=0;
        while (num>0) {
            cnt++;
            num/=10;
        }
        System.out.println(cnt);
        sc.close();
    }
}