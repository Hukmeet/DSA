import java.util.*;
public class Matrix_Spiral_Order {
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
        System.out.println("The array elements in spiral order are: ");
        int rs=0;
        int cs=0;
        int re=r-1;
        int ce=c-1;
        while ((rs<=re)&&(cs<=ce)) {
            for (int j=cs;j<=ce;j++)
                System.out.print(arr[rs][j]+" ");
            rs++;
            for (int i=rs;i<=re;i++)
                System.out.print(arr[i][ce]+" ");
            ce--;
            for (int j=ce;j>=cs;j--)
                System.out.print(arr[re][j]+" ");
            re--;
            for (int i=re;i>=rs;i--)
                System.out.print(arr[i][cs]+" ");
            cs++;
        }
        sc.close();
    }
}