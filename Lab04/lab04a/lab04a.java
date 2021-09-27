import java.util.Scanner;

/**
 * While loops Part a
 * @author Murat Furkan Uðurlu
 * @version 31/10/2019
 */ 
public class lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int n;
      int value;
      int k;
      int c;
      double d;
      int temp_n;
      
      
      // Lab04/a/1
      System.out.println(" Please enter a value:");
      value = 1;
      n = scan.nextInt();
      temp_n = n;
      System.out.print("integer values from 0 up to n exclusive ");
      if ( temp_n <= 0 ) 
      {
         System.out.println(" error...");
      }
      else
         while ( value < temp_n )
      { 
         System.out.print( value  + " ");
         value++;
      }
      temp_n = n; 
      
      // Lab04/a/2
      System.out.println();
      value = 1;
      System.out.println("integer values from 0 up to n exclusive and the output should have five values per line, with values separated by a space ");
      if ( temp_n <= 0 )
      {
         System.out.println(" error...");
      }
      else
         while ( value < temp_n )
      { 
         System.out.print( value  + " ");
         
         if ( value % 5 == 0 )
         {
            System.out.println();
         } 
         value++;
      }
      temp_n = n;
      
      // Lab04/a/3
      System.out.println();
      value = 0;
      System.out.print("integer values from n down to 0 inclusive and the output appear on a single line with values separated by a space ");
      if ( temp_n <= 0 ) 
      {
         System.out.println(" error...");
      }
      else
         while ( 0 <= temp_n )
      {
         System.out.print( temp_n + " " );
         temp_n--;
      }
      temp_n = n;
      // Lab04/a/4
      System.out.println();
      System.out.print("the even values from -n up to n inclusive and output appear on a single line with values separated by a space ");
      value = -temp_n;
      if ( n <= 0 )
      {
         System.out.println( "error...");
      }
      while ( value <= temp_n ) 
      {
         if ( value % 2 == 0 ) 
         {
            System.out.print( value + " ");
         }
         value++;
      }
      
      temp_n = n;
      //Lab04/a/5
      System.out.println();
      value = 0;
      System.out.println("outputs (separated by spaces, five numbers per line ) the squares of the even values from 0 up to n inclusive ");
      if ( n <= 0 ) 
      {
         System.out.println(" error...");
      }
      while ( value <= n ) 
      {
         if ( value % 2 == 0 ) 
         {
            System.out.print( value * value + " ");
            if ( value % 10 == 0 )
            {
               System.out.println();
            }
         }
         value++;
      }
      temp_n = n;
      
      //Lab04/a/6
      System.out.println();
      value = 3;
      System.out.print("outputs (separated by spaces, five numbers per line) the values which are divisible by 3 or 4, but not both, from n down to 3 inclusive ");
      c = 0;
      if ( temp_n < 3 ) 
      {
         System.out.println(" error...");
      }
      while ( value <= temp_n )
      {  
         if ( temp_n % 3 == 0 || temp_n % 4 == 0 )
         {
            if (temp_n % 12 != 0 )
            {
               System.out.print( temp_n + " " );
               c++;
               if ( c % 5 == 0 )
               {
                  System.out.println();
               }
            }
         }
         temp_n--;
      }
      temp_n = n;
      
      //Lab04/a/7
      System.out.println();
      value = 2;
      System.out.print("outputs all of the divisors of n ");
      if ( temp_n <= 0 )
      {
         System.out.println(" error...");
      }
      while ( value <= temp_n ) 
      { 
         if ( n % value == 0 )
         {
            System.out.print( value + " " );
         }
         value++;
      }
      temp_n = n;
      
      //Lab04/a/8
      System.out.println();
      System.out.print("for every integer k from n down to 1, outputs the values of 1 / k  that are greater than 0.01 ");
      k = 1;
      if ( temp_n <= 0 )
      {
         System.out.println(" error...");
      }
      while ( k <= temp_n )
      {
         d = Math.round((1 / (double)k)*100)/100.0;
         System.out.println( d );
         k++;
      }   
   }
}



