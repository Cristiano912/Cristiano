import java.util.Scanner;

class LetterCounter 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word: ");
        
        String userWord = scan.nextLine();
        System.out.print("Enter the letter you want to find: ");
        char letter = scan.next().charAt(0);
        int count = countLetter(userWord, letter);
        System.out.println("this letter" + letter + "appears" + count + "times in the word" + userWord);
    }

    public static int countLetter(String word, char letter) 
    {
        int count = 0;
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == letter) 
            {
                count++;
            }
        }
        return count;
    }
}


