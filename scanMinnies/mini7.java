import java.util.Scanner;
class mini7
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("enter amount in USD:  ");
        int usdAmount = scan.nextInt();

        int exchangeRate = 110;

        int yenAmount = usdAmount * exchangeRate;
        System.out.print("amount in yen:¥" + yenAmount );
  }
}