import java.util.Scanner;

/**
 * While loops/sum/average/max/min
 * @author Murat Furkan Uðurlu
 * @version 31/10/2019
 */ 
public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int sum;
      int value;
      int n;
      double average;
      int max;
      int min;
      
      // program code
      System.out.println(" Please enter 3 values");
      value = scan.nextInt();
      sum = value;
      n = 0;
      average = 0;
      max = value;
      min = value;
      
      while ( n < 2)
      {
         value = scan.nextInt();
         sum = sum + value;
         n++;
         if ( value > max )
         { 
            max = value;
         }
         if ( value < min )
         {
            min = value;
         }
      }
      average = ( sum / (double) (n+1) );
      System.out.println(" The sum is " + sum + " while the number of values is 100");
      System.out.println(" The average is " + average );
      System.out.println(" The maximum value is " + max );
      System.out.println(" The minimum value is " + min );
   }
}


