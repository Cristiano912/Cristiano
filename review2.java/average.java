import java.util.Scanner;

class average
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of array:");
        
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.print("enter elements:");
        int sum = 0;
        for (int i = 0;i < size; i++)
        {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum/ size;
        
        System.out.print("Average of the elements" + avg);
    }
}