public class Ex26 {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        char ch = 'A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(ch + "   ");
            }
            ch++;
            System.out.println();
        }
    }
}
