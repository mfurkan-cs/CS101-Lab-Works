/**
 * Having 12 in dice game
 * @author Murat Furkan Uðurlu
 * @version 28/11/2019
 */ 
public class DiceGame {
   
   // properties
   private Dice dice;
   
   // constructors
   public DiceGame()
   {
      dice = new Dice();
   }
   
   // methods
   
   /**
    * counting how many times it rolled
    * @return count
    */ 
   public int play()
   {
      //variables
      int count;
      
      //program code
      count = 1;
      do
      {
         count++;
      } while( dice.roll() != 12 );
      
      return count;
      
   }
   
}
