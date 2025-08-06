import java.util.Scanner;
public class Inverse_Of_An_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean valid=true;
        do {
            valid=true;
            System.out.println("Enter unique array elements in range 0-"+(size-1)+":");
            for (int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            for (int i=0;i<size;i++) {
                if (!((arr[i]>=0)&&(arr[i]<size)))
                    valid=false;
            }
            for (int i=0;i<size;i++) {
                int cnt=0;
                for (int j=0;j<size;j++) {
                    if (arr[j]==arr[i])
                        cnt++;
                }
                if (cnt>1)
                    valid=false;
            }
            if (!valid)
                System.out.println("Invalid!!!");
        }while (!valid);
        int ans[]=new int[size];
        for (int i=0;i<size;i++) {
            int val=arr[i];
            ans[val]=i;
        }
        System.out.println("The array elements are: ");
        for (int i=0;i<size;i++)
            System.out.print(ans[i]+" ");
        sc.close();
    }
}