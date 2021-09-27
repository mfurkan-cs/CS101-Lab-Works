/**
 * @description Library Program
 * @author Murat Furkan U�urlu
 * @date 28/11/2019
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
      
      //program code
      book1 = new LibraryBook( "Hayatta Kalma Rehberi", "Zehra �elenk");
      book2 = new LibraryBook( "Sonras� Kal�r", "Edip Cansever");
      
      book1.loanBook("10.10.2019");
      book1.loanBook("05.05.2005");
      book1.returnBook();
      book1.loanBook("12.12.2019");
      book2.loanBook("12.10.2018");
      book2.loanBook("07.11.2019");
      book2.returnBook();
      book2.loanBook("08.11.2019");
      book2.returnBook();
      book2.loanBook("08.12.2019");
      
      System.out.println( book1);
      System.out.println( book1.getTimesLoaned());
      System.out.println( book2);
      System.out.println( book2.getTimesLoaned());
   }
   
}
