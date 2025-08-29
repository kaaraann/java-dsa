import java.util.Scanner;

class Char {
  public static void main(String[] args) {

    System.out.println("Enter yours value here");

    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
      System.out.println(ch + " is a Alphabet ");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println(ch + " is Digit ");
    } else {
      System.out.println(ch + " is a Spl char ");
    }
  }
}
