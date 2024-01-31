import java.util.Scanner;

class integer
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number of rows:");
        int rows = scan.nextInt();

        System.out.print("enter number of collums:");
        int cols = scan.nextInt();
         String[][]resultArray = new String[rows][cols];
        int[][] originalArray = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                originalArray[i][j] = (int) (Math.random()  * 1000) + 1;
            }
        }
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                int number = originalArray[i][j];
                int sqrt = (int) Math.sqrt(number);
                if (sqrt * sqrt == number)
                {
                    resultArray[i][j] = "yes";
                }
                else
                {
                    resultArray[i][j] = "no";
                }
            }
        }
        System.out.println("Result Array");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(resultArray[i][j] + " ");
            } 
        }

    }
}