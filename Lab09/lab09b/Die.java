/**
 * representing face value
 * @author Murat Furkan Uðurlu
 * @version 28/11/2019
 */
public class Die {
   
   // properties
   private int faceValue;
   
   // constructors
   public Die()
   {
      faceValue = (int)(6 * Math.random() + 1);
   }
   
   // methods
   /**
    * roll method
    * @return integer faceValue
    */ 
   public int roll()
   {
      faceValue = (int) (6 * Math.random() + 1);
      return faceValue;
   }
   
   /**
    * showing face value
    * @return integer faceValue
    */ 
   public int getFaceValue()
   {
      return faceValue;
   }
   
   /**
    * toString method
    * @return String toString
    */ 
   public String toString()
   {
      return "The face value is: " + faceValue;
   }
}
