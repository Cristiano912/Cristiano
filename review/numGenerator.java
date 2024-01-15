import java.util.Scanner;
import java.util.Random;

class integer
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       Random random = new Random();

       int randomNumber = random.nextInt(10) + 1;

       int userGuess = 0;

       System.out.println("Guess a number between 1 - 10 " );

       while(userGuess != randomNumber)
       {
            System.out.print("enter a guess:");
            userGuess = scan.nextInt();

            if(userGuess < 1 || userGuess > 10)
            {
                System.out.println("Guess a number between 1 - 10 ");
            }
            else if (userGuess < randomNumber)
            {
                System.out.println("too low");
            }
            else if (userGuess > randomNumber)
            {
                System.out.println("too high");
            }
            else
            {
                System.out.println("congrats!!!!");
            }
       }

    }
}