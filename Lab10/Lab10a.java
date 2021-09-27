import java.util.Scanner;

/**
 * Testing BigNum
 * @author Murat Furkan Uðurlu
 * @version 19/12/2019
 */ 
public class Lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;

      // program code      
      b1 = new BigNum("1");
      b2 = new BigNum("B");
      b3 = new BigNum( b2);
      b4 = new BigNum("0");
      b5 = new BigNum();
        
      System.out.println("b1: " + b1);
      System.out.println("b2: " + b2);
      System.out.println("b3: " + b3);
      System.out.println("b5: " + b5);
      
      //add method
      System.out.println(b1.add(b2));
      
      //isLessThan method
      System.out.println("b1 is less than b2: " + b1.isLessThan(b2));
      
      //equals method
      System.out.println("b2 equals to b1: " + b2.equals(b1));
      
      //isZero method
      System.out.println("b2 is zero: " + b2.isZero());
      System.out.println("b4 is zero: " + b4.isZero());
      
      //shift method
      b1.shift(true);
      System.out.println(b1);
      b2.shift(false);
      System.out.println(b2);
   }
}