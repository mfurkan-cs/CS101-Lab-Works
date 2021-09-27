import java.util.Scanner;
/**
 * Heron Formula 
 * @author Murat Furkan Uðurlu
 * @version 24/10/2019
 */ 
public class lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      //constants
      final double CONSTANT = 17;

      // variables
      double a;
      double b;
      double c;
      double s;
      double area;
      int maxNumberOfFlowers;
      
      // program code
      // To find value "s", firstly sum all lengths of triangle and divide by 2
      
      System.out.println( " Please enter the lengths of triangle ");
      
      a = scan.nextDouble();
      b = scan.nextDouble();
      c = scan.nextDouble();
      
      if ( a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b ) {
         
         s = ( (a + b + c)  / 2 ) ;
         System.out.print(" The s is " );
         System.out.println( s );
         
         //To compute the area of triangle use this 
         area = Math.sqrt( s * ( s - a ) * ( s - b ) * ( s - c ) );
         
         System.out.print(" The area ");
         System.out.println( area);
         
         maxNumberOfFlowers = (int) (area * CONSTANT );
         System.out.print(" The maximum number of flowers ");
         System.out.print( maxNumberOfFlowers);
      }
      else {
         System.out.println(" Please enter appropriate lengths to provide triangle cautions");
      }
   }
   
}