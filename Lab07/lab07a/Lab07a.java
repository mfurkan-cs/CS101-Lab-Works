/**
 * Using the old way showing dice
 * @author Murat Furkan U?urlu
 * @version 28/11/2009
 */ 
public class Lab07a {
   
   public static void main( String[] args)
   {
      // variables
      int die1;
      int die2;
      int die3;
      int die4;
      int numberOfRoll;

      // program code

      /*
       * having dice showing 6-6
       * @result numberOfRoll 
       */ 
      numberOfRoll = 0;
      do
      {
         die1 = (int)(6 * Math.random() + 1);
         die2 = (int)(6 * Math.random() + 1);   
         numberOfRoll++;
      
      } while( die1 != 6 || die2 != 6);
      
      System.out.println( "The number of roll is: " + numberOfRoll);
      
      //Testing
      numberOfRoll = 0;
      do
      {
         die1 = (int)(6 * Math.random() + 1);
         die2 = (int)(6 * Math.random() + 1);
         die3 = (int)(6 * Math.random() + 1);
         die4 = (int)(6 * Math.random() + 1);
         numberOfRoll++;
         
      } while(die1 != 6 || die2 != 6 || die3 != 6 || die4 != 6);
     
      System.out.println( "The number of roll is: " + numberOfRoll);
   }
}
