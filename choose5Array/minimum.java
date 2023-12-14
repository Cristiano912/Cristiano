import java.util.Scanner;

class minimum
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");

        int size = scan.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            array[i] = scan.nextInt();
        }

        int minValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < minValue)
            {
                minValue = array[i];
            }
        }
         System.out.print("the lowest value was " + minValue);

    }
}