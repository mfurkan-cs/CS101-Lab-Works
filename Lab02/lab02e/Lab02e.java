import java.util.Scanner;

/**
 * HTML code
 * @author Murat Furkan Uðurlu
 * @version 17/10/2019
 */ 
public class Lab02e
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
      final String FHR = "</hr>";
      final String H1 = "<h1>";
      final String FH1 = "</h1>";
      final String P = "<p>";
      final String FP = "</p>";

      // variables
      int age;
      String name;
      double salary;
      String comments;

      // program code
      System.out.println(" Please enter your age, name, salary and comments ");
      age = scan.nextInt();
      name = scan.nextLine();
      name = scan.nextLine();
      salary = scan.nextDouble();
      comments = scan.nextLine();
      comments = scan.nextLine();
      System.out.println(DOC);
      System.out.println(HTML);
      System.out.println(HEAD);
      System.out.println(TITLE + name + "'s Home Page");
      System.out.println(FTITLE);
      System.out.println(FHEAD);
      System.out.println(BODY);
      System.out.println(HR);
      System.out.println(H1 + name );
      System.out.println(FH1);
      System.out.println(P + age );
      System.out.println(FP);
      System.out.println(P + salary);
      System.out.println(FP);
      System.out.println(P + comments );
      System.out.println(FP);
      System.out.println(HR);
      System.out.println(FBODY);
      System.out.println(FHTML);
      
   }

}