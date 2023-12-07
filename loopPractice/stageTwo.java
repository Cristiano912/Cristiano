import java.util.Scanner;
class stageTwo
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
     System.out.print("enter a word ");
     String input = scan.nextLine();

     System.out.print("Reveresed ");

     for(int i = input.length() - 1; i >= 0; i--)
     {
        System.out.print(input.charAt(i));
     }
  }
}
