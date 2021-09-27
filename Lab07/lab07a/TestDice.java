import java.util.Scanner;

/**
 * Testing Dice 
 * @author Murat Furkan Uðurlu
 * @version 28/11/2019
 */ 
public class TestDice
{
   public static void main( String[] args)
   {

      // variables
      Dice testData1;

      // program code
      testData1 = new Dice();
      
      //testing roll method
      System.out.println( testData1.roll());
      System.out.println();
      
      //testing face value
      System.out.println( testData1.getDie1FaceValue());
      System.out.println( testData1.getDie2FaceValue());
      System.out.println();
      
      //testing total dice
      System.out.println( testData1.getDiceTotal());
   
      System.out.println( "End.");
   }

}