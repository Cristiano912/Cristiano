import java.util.Scanner;
class mini4
{
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
         
        System.out.print("enter a tempeture ");
        int tempeture = scan.nextInt();
       
        System.out.print("enter c to convert to Celcius and f to covert to Fehrenheit ");
       char unit = scan.next().charAt(0);

       int convertedTempeture = 0;

       if(unit == 'c')
       {
        convertedTempeture = (tempeture * 9/5) + 32;
        System.out.print("tempeture in fehrenheit " + convertedTempeture);
       }
       else if(unit == 'f')
       {
        convertedTempeture = (tempeture - 32) * 5 / 9;
        System.out.print("tempeture in Celsius" + convertedTempeture);
       }
  }
}