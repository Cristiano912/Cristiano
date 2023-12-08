import java.util.Scanner;
import java.util.Random;
class picked1
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Rock paper scizors Beak:enter 1 for Rock, 2 for Paper, 3 for Scizors: ");
        
        int userChoice = scan.nextInt();

        int computerChoice = random.nextInt(3) + 1;
        System.out.print("the computer chose " + computerChoice );

     
        
        if(userChoice == computerChoice)
        {
            System.out.print("Tie!" );
        }
        else if((userChoice == 1 && computerChoice == 3) ||
        (userChoice == 2 && computerChoice == 1) ||
        (userChoice == 3 && computerChoice == 2))
        {
            System.out.print("You win" );
        }
        else
        {
            System.out.print("You lose" );
        }
    }
}