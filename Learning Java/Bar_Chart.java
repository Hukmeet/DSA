import java.util.Scanner;
public class Bar_Chart {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of columns :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the sixe of the columns: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<size;i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("The bar cart pattern goes like: ");
        for (int j=max;j>0;j--) {
            for (int i=0;i<size;i++) {
                if (arr[i]<j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
