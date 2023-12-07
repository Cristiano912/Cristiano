import java.util.Scanner;
class stageOne
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
     System.out.print("enter a number ");
     int number = scan.nextInt();
    
    long factorial = 1;

    for(int i = 2; i <= number; i++)
    {
      factorial *= i;
    }
    System.out.print("factorial of " + number + " is " + factorial);
  }
}
