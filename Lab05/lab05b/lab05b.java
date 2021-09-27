import java.util.Scanner;

/**
 * Row, Col Work
 * @author Murat Furkan Uðurlu
 * @version 07/11/2019
 */ 
public class lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      final int CELLLENGTH =6;

      // variables
      int line;
      int column;
      String x;
      int product;
      int space;
      
      // program code
      System.out.println( "Please enter values for the number of row and col");
      System.out.print( " row: ");
      line = scan.nextInt();
      System.out.print( " col: ");
      column = scan.nextInt();
      
      //lab05b/1
      System.out.println( "the row & column numbers as shown in the example");
      for( int a = 1; a <= line; a++)
      {
         for( int b = 1; b <= column; b++)
         {
            x = a + "," + b;
            for( int s = 1; s + x.length() <= CELLLENGTH; s++)
            {
               System.out.print( " ");
            }
            System.out.print( x);
         }
         System.out.println();
      }           
      System.out.println();
      
      //lab05b/2
      System.out.println( "the product of the row & column number a multiplication table!");
      for ( int a = 1; a <= line; a++)
      {
         for( int b = 1; b <= column; b++)
         {
            product = a * b;
            space = (int)Math.log10(product);
            for( int s = 1; s + space < CELLLENGTH; s++)
            {
               System.out.print( " ");
            }
            System.out.print( product);
         }
         System.out.println();
      }
      
      //lab05b/3
      System.out.println( "the cell number beginning from 0 and increasing left to right, top to bottom");
      for ( int a = 0; a < line; a++)
      {
         for( int b = 0; b < column; b++)
         {
            if( a + b == 0) space = 5;
            
            else
            {
               space = 5 - (int)Math.log10(a * column + b);
            }
            for(int k = 0; k < space; k++)
            {
               System.out.print( " ");
            }
            System.out.print( a * column + b);
         }
         System.out.println();
      }
      
      //lab05b/4
      System.out.println( "the row number in the first column only, putting the String '-' into the other cells.");
      for ( int a = 1; a <= line ;a++)
      {
         space = 5 - (int)Math.log10( a);
         for( int k = 0; k < space; k++)
         {
            System.out.print( " ");
         }
         System.out.print( a);
         for( int b = 1; b < column; b++)
         {
            System.out.print( "     -");
         }
         System.out.println();
      }
   }
}


