import java.util.Scanner;

/**
 * Working on lots of big number
 * @author Murat Furkan Uðurlu
 * @version 19/12/2019
 */ 
public class Lab10b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      BigNum[] numbers;
      String number;
      int randomNumber;
      int input;
      BigNum max;
      BigNum[] temp;
      int maxIndex;
      
      // program code
      //creating a BigNum array
      numbers = new BigNum[10];
      
      //creating random numbers
      for (int k = 0; k < numbers.length; k++)
      {
         number = "";
         for (int i = 0; i < BigNum.SIZE; i++)
         {
            randomNumber = ( int)( Math.random() * BigNum.BASE);
            if (randomNumber < 10 && randomNumber >= 0)
               number = number + randomNumber;
            else
               number = number + (char)(randomNumber + 'A' - 10);
         }
         numbers[k] = new BigNum(number);
      }
      
      //creating a new array temp and setting index of maximum value to zero
      temp = new BigNum[10];
      maxIndex = 0;
      
      do
      { 
         max = numbers[0];
         input = scan.nextInt();
         
         //if input smaller than zero exit from the loop
         if(input >= 0)
         {
            for (int i = 1; i < input; i++)
            {
               if (max.isLessThan(numbers[i]))
               {
                  max = numbers[i];
               }   
            }     
            
            maxIndex = 0;
            
            //finding the index of maximum value
            for (int a = 0; a < input; a++ )
            {
               if (numbers[a].equals(max))
               {
                  maxIndex = a;
               }
            }
            
            //using a clone array temp to access the index when we change sequence
            temp = numbers.clone();
            temp[input - 1] = max;
            temp[maxIndex] = numbers[input - 1];
            
            //making numbers array and temp(clone) array same
            numbers = temp;
            
            //printing the maximum value
            System.out.println( "max is: " + max);
         }
         
         // printing the numbers array
         for (BigNum k : numbers)
         {
            System.out.println(k);
         }
      } while (input > 0);
      
      System.out.println("GoodBye!!!");  
   }  
}