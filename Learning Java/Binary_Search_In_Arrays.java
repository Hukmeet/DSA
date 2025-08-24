import java.util.Scanner;
public class Binary_Search_In_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean valid;
        do {
            valid=true;
            System.out.println("Enter the array elements:");
            for (int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            for (int i=0;i<size-1;i++) {
                if (arr[i+1]<arr[i])
                    valid=false;
            }
            if (!valid)
                System.out.println("Invalid!!!\nWe need a sorted array to apply binary search on...");
        } while (!valid);
        System.out.print("Enter the element to search for :... ");
        int ele=sc.nextInt();
        int start=0,end=size-1;
        int index=-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (ele<arr[mid])
                end=mid-1;
            else if (ele>arr[mid])
                start=mid+1;
            else {
                index=mid;
                break;
            }
        }
        if (index==-1)
            System.out.println(ele+"not found in array.");
        else
            System.out.println(ele+" found at index "+index);
        sc.close();
    }
}