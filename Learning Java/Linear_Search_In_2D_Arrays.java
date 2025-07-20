import java.util.*;
public class Linear_Search_In_2D_Arrays {
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
        System.out.print("Enter the element you want to search for :... ");
        int ele=sc.nextInt();
        System.out.println("List of indices at which the element was found: ");
        boolean present=false;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (arr[i][j]==ele) {
                    present=true;
                    System.out.println("Row index: "+i+", Column index: "+j);
                }
            }
        }
        if (!present)
            System.out.println("None");
        sc.close();
    }
}