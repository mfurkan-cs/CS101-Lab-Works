import java.util.Scanner;

/**
 * Pi Operations 
 * @author Murat Furkan Ugurlu
 * @version 07/11/2019
 */ 
public class lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int n;
      double sum;
      double lastTerm;
      double accuracy;
      double y;
      int m;
      
      // program code
      
      //Using Math.PI function
      lastTerm = 4;
      System.out.println( Math.PI);
      
      //Calculating PI
      System.out.println( "Please enter a value");
      n = scan.nextInt();
      sum = 0;
      for( int k = 0; k < n; k++)
      {
         lastTerm = ((4.0 / ((2 * k ) + 1 )) * Math.pow( -1 , k ));
         sum = sum + lastTerm;
      }
      System.out.println( sum);
      System.out.println();
      
      //Wanting a value
      m= 0;
      sum = 0;
      accuracy = scan.nextDouble();
      do
      {
         lastTerm = ((4.0 / ((2 * m ) + 1 )) * Math.pow( -1 , m ));
         m++;
         sum = sum + lastTerm;
      } while ( Math.abs(lastTerm) >= accuracy);
      System.out.println( sum );
   }
}