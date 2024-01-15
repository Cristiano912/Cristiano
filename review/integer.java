import java.util.Scanner;

class integer
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter an number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= 10; i++ )
        {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result );
        }
    }
}

