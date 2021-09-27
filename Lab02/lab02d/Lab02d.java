import java.util.Scanner;
/**
 * Heron Formula 
 * @author Murat Furkan Uðurlu
 * @version 17/10/2019
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      // variables
      double a;
      double b;
      double c;
      double s;
      double area;
      int maxnumberofflowers;
      // program code
      // To find value "s", firstly sum all lengths of triangle and divide by 2
     
      System.out.println( " Please enter the lengths of triangle ");
      
      a = scan.nextDouble();
      b = scan.nextDouble();
      c = scan.nextDouble();
      
      s = ( (a + b + c)  / 2 ) ;
      System.out.print(" The s is " );
      System.out.println( s );
      
      //To compute the area of triangle use this 
      area = Math.sqrt( s * ( s - a ) * ( s - b ) * ( s - c ) );
      System.out.print(" The area ");
      System.out.println( area);
      maxnumberofflowers = (int) (area * 17 );
      System.out.print(" The maximum number of flowers ");
      System.out.print( maxnumberofflowers);

   }

}