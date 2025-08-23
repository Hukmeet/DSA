import java.util.Scanner;
import java.lang.Math;
public class Subsets_Of_An_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("The subsets are:");
        for (int i=0;i<(int)Math.pow(2,size);i++) {
            String binary=Integer.toBinaryString(i);
            int len=binary.length();
            for (int j=0;j<(size-len);j++) {
                binary='0'+binary;
            }
            for (int j=0;j<size;j++) {
                if (binary.charAt(j)=='1')
                    System.out.print(arr[j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
