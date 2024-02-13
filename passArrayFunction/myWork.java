class myWork
{
    public static double calculateAverage(int[]arr)
    {

        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum / arr.length;
    }
        public static void main(String args[])
        {
            int[] myArray={10 ,20 ,30 ,40 ,50 };

            System.out.print("Array: ");
            for (int i = 0; i < myArray.length; i++)
            {
                System.out.print(myArray [i]+" " );
            }
            double average = calculateAverage(myArray);
            System.out.print("Average" + average);
        }

}