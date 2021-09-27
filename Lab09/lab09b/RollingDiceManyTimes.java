import java.util.Scanner;
import java.util.ArrayList;

/**
 * Rolling Dice Many Times
 * @author Murat Furkan Uðurlu
 * @version 12/12/2019
 */ 
public class RollingDiceManyTimes
{
   /*
    * Rolling Dice many times
    * @return (ArrayList) frequencies
    */ 
   public static ArrayList<Integer> rolling()
   {
      ArrayList<Integer>frequencies;
      frequencies = new ArrayList<Integer>();
      Dice dice;
      dice = new Dice();
      
      for(int a = 1; a < 12; a++)
      {
         frequencies.add(0); 
      }
      for(int i = 0; i < 1000; i++)
      {
         dice.roll();
         frequencies.set(dice.getDiceTotal() - 2, frequencies.get(dice.getDiceTotal() - 2) + 1);
      }
      return frequencies;
   }
   
   /*
    * drawing histogram using stars
    */ 
   public static void histogram(ArrayList<Integer>frequencies)
   {
      ArrayList<String> lines;
      lines = new ArrayList<String>();
      int maximumFrequency;
      double valueOfStar;
      
      maximumFrequency = 0;
      
      //constracting 10 new lines
      for(int a = 0; a < 10; a++)
      {
         lines.add("");
      }
      
      //Finding maximum frequencies
      for( int i : frequencies )
      {
         maximumFrequency = Math.max( maximumFrequency, i);
      }
      
      //Determining the value of one star
      valueOfStar = Math.round(maximumFrequency / 10.0);
      
      //Printing to display information
      System.out.println(" Frequency Distribution" +
                         "\n  for 1000 Dice rolls" +
                         "\n  ( max freq is " + maximumFrequency + " )");
      
      //Preparing all lines
      for(int i = 2; i <= 12; i++) 
      {
         //finding number of stars getting frequencies and dividing them the value of one star
         int numberOfStars = (int)(frequencies.get(i - 2) / valueOfStar);
         
         //adding spaces in the lines
         for(int k = 0; k < 10 - numberOfStars; k++) 
         {
            lines.set(k, lines.get(k) + "  " );
         }
         //adding stars to the lines
         for(int j = 10 - numberOfStars; j < 10; j++)
         {
            lines.set(j, lines.get(j) + " *" );
         }
      }
      
      //Printing lines to show the histogram
      for(String line : lines)
      {
         System.out.println( line);
      }
   }
   
   //using histogram method rolling method to print histogram
   public static void main( String[] args)
   {
      histogram(rolling());
   }
}