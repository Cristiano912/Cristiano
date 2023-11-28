import java.util.Scanner;

class arrayTime
{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scan.nextInt();
        scan.nextLine(); 

        int array [] = new int[num];
      
        for(int i = 0; i < num; i++)
        {
            System.out.println("enter a number");
            array[i]=scan.nextInt();
        }
        System.out.print("the array is ");
        for(int i = 0; i < num; i++)
        {
        
            System.out.print(array[i]);
            if(i < num - 1) 
            {

            } 
        }
    }
}   

