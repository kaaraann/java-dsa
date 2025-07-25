import java.util.Scanner;

class AverageOfFac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("Factors of " + num + " are: ");
        // Logic For factorial Number to find the Average of it.
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
                count++;
            }
        }

        double average = (double)sum / count;
        System.out.println("\nAverage of factors: " + average);
    }
}
