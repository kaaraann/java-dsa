public class Ex28 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        for (int i = 1; i <= row; i++) {
            char ch = 'A';
            for (int j = 1; j <= col; j++) {
                System.out.print(ch++ + "   ");
            }
            System.out.println();
        }
    }
}
