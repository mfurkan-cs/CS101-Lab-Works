import java.util.Scanner;

/**
 * While loops Part c
 * @author Murat Furkan U?urlu 
 * @version 31/10/2019
 */ 
public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int value;
      double average;
      int sum;
      int min;
      int max;
      int n;
      
      // program code
      System.out.println( "Please enter the value that shows how many values you want to enter; if you enter a negative value, the program will count only positive numbers before negative end quit!");
      value = scan.nextInt();
      n = 0;
      sum = 0;
      average = 0;
      min = value;
      max = value;
      if ( value < 0 )
      {
         System.out.println(" error...");
      }
      
      else
         while ( value >= 0 )
      {
         if ( value > max )
         { 
            max = value;
         }
         if ( value < min )
         {
            min = value;
         }
         sum = sum + value;
         n++;
         value = scan.nextInt();
      }
      average = sum / (double) (n);
      System.out.println(" The average is " + (average) );
      System.out.println(" The minimum value is " + min );
      System.out.println(" The maximum value is " + max );
   }
}

