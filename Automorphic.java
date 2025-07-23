

import java.util.Scanner;
class Automorphic {

public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Your values :");
  int num = sc.nextInt();
  int temp = num;
  int sqrt = num*num;

  
  while(num!=0){
    int rem1 = num%10;
    int rem2 = sqrt%10;
   
     if(rem1==rem2){
     num = num/10;
     sqrt= sqrt/10;
     }
     else break;
   }

 if(num==0){
   System.out.println(temp+" is a Automorphic ");
     }
 else{
   System.out.println(temp+" is  not a Automorphic ");
     }
   }
 }  