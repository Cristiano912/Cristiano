import java.util.Scanner;

class reverse
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");
        int size = scan.nextInt();
        
        int[] array = new int[size];

        for(int q = 0; q < size; q++)
        {
            System.out.print("enter value: ");
            array[q] = scan.nextInt();
        }
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }       
        for(int i = 0; i < array.length; i++)
        {
            int value = array[i];
            System.out.print(value);
        }
    }

}