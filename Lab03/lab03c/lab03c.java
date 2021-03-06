import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * HTML code
 * @author Murat Furkan U?urlu
 * @version 24/10/2019
 */ 
public class lab03c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String DOC = "<!DOCTYPE html>";
      final String HTML = "<html>";
      final String FHTML = "</html>";
      final String HEAD = "<head>";
      final String FHEAD = "</head>";
      final String TITLE = "<title>";
      final String FTITLE = "</title>";
      final String BODY = "<body>";
      final String FBODY = "</body>";
      final String HR = "<hr>";
      final String PHOTO = "<img src=\"einstein.jpg\">";
      final String FHR = "</hr>";
      final String H1 = "<h1>";
      final String FH1 = "</h1>";
      final String P = "<p>";
      final String FP = "</p>";
      final double TAX_RATE = 0.15;
      final double HIGH_TAX_RATE = 0.25;
      final double LOW_TAX_RATE = 0.05;
      
      // variables
      int age;
      String name;
      double netsalary;
      double grosssalary;
      String comments;
      double tax_rate;
      
      // program code
      System.out.println(" Please enter your age, name, salary and comments ");
      age = scan.nextInt();
      name = scan.nextLine();
      name = scan.nextLine();
      grosssalary = scan.nextDouble();
      netsalary = 0;
      tax_rate = 0;
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      if ( grosssalary >= 0 && grosssalary < 1000 ){
         tax_rate = LOW_TAX_RATE; 
         netsalary = ( grosssalary - 100 )* ( 1 - LOW_TAX_RATE );
      }
      else if ( grosssalary >= 1000 && grosssalary < 5000 ){
         tax_rate = TAX_RATE;
         netsalary = ( grosssalary - 100 )* (1 - TAX_RATE );
      }
      else if ( grosssalary >= 5000 && grosssalary <= 10000){
         tax_rate = HIGH_TAX_RATE;
         netsalary = ( grosssalary - 100 )* ( 1 - HIGH_TAX_RATE );
      }
      
      if ( age < 0 ) {
         System.out.println(" age must be greater than 0");}
      else {
         if ( grosssalary > 10000 || grosssalary < 100 )
            System.out.println( " The salary cannot be larger than 10000");
         else
         {
            System.out.println(DOC);
            System.out.println(HTML);
            System.out.println(HEAD);
            System.out.println(TITLE + name + "'s Home Page");
            System.out.println(FTITLE);
            System.out.println(FHEAD);
            System.out.println(BODY);
            System.out.println(HR);
            if (Files.exists( Paths.get( "einstein.jpg" ) ))
               System.out.println( PHOTO);
            System.out.println(H1 + name );
            System.out.println(FH1);
            System.out.println(P + age );
            System.out.println(FP);
            System.out.println(P + " Net salary:" + netsalary + "(" + tax_rate + ")");
            System.out.println(FP);
            System.out.println(P + comments );
            System.out.println(FP);
            System.out.println(HR);
            System.out.println(FBODY);
            System.out.println(FHTML);
            
         }
         
      }
   }
}