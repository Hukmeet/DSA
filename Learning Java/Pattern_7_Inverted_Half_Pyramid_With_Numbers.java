public class Pattern_7_Inverted_Half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        for (int i=5;i>0;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
