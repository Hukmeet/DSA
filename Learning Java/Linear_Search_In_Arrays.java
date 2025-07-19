import java.util.*;
public class Linear_Search_In_Arrays {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element you want to search for :... ");
        int ele=sc.nextInt();
        System.out.println("List of indices at which the element was found: ");
        boolean present=false;
        for (int i=0;i<size;i++) {
            if (ele==arr[i]) {
                present=true;
                System.out.print(i+" ");
            }
        }
        if (!present)
            System.out.println("None");
        sc.close();
    }    
}
