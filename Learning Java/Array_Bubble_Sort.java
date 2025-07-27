import java.util.*;
public class Array_Bubble_Sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<size-1;i++) {
            for (int j=0;j<size-(i+1);j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is:");
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
