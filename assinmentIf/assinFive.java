import java.util.Scanner;

class assinFive 
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a vowel: ");
    String input = scan.nextLine();
    
    if (input.length() == 1) 
    {
      char charky = input.charAt(0);
      if (charky == 'a' || charky == 'e' || charky == 'i' || charky == 'o' || charky == 'u')
      {
        System.out.println("That's a vowel");
      } 
      else 
      {
        System.out.println("That's not a vowel");
      }
    }
    else 
    {
      System.out.println("Please enter a single character.");
    }
  }
}



