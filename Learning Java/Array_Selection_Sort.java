import java.util.*;
public class Array_Selection_Sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<size;i++) {
            int min=i;
            for (int j=i+1;j<size;j++) {
                if (arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted array is:");
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
