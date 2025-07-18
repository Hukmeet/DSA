import java.util.*;
public class Average_In_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        for (int i=0;i<size;i++)
            sum+=arr[i];
        System.out.println("The average of all elements in your array is: "+(sum/(double)size));
        sc.close();
    }
}
