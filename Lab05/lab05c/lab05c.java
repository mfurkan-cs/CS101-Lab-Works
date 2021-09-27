import java.util.Scanner;

/**
 * Calculator 
 * @author Murat Furkan Uðurlu
 * @version 07/11/2019
 */ 
public class lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String ADDITION = "+";
      final String SUBTRACTION = "-";
      final String MULTIPLICATION = "*";
      final String DIVISION = "/";
      final String CLEAR = "clear"; 
      final String CLEAR2 = "Clear";
      final String CLEAR3 = "c";
      final String CLEAR4 = "C";
      final String QUIT = "Quit";
      final String QUIT2 = "Q";
      final String QUIT3 = "quit";
      final String QUIT4 = "q";
      
      // variables
      double x;
      double result;
      String operation;
      
      // program code
      result = 0;
      
      do
      {
         System.out.println(" Welcome to SimpleCalculator...");
         System.out.println(" Please type operator and a number; if you want to clear/Clear/c/C, write clear or quit, write Quit");
         operation = scan.next();
         
         //Addition
         if( operation.equals(ADDITION))
         {
            x = scan.nextDouble();
            result = result + x;
            System.out.println( result);
         }
         
         //Subtraction
         else if ( operation.equals(SUBTRACTION))
         {
            x = scan.nextDouble();
            result = result - x;
            System.out.println( result);
         }
         
         //Multiplication
         else if ( operation.equals(MULTIPLICATION))
         {
            x = scan.nextDouble();
            result = result * x;
            System.out.println( result);
         }
         
         //Division
         else if ( operation.equals(DIVISION))
         {
            x = scan.nextDouble();
            if ( x == 0)
            {
               System.out.println(" error...");
            }
            else
            {
               result = result / x;
               System.out.println( result);
            }
         }
         
         // Clear option
         else if (operation.equals(CLEAR) || operation.equals(CLEAR2) || operation.equals(CLEAR3) || operation.equals(CLEAR4))
         {
            result = 0;
            System.out.println( result);
         }
         
      } while( !operation.equals(QUIT) && !operation.equals(QUIT2) && !operation.equals(QUIT3) && !operation.equals(QUIT4));
      System.out.println( " Good Bye:)");
      
      
   }
}