import java.util.Scanner;
import java.util.Random;
class picked1
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Press enter to activate coin flip ");
        
        scan.nextLine();

        int result = random.nextInt(2);

        if(result == 0)
        {
            System.out.print("heads ");
        }
        else 
        {
            System.out.print("Tails ");
        }
    }
}