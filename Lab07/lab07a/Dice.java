/**
 * Rolling Dice
 * @author Murat Furkan U�urlu
 * @version 28/11/2019
 */ 
public class Dice {
   
   // properties
   private Die die1;
   private Die die2;
   
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();  
   }
   
   // methods
   /**
    * the sum of numbers
    * @return die1 + die2
    */ 
   public int roll()
   {
      return (die1.roll() + die2.roll());
   }
   
   /**
    * @return die1 face value
    */ 
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   /**
    * @return die2 face value
    */ 
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   /**
    * total dice
    * @return die1 face value + die2 face value
    */ 
   public int getDiceTotal()
   {
      return (die1.getFaceValue() + die2.getFaceValue());
   }
   
   /**
    * toString method
    * @return String toString
    */ 
   public String toString()
   {
      return ("The value of die1 is: " + die1.getFaceValue() + " and the value of die2 is: " + die2.getFaceValue());
   }  
}
