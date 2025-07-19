import java.util.*;
public class Two_D_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows in the array :... ");
        int r=sc.nextInt();
        System.out.print("Enter the no. of columns in the array :... ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
