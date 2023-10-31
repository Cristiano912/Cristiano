
import java.util.Scanner;

class assinOne
{ 
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a number: ");
    int number = scan.nextInt();
    
    if(number % 2 == 0)
    {
      System.out.print(number + " is even");
    }
    else
    {
      System.out.print(number + " is odd");
    }
  }
}
