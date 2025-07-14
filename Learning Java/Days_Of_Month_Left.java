import java.util.*;
public class Days_Of_Month_Left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter today's date in dd-mm-yyyy: ");
        System.out.print("Enter thr value of dd :... ");
        int dd=sc.nextInt();
        System.out.print("Enter thr value of mm :... ");
        int mm=sc.nextInt();
        System.out.print("Enter thr value of yyyy :... ");
        int yyyy=sc.nextInt();
        switch (mm) {
            case 1,3,5,7,8,10,12:
                System.out.println("No. of days left this month are: "+(31-dd));
                break;
            case 4,6,9,11:
                System.out.println("No. of days left this month are: "+(30-dd));
                break;
            case 2:
                if (yyyy%4==0)
                    System.out.println("No. of days left this month are: "+(29-dd));
                else
                    System.out.println("No. of days left this month are: "+(28-dd));
                break;
            default:
                System.out.println("Enter a valid date.");
                break;
        }
        sc.close();
    }
}