import java.util.Scanner;
class stageOne
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number!: ");
    int num = scan.nextInt();
    long factorial = 1;
    for(int i = 1; i <= num; i++)
    {
      factorial *= i;
    }
    System.out.print("factorial of " + num + " is " + factorial);
    }
}
