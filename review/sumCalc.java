import java.util.Scanner;

class sumCalc
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("enter an positive integer: ");
        int number = scan.nextInt();

        if (number <= 0)
        {
            System.out.println("enter a positive number: "); 
        }

        int sum = 0;
        int originalNumber = number;

        while (number > 0)
        {
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        System.out.println("the digits of" + originalNumber + "is" + sum); 
    }
}