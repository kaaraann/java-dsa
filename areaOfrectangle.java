import java.util.Scanner;
class areaOfrectangle{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your length:");
   double length = sc.nextDouble();
   System.out.println("Enter your width:");
   double width = sc.nextDouble();

   double res = Areaofrectangle(length, width);
   System.out.println("area of the rectangle:" +res);
   
  }
   public static double Areaofrectangle(double length, double width){
     return length * width; 
  }
 }