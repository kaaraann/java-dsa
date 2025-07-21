import java.util.Scanner;

class AreaCircle{
  public static void main(String args[]){
   System.out.println("Enter the Value to find the area of circle");
   Scanner sc = new Scanner(System.in);
   double r = sc.nextDouble();
   double arc = 3.142 * r * r;
   System.out.println("Area of circle for given radius:" +arc);
  }
 }