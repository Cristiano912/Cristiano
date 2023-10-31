import java.util.Scanner;

class assinThree
{ 
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter your grade in number forme: ");
    int number = scan.nextInt();
    if(number >= 1 && number <= 59 )
    {
      System.out.print(" F");
    }
    if(number >= 60 && number <= 69 )
    {
      System.out.print(" D");
    }
    if(number >= 70 && number <= 79 )
    {
      System.out.print(" C");
    }
    if(number >= 80 && number <= 89 )
    {
      System.out.print(" B");
    }
    if(number >= 90 && number <= 100 )
    {
      System.out.print(" A");
    }
  }
}

