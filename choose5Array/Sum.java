import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");

        int size = scan.nextInt();
        int[] myArray = new int[size] ;
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("enter number:");
            myArray[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < myArray.length; i++)
        {
            sum += myArray[i];
        }
        System.out.print("the sum of these numbers is " + sum);
    }
}
