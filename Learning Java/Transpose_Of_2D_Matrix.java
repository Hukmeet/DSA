import java.util.*;
public class Transpose_Of_2D_Matrix {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows in the matrix :... ");
        int n=sc.nextInt();
        System.out.print("Enter the no. of columns in the matrix :... ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the matrix elements: ");
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println("The transpose of the matrix is: ");
        for (int j=0;j<m;j++) {
            for (int i=0;i<n;i++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
