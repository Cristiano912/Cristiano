import java.util.Scanner;

class average
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");
        int size = scan.nextInt();
        int[]myArray = new int[size];

        System.out.print("enter a number ");
        for(int i = 0; i < myArray.length; i++)
        {
          myArray[i] = scan.nextInt();
        }

        int sum = 0;
         for(int i = 0; i < myArray.length; i++)
        {
            sum += myArray[i];
        }
        double average = (double) sum / myArray.length;
        System.out.print("the average of the elements" + average);

    }
}