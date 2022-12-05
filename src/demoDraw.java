public class demoDraw {
    public static void main(String[] args) {
        for (int k = 0; k < 7; k++) {

            int i = k;
            int j = 0;
            for (; i < 7; i++) {
                System.out.print(" ");
            }
            for (; j<=k ; j++) {
                System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
