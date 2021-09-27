import java.util.Scanner;

/**
 * the program calculating numbers
 * @author Murat Furkan Uðurlu
 * @version 17/10/2019
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      
      double number1;
      
      double number2;
      double max;
      double min;

      // program code
      System.out.println( "Welcome to the calculator" );
      
      System.out.println( "Please enter the numbers" );
      
      number1 = scan.nextDouble();
      number2 = scan.nextDouble();
      
      System.out.print("The sum ");
      System.out.println( number1 + number2 );
      
      max = Math.max(number1, number2);
      min = Math.min(number1, number2);
     
      System.out.print("The difference ");
      System.out.println( (max-min) );
      
      System.out.print("The product ");
      System.out.println( number1 * number2 );
      
      System.out.print("The divide ");
      System.out.println( number1 / number2);
      System.out.print("The remainder ");
      System.out.println( number1 % number2 );


      System.out.println( "End.");
   }

}