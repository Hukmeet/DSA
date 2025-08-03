import java.util.Scanner;
public class Span_Of_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<size;i++) {
            if (arr[i]<min)
                min=arr[i];
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("The span of these numbers is: "+(max-min));
        sc.close();
    }
}