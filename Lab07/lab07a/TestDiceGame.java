/**
 * Testing Dice Game
 * @author Murat Furkan Uðurlu
 * @version 28/11/2019
 */ 
public class TestDiceGame {
   
  public static void main( String[] args)
   {
      // variables
     DiceGame diceGame;

      // program code
     diceGame = new DiceGame();
     
     System.out.println( "The dies turned " + diceGame.play() + " times.");
     
   }
   
}
