import java.util.*;;
public class ABC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("No of days A need to finish job :... ");
        float x=sc.nextFloat();
        System.out.print("No of days B need to finish job :... ");
        float y=sc.nextFloat();
        System.out.print("No of days C need to finish job :... ");
        float z=sc.nextFloat();
        float days=(x*y*z)/(x*y+y*z+z*x);
        System.out.println("The no of days A,B and C take to finish the job together is: "+days);
        sc.close();
    }
}
