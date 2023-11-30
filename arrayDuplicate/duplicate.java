import java.util.Scanner;

class duplicate
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter up to 25 values: ");
        int[] values = new int[5];
        int size = 5;
        boolean flag = false;
        int index = -1;
        int i = 0;

        for(int q = 0; q < size; q++)
        {
            int userInput = scan.nextInt();
            values[q] = userInput;
        }

        //System.out.print("Completed");

        while(!flag && i < values.length)
        {
            //System.out.print("Entered Outside");
            for(int j = i + 1; j < size; j++ )
            {
                
                if(values[i] == values[j])
                {
                    flag = true;
                    index = i;
                }

            }
            
        }
        if (flag) 
        {
            System.out.print("theres a dupe! the first dupe to apear was " + values[index]);
        }
    }
}
//Ms. Lindsey
//Define Scanner
//Define an array to be size 25
//Define and itialize int size to be 25
//Define flag = false, i = 0, and j = 0, and index = -1

//For loop through 25 values allowing the user to enter values and inserting them into the array
//[whatever they entered 1st][2nd][3rd][etc.]

/*while(!flag && i < size)
  {
    for(int j = i; j < size; j++)
    {
        if(array[i] == array[j+1])
        {
            flag = true;
            index = i;
        }
    }
    i++
  }
*/

// if flag == true -> There is a duplicated
// else -> no dupe


