import java.util.Scanner;
class mini3
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("enter your year of birth ");
        int birth = scan.nextInt();

       

        int sum = 2023 - birth;
       System.out.print("your " + sum); 

  }
}