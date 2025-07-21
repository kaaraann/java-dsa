
import java.util.Scanner;
 class ArmstrongNumber{
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your Integer");
 int num = sc.nextInt();
 int num1 = num;
 int num2 = num;
 int count = 0;
 int sum = 0;

 while(num!=0){
   count++;
   num = num / 10;
  }

 while(num1!=0){
   int rem = num1 % 10;
   int pow = 1;
   
   for(int i = 1; i <= count; i++ ){
       pow = pow * rem;
   }
    sum = sum + pow;
    num1 = num1/10; 
 }
   if(num2==sum){
    System.out.println(num2 + " is a ArmstrongNumber ");
   }
   else{
    System.out.println(num2 + " is not a ArmstrongNumber ");
   }
  }
 }