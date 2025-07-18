import java.util.*;
public class Sorted_Array_Or_Not {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        boolean sorted=true;
        for (int i=0;i<size-1;i++) {
            if (arr[i]>arr[i+1]) {
                sorted=false;
                break;
            }
        }
        if (sorted)
            System.out.println("Yes, the array is sorted in ascending order.");
        else
            System.out.println("No, the array is not sorted in ascending order.");
        sc.close();
    } 
}
