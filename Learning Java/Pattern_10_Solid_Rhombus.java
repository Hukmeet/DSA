public class Pattern_10_Solid_Rhombus {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            for (int j=5-(i+1);j>0;j--) {
                System.out.print("  ");
            }
            for (int j=0;j<5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
