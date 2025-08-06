import java.util.Scanner;
public class Print_All_Subarrays {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("All the subarrays of this array are: ");
        for (int i=0;i<size;i++) {
            for (int j=i;j<size;j++) {
                for (int k=i;k<=j;k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}
