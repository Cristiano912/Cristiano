import java.util.Scanner;

class search
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to make the size of your array: ");
        int size = scan.nextInt();
        int[] myArray = new int[size] ;

        for(int i = 0; i < size; i++)
        {
            myArray[i] = scan.nextInt();
        }
         System.out.print("enter what you want to search for: ");

         int target = scan.nextInt();

         int index = -1;
         for(int i = 0; i < size; i++)
        {
            if (myArray[i] == target)
            index = i;
        }
        System.out.print("found index at" + index);
    }
}
