import myWorld.*;
import java.util.Scanner;

/**
 * Testing Library 
 * @author Murat Furkan U?urlu
 * @version 05/12/2019
 */ 
public class LibraryTest
{
   public static void menu()
   {
      /*
       * printing main menu
       */ 
      System.out.println("  MENU" +  
                         "\n  To find the book please write 'find'" + 
                         "\n  To show the book please write 'show'" + 
                         "\n  To add the book please write 'add'" + 
                         "\n  If you want to exit please write 'exit'");
   }
   
   public static void bookOperations()
   {
      /*
       * printing book options menu
       */ 
      System.out.println("     Please choose what you want..." +
                         "\n" +
                         "\n To loan the book please write 'loan'" +
                         "\n To return the book please write 'return'" +
                         "\n To remove the book please write 'remove'" +
                         "\n To back to menu please write 'back'");
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      Library library;
      LibraryBook book;
      boolean continueToProcess;
      boolean continueAgain;
      String operation;
      String nextOperation;
      
      // program code
      library = new Library();
      continueToProcess = true;
      book = null;
      
      do
      {
         //showing main menu
         menu();
         operation = scan.nextLine();
         
         if(operation.equals("find"))
         {
            //finding book in the library
            System.out.println("Enter the title of book");
            book = library.findByTitle(scan.nextLine());
            
            if(book == null)
            {
               System.out.println("This book is not here!");
            }
            else
            {
               continueAgain = true;
               
               //moving book options
               while(continueAgain)
               {
                  bookOperations();
                  nextOperation = scan.nextLine();
                  
                  //loaning the book
                  if(nextOperation.equals("loan"))
                  {
                     System.out.println("Please enter due date");
                     book.loanBook(scan.nextLine());
                  }
                  //returning the book
                  else if(nextOperation.equals("return"))
                  {
                     System.out.println("The book is successfully returned!");
                     System.out.println();
                     book.returnBook();
                  }
                  //removing the book from library
                  else if(nextOperation.equals("remove"))
                  {
                     System.out.println("The book is successfully removed!");
                     System.out.println();
                     library.remove(book);
                  }
                  //going back to main menu
                  else if(nextOperation.equals("back"))
                  {
                     continueAgain = false;
                  }
               }
            }
         }
         //showing information about the book
         else if(operation.equals("show"))
         {
            System.out.println(library.toString());
         }
         //adding a new book to library
         else if(operation.equals("add"))
         {
            System.out.println("Enter title and author of the book");
            library.add(scan.nextLine(), scan.nextLine());
         }
         //exiting and finishing task
         else if(operation.equals("exit"))
         {
            System.out.println("Good Bye!");
            continueToProcess = false;
         }
         
      } while(continueToProcess == true);  
   }
}