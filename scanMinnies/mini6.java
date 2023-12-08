import java.util.Scanner;
class mini6
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("enter a number ");
        int radius = scan.nextInt();

        double area = 3.14159 * radius * radius;
       System.out.print("the area of the circle" + area ); 


  }
}