public class Pattern_5_Inverted_Half_Pyramid_Rotated_By_180_deg {
    public static void main(String[] args) {
    for (int i=1;i<=4;i++) {
        for (int j=4-i;j>0;j--) {
            System.out.print("  ");
        }
        for (int j=1;j<=i;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }   
    }
}
