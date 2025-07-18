import java.util.*;
public class Even_Count_And_Display_In_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int cnt=0;
        for (int i=0;i<size;i++) {
            if (arr[i]%2==0)
                cnt++;
        }
        int even[]=new int[cnt];
        int j=0;
        for (int i=0;i<size;i++) {
            if (arr[i]%2==0) {
                even[j]=arr[i];
                j++;
            }
        }
        System.out.println("There are "+cnt+" even numbers in the array. These: ");
        for (int i=0;i<cnt;i++)
            System.out.print(even[i]+" ");            
        sc.close();
    }
}
