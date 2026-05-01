public class Ex9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j != 2) || (i == n && j != 4) || (j == 1 && i != 4)
                        || (j == n && i != 2) || (i == n / 2 + 1) || (j == n / 2 + 1)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }

}
