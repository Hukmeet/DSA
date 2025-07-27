import java.util.*;
public class Array_Insertion_Sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<size;i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0&&current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("The sorted array is:");
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}