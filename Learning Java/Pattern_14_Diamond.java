public class Pattern_14_Diamond {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++) {
            for (int j=4-i;j>0;j--) {
                System.out.print("  ");
            }
            for (int j=1;j<2*(i);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=4;i>0;i--) {
            for (int j=4-i;j>0;j--) {
                System.out.print("  ");
            }
            for (int j=1;j<2*(i);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
