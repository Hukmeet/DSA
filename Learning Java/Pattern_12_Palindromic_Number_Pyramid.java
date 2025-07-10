public class Pattern_12_Palindromic_Number_Pyramid {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++) {
            for (int j=5-i;j>0;j--) {
                System.out.print("  ");
            }
            for (int j=i;j>0;j--) {
                System.out.print(j+" ");
            }
            if (i!=1) {
                for (int j=2;j<=i;j++) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
