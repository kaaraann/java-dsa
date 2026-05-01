public class Ex29 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        char ch = 'A';
        int a = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j % 2 == 0)
                    System.out.print(a++ + "  ");
                else
                    System.out.print(ch++ + "  ");
            }
            System.out.println();
        }
    }
}
