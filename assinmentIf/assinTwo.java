import java.util.Scanner;

class assinTwo
{ 
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter your age: ");
    int number = scan.nextInt();
    if(number <= -1 && number >= -1000 )
    {
      System.out.print(" thats not right?");
    }
    if(number >= 1 && number <= 10 )
    {
      System.out.print(" your a child");
    }
    if(number >= 11 && number <= 18 )
    {
      System.out.print(" your a teenager");
    }
    if(number >= 19 && number <= 50 )
    {
      System.out.print(" your a adult");
    }
    if(number >= 51 && number <= 200 )
    {
      System.out.print(" hello senoir citizen!");
    }
  }
}

