import java.util.Scanner;
// import java.lang.Math;
public class Rotate_An_Array {
    public static void rev(int arr[],int start, int stop) {
        for (int i=start,j=stop-1;i<j;i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        System.out.print("Enter the coefficient of rotation :... ");
        int k=Math.abs(sc.nextInt());
        rev(arr,0,size-k);
        rev(arr,size-k,size);
        rev(arr,0,size);
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}