public class Ex30 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        char ch = 'A';
        int a = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i >= j)
                    System.out.print(ch++ + "   ");
            }
            System.out.println();
        }
    }
}
