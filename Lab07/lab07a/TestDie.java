import java.util.Scanner;
/**
 * Testing Die
 * @author Murat Furkan U?urlu
 * @version 28/11/2019
 */ 
public class TestDie {
  
public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      Die die1;
      Die die2;

      // program code
      die1 = new Die();
      die2 = new Die();
      
      System.out.println( die1);
      System.out.println( die2);
      System.out.println();
      
      //testing roll
      System.out.println( die1.roll());
      System.out.println( die2.roll());
      System.out.println();

      //testing toString
      System.out.println( die1.toString());
      System.out.println( die2.toString());
      System.out.println();

      System.out.println( "testing getFaceValue method");
      System.out.println( die1.getFaceValue());
      System.out.println( die2.getFaceValue());
      
   }

   
}
