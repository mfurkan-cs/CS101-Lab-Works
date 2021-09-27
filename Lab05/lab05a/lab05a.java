import java.util.Scanner;

/**
 * Designing Rectangle
 * @author Murat Furkan Uðurlu
 * @version 07/11/2019
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String YES = "y";
      final String YES2 = "Y";
      
      // variables
      int width;
      int height;
      int thickness;
      int line;
      int stars;
      int space;
      String answer;
      
      // program code
      do
      {
         System.out.println( "Please enter 3 positive values for width, height and thickness");
         System.out.print( "Width");
         width = scan.nextInt();
         System.out.print( "Height");
         height = scan.nextInt();
         System.out.print( "Thickness");
         thickness = scan.nextInt();
         
         // Error part
         if (width <= 0 || height <= 0 || thickness <= 0)
         {
            System.out.println(" error... Please enter positive values!");
         }
         
         // Rectangle without a hole
         else if ( 2 * thickness >= height || 2 * thickness >= width)
         {
            for ( line = 0; line < height; line++)
            {
               if( line != 0)
               {
                  System.out.println();
               }
               for( stars = 0; stars < width; stars++)
               {
                  System.out.print( "*");
               }
            }
            System.out.println();
            System.out.println( "Oops! No hole...");
         }
         
         // Top part of the rectangle
         else
         {
            for ( line = 0; line < thickness; line++)
            {
               if( line != 0)
               {
                  System.out.println();
               }
               for ( stars =0; stars < width; stars++)
               {
                  System.out.print( "*");
               }
            }
            System.out.println();
            
            // Middle part of the rectangle( with hole)
            for( line = thickness; line < height-thickness; line++)
            {
               if( line != thickness)
               {
                  System.out.println();
               }
               for( stars = 0; stars < thickness; stars++)
               {
                  System.out.print( "*");
               }
               for( space = 0; space < width - 2 * thickness; space++)
               {
                  System.out.print( " ");
               }
               for( stars = 0; stars < thickness; stars++)
               {
                  System.out.print( "*");     
               }
            }
            System.out.println();
            
            // Bottom part of the rectangle
            for( line = height - thickness; line < height; line++)
            {
               if( line != height - thickness)
               {
                  System.out.println();
               }
               for( stars = 0; stars < width; stars++)
               {
                  System.out.print( "*");
               }
            }
         } 
         
         System.out.println();
         System.out.println( "If you want to calculate again, please type y or Y; otherwise, the program will be closed");
         answer = scan.next();
         
      } while ( answer.equals(YES) || answer.equals(YES2) );
      
      System.out.println( "Good Bye :)");
   }
}
