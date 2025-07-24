import java.util.Scanner;

class Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = sc.nextInt();  // Take number input from user

    int sum = 0;     // To store sum of digits
    int count = 0;   // To count number of digits

    while(num != 0) {
      int digit = num % 10;  // Get last digit
      sum = sum + digit;     // Add digit to sum
      count = count + 1;     // Increase digit count
      num = num / 10;        // Remove last digit
    }

    double average = (double)sum / count;  // Find average

    System.out.println("Average of digits: " + average);
  }
}
