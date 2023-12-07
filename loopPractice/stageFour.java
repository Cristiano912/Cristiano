import java.util.Scanner;
class stageFour
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        int num = 0;
        System.out.print("enter a number ");

        if(scan.hasNextInt())
        {
            int smallest = scan.nextInt();
            int largest = smallest;  
            char choice = 'y';

            while(choice == 'y')
            {
                System.out.print("keep typing numbers if you want to but type n to stop");

                if(scan.hasNextInt())
                {
                    num = scan.nextInt();
                }
                if(num < smallest)
                {
                    smallest = num;
                }
                if(num > largest)
                {
                    largest = num;
                }
                 System.out.print("are you done entering values y/n");
                 choice = scan.next().charAt(0);
            
            System.out.print("the largest number entered was " + largest);
            System.out.print("the smallest number entered was " + smallest);
            }
        }
        
        
    }
}