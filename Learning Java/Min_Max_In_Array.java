import java.util.*;
public class Min_Max_In_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<size;i++) {
            if (arr[i]<min)
                min=arr[i];
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("The maximum value in the array is: "+max);
        System.out.println("The minimum value in the array is: "+min);
        sc.close();
    }
}
