/**
 * Working on Big Numbers
 * @author Murat Furkan U?urlu
 * @version 19/12/2019
 */
public class BigNum
{
   // properties
   public static final int SIZE = 10;
   public static final int BASE = 13;
   int[] arrayOfNumbers;
   int number;
   
   // constructors
   public BigNum()
   {
      arrayOfNumbers = new int[SIZE];
   }
   
   public BigNum( String toInteger)
   {
      arrayOfNumbers = new int[SIZE];   
      
      for (int k = 0; k < toInteger.length(); k++)
      {
         if (Character.isDigit(toInteger.charAt(toInteger.length() - 1 - k)))
            arrayOfNumbers[k] = toInteger.charAt(toInteger.length() - 1 - k) - '0';
         else
            arrayOfNumbers[k] = toInteger.charAt(toInteger.length() - 1 - k) - 'A' + 10;
      }
      for (int i = toInteger.length(); i < SIZE; i++)
      {
         arrayOfNumbers[i] = 0;
      }
   }
    
   public BigNum( BigNum copy)
   {
      arrayOfNumbers = copy.arrayOfNumbers;
   }
   
   // methods
   /*
    * toString method
    * @return showList which represents array elemans
    */ 
   public String toString()
   {
      String show;
      show = "";
      char temp;
      for (int k = SIZE; k > 0; k--)
      {
         if (arrayOfNumbers[k-1] < 10 && arrayOfNumbers[k-1] >= 0)
            show = show + arrayOfNumbers[k-1];
         else
         {
            temp = (char)(arrayOfNumbers[k-1] + 'A' - 10);
            show = show + temp;
         }
      }
      return show;
   }
   
   /*
    * equals method checking they are same or not
    * @return false if there is not any common elemans, otherwise true
    */ 
   public boolean equals(BigNum other)
   {
      for(int k = 0; k < SIZE; k++)
      {
         if(arrayOfNumbers[k] != other.arrayOfNumbers[k])
            return false;
      }
      return true;
   }
   
   /*
    * isZero method checking whether number is zero or not
    * @return false if it is not zero, otherwise true
    */ 
   public boolean isZero()
   {
      for(int k = 0; k < SIZE; k++)
      {
         if(arrayOfNumbers[k] != 0)
            return false;
      }
      return true;
   }
   
   /*
    * shift method shifting array numbers left or right
    */ 
   public void shift( boolean left)
   {
      if ( left)
      { 
         for (int i = SIZE - 1; i > 0; i--)
         {
            arrayOfNumbers[i] = arrayOfNumbers[i - 1];
         }
         arrayOfNumbers[0] = 0;
      }
      else
      {
         for (int k = 0; k < SIZE - 1; k++)
         {
            arrayOfNumbers[k] = arrayOfNumbers[k + 1];
         }
         arrayOfNumbers[SIZE - 1] = 0;
      }
   }
   
   /*
    * add method sums two objects
    * @return sum of the objects
    */ 
   public String add( BigNum other)
   {
      int value;
      int carry;
      String sum;
      carry = 0;
      sum = "";
      for (int a = 0; a < SIZE; a++)
      {
         value = this.arrayOfNumbers[a] + other.arrayOfNumbers[a] + carry;
         carry = value / BASE;
         if ((value % BASE) < 10 && (value % BASE)>=0)
            sum = (value % BASE) + sum;
         else
            sum = (char) ((value % BASE) + 'A' - 10) + sum;
      }
      return sum;
   }
   
   /*
    * isLessThan method
    * @return true if the first one is less than the other
    */
   public boolean isLessThan( BigNum other)
   {
      int checker;
      checker = SIZE - 1;
      
      while (checker >= 0 && other.arrayOfNumbers[checker] == arrayOfNumbers[checker])
      {
         checker--;
      }
      if (checker == -1 || other.arrayOfNumbers[checker] < arrayOfNumbers[checker])
         return false;
      else 
         return true;
   }
}