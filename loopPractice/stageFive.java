import java.util.Scanner;
import java.util.Random;
class stageFive
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rando = random.nextInt(10) + 1;
        System.out.print("guess a number ");
         
        int inputGuess;
        boolean correct = false;

        while(!correct)
        {
            inputGuess = scan.nextInt();
          
        
        if(inputGuess > rando)
        {
             System.out.print("to high, guess again ");
        }
       else if (inputGuess  < rando)
        {
             System.out.print("to low, guess again ");
        }
        else
        {
             System.out.print("congrats you win!");
             correct = true;
        } 
        }
    }
}
        