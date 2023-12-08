import java.util.Scanner;
class mini5
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("enter amount ");
        int amount = scan.nextInt();

        System.out.print("enter anual interest rate  ");
        int interest = scan.nextInt();

        System.out.print("enter time in years ");
        int time = scan.nextInt();
        
        int simpleInterest = (amount * interest * time) / 100;
        
        System.out.print("simple interest " + simpleInterest);

  }
}