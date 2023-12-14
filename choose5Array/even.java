import java.util.Scanner;

class average
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");

        int size = scan.nextInt();
        int[] numbers = new int[size] ;

        for(int i = 0; i < size; i++)
        {
            numbers[i] = scan.nextInt();
        }

        int evenCount = 0;

        System.out.print("even numbers in the array: ");

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                System.out.print(numbers[i] + " ");
                evenCount++;
            }
        }
    
    }
}