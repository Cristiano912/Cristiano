import java.util.Scanner;

class integer
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array");
        
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.print("enter value");
        
        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;
        boolean palindrome = true;

        while(left < right)
        {
            if(arr[left] != arr[right])
            {
                palindrome = false;
            }
            
            left++;
            right--;
        }

        if (palindrome)
        {
             System.out.print("this is a palindrome");
        }
        else
        {
             System.out.print("this is not a palindrome");
        
        }
    }
}

