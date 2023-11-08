import java.util.Scanner;

class stringReverb 
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("enter anything and i will reverse it and more with magic!: ");
    String magic = scan.nextLine();

    for (int i = 0; i <= magic.length(); i++) 
    {
      for (int j = magic.length() - 1; j >= i; j--) 
      {
        System.out.print(magic.charAt(j));
        if (j > i) 
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.print("Told you i have magic! ");
  }
}