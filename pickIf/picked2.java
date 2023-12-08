import java.util.Scanner;
class picked2
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number ");
        int num1 = scan.nextInt();

        System.out.print("enter a second number ");
        int num2 = scan.nextInt();

        System.out.print("Pick an operation,*,+,-,/:");
        char operator = scan.next().charAt(0);

        int result = 0;

        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/' && num2 != 0)
        {
            result = num1 /  num2;
        }
           System.out.print("The result is" + result);
    }

}
