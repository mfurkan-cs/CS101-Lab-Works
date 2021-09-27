import java.util.Scanner;

/**
 * _Methods
 * @author Murat Furkan Uðurlu
 * @version 14/11/2019
 */ 
public class Lab06
{
   /**
    *Calculating x^y
    * @param x is a double value
    * @param y is a positive integer
    * @return double value
    */
   public static double power( double x, int y)
   {
      //variables
      double result;
      
      //program code
      result = 1;
      for( int i = 0; i < y; i++)
      {
         result = result * x;
      }
      return result;
   }

   /**
    * Calculating n!
    * @param n is a positive integer
    * @return positive integer
    */
   public static long factorial(int n)
   {
      //variables
      long result;
      
      //program code
      if ( n <= 0)
      {
         System.out.println( "please enter a positive value!");
      }
      
      result = 1;
      for( int i = 0; i < n; i++)
      {
         result = result * (i+1);
      }
      return result;
   }
   
   /**
    * reversing sentence
    * @param parameter is a string
    * @return string
    */ 
   public static String reverseName( String parameter)
   {
      //variables
      String reverseName;
      
      //program code
      reverseName = "";
      for (int counter = parameter.length(); counter >= 1; counter--)
      {
         reverseName = reverseName + parameter.charAt( counter - 1);
      }
      return reverseName;
   }
   
   
   /**
    * Calculating base2 to base10
    * @param decimal is decimal code
    * @param base2 is binary code
    * @return decimal
    */ 
   public static int toDecimal(String base2)
   {
      //variables
      int number;
      int power;
      int digit;
      int decimal;
      
      //program code
      number = Integer.valueOf(base2);
      power = 1;
      decimal = 0;
      
      for( int index = base2.length() - 1; index >= 0; index--)
      {
         digit = number % 10;
         number = number / 10;
         decimal = decimal + (digit * power); 
         power = power * 2; 
      }
      System.out.print( "Decimal format is: ");
      System.out.println( decimal);
      return decimal;
   }

   /**
    * Calculating base10 to base2
    * @param binary is binary code
    * @param decimal is a decimal code
    * @return binary
    */ 
   public static String toBinary( int decimal)
   {
      //variables
      String binary;
      
      //program code
      binary = "";
      while( decimal > 0)
      {
         binary = (decimal % 2) + binary;
         decimal = decimal / 2;
      }
      return binary;
   }
   
   /**
    * Calculating sin(angle)
    * @param angle is int
    * @return double sin(angle)
    */ 
   public static double sin( double angle, int n)
   {
      //variables
      double previous;
      double sum;
      double angleRadian;
      
      //program code
      //angleRadian = Math.toRadians(angle);
      previous = angle;
      sum = angle;
      for( int h = 1; h < n; h++)
      {
         previous *= (-1 * angle * angle)/(2 * h * (2 * h + 1));
         sum = sum + previous;
      }
      return sum;
   }
   
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      double sum_of_sinx;
      double term;
      double angleRadian;
      double angle;
      String binary1;
      String binary2;
      String word2;
      String word;
      int length;
      int decimal1;
      int decimal2;
      int sum;
      
      // program code
      
      //Task 1
      System.out.println( "print a table with columns n, n-squared, n-cubed & n to the power 4");
      System.out.println( "    n    n^2     n^3     n^4");
      for( double counter = -1; counter <= 10; counter++)
      {
         //for (-1)^n
         if ( counter == 0)
            length = 3;
         else if( counter < 0)
            length = (int) Math.log10(-counter) + 4;
         else
            length = (int) Math.log10(counter) + 3;
         
         for ( int counterOfSpace = 0; counterOfSpace + length != 6; counterOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print(counter);
         
         //for n^2
         if( counter == 0)
            length = 3;
         else
            length = (int) Math.log10(power(counter,2)) + 3;
         for ( int counterOfSpace = 0; counterOfSpace + length != 6; counterOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print(power(counter,2));
         
         //for x^(2n+1)
         if (counter == 0)
            length = 3;
         else if (counter < 0)
            length = (int) Math.log10(power(counter, 3)) + 4;
         else
            length = (int) Math.log10(power(counter, 3)) + 3;
         
         for ( int counterOfSpace = 0; counterOfSpace + length != 8; counterOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print(power(counter,3));
         
         //for (2n+1)!
         if(counter == 0)
            length = 3;
         else
            length = (int) Math.log10(power(counter,4)) + 3;
         for( int countOfSpace = 0; countOfSpace + length != 8; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print(power(counter,4));
         
         System.out.println();
      }
      
      //Task 2
      System.out.println( "print a table of n and n-factorial, for values of n from 1 to 15");
      System.out.println();
      System.out.println( "n     n-factorial");
      for( int i = 1; i <= 9; i++)
      {
         System.out.println( i + "     " + factorial(i));
      }
      for( int i = 10; i <= 15; i++)
      {
         System.out.println( i + "    " + factorial(i));
      }
      System.out.println();
      
      //Task 3
      System.out.println( "(read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form)");
      System.out.println();
      System.out.print( "Please enter a value for the first binary: ");
      binary1 = scan.nextLine();
      System.out.print( "Please enter a value for the second binary");
      binary2 = scan.nextLine();
      
      decimal1 = toDecimal(binary1);
      decimal2 = toDecimal(binary2);
      System.out.println( "The sum of two binaries is: " + toBinary(decimal1 + decimal2));
      System.out.println();
      
      //Task 4
      System.out.println();
      System.out.println();
      System.out.println( "Reversing words");
      System.out.println();
      System.out.println("Please enter a word or sentence");
      word = scan.nextLine() + " ";
      word2 = "";
      for ( int counter = 0; counter < word.length(); counter++ )
      {
         if ( word.charAt(counter) != ' ' )
         {
            word2 = word2 + word.charAt(counter);
         }
         else
         {
            System.out.print( reverseName(word2) + " " );
            word2 = "";
         }
      }
      
      //Task 5
      System.out.println();
      System.out.println();
      System.out.println( "Please enter a value for degree");
      angle = scan.nextDouble();
      sum_of_sinx = 0;
      
      for( int k = 0; k <= 10; k++)
      {
         term = power(-1,k) * power(angle,2 * k + 1) / factorial(2 * k + 1);
         System.out.println( "n= " + k + "      ,(-1)^n= " + power(-1,k) + "      ,x^(2n+1)= " + power(angle,2 * k + 1) +"      ,(2n+1)!= " + factorial(2 * k + 1) + "     ,term = " + term + "       ,sinx: " + sin(angle,k));
         sum_of_sinx = sum_of_sinx + term;
      }
      System.out.println( "The sum of sin(x): " + sum_of_sinx);
      
      
      //Task 6
      System.out.println();
      System.out.println( "Comparing approximate and real value of sinx");
      System.out.println( "approximate sinx = " + sin(angle,10));
      System.out.println( "real sinx = " + Math.sin(angle));                   
      
   }
   
}