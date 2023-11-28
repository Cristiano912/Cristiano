import java.util.Scanner;

class arrayTime
{
    public static void main(String args[])
    {
        // Asking the user for the number of entries in their array
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scan.nextInt();
        scan.nextLine(); //Do not delete

        //Initializes the array to be the correct size
        int array [] = new int[num];
      
        //Reads in user Values
        for(int i = 0; i < num; i++)
        {
            System.out.println("enter a number");
            array[i]=scan.nextInt();
        }
        System.out.print("the array is");
        for(int i = 0; i < num; i++)
        {
            System.out.print(arrray[i]);
            if(i < num - 1)
        }

    }
}   

