import myWorld;
/**
 * @description Library Program
 * @author Murat Furkan U?urlu
 * @date 05/12/2019
 */
public class TestLibraryBook {
   
   public static void main( String[] args)
   {
      /**
       * testing library program
       * @show book name and author
       */
      
      //variables
      LibraryBook book1;
      LibraryBook book2;
      LibraryBook book3;
      LibraryBook book4;
      LibraryBook book5;
      LibraryBook book6;
      
      //program code
      book1 = new LibraryBook( "Hayatta Kalma Rehberi", "Zehra ?elenk");
      book2 = new LibraryBook( "Sonras? Kal?r", "Edip Cansever");
      book3 = new LibraryBook( "Ondanc?", "M. Sad?k Aslankara");
      book4 = book2;
      book5 = new LibraryBook( "Sonras? Kal?r", "Edip Cansever");
      book6 = new LibraryBook( book2);

      System.out.println( book1);
      System.out.println( book2);
      System.out.println( book3);
      System.out.println( book4);
      System.out.println( book6);
      System.out.println();
      
      System.out.println( book2 == book4);  //two references to a single object
      System.out.println( book1 == book2);  //two references to two individual objects with different properties
      System.out.println( book2 == book5);  //two references to two individual objects with identical relevant properties
      System.out.println();
      
      System.out.println( book4.equals(book2)); //two references to a single object
      System.out.println( book1.equals(book2)); //two references to two individual objects with different properties
      System.out.println( book2.equals(book5)); //two references to two individual objects with identical relevant properties
      System.out.println();
      
      //checking hasSameTitle method
      System.out.println("Titles are same: " + book2.hasSameTitle(book4));
      System.out.println("Titles are same: " + book2.hasSameTitle(book1));
      System.out.println("Titles are same: " + book2.hasSameTitle(book5));
      System.out.println();
      
      //checking hasSameAuthor method
      System.out.println("Authors are same: " + book2.hasSameAuthor(book4));
      System.out.println("Authors are same: " + book2.hasSameAuthor(book1));
      System.out.println("Authors are same: " + book2.hasSameAuthor(book5));
      
      
      
      

   }
   
}
