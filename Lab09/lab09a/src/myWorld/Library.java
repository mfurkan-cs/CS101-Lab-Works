package myWorld;
import java.util.ArrayList;
/**
 * Java Library Class.
 * @author Murat Furkan Uðurlu
 * @version 12/12/2019
 */
public class Library {
   
   // properties
   private ArrayList<LibraryBook> myBooks;
   
   
   // constructors
   public Library()
   {
      myBooks = new ArrayList<LibraryBook>();
   }
   
   // methods
   /*
    * isEmpty method
    * checking if the library is empty
    * @return boolean true if the size of (ArrayList)myBooks is zero
    */ 
   public boolean isEmpty()
   {
      return myBooks.size() == 0;
   }
   
   /*
    * describing books if the library is not empty!
    * @return info which represents information about library books
    */ 
   public String toString()
   {
      if(isEmpty())
      {
         return "This library is empty!";
      }
      
      String info;
      info = "";
      
      for (int i = 0; i < myBooks.size(); i++)
//      for(LibraryBook b : myBooks)
      {
         if (myBooks.get(i).getTimesLoaned() == 0)
         {
            info = info + myBooks.get(i).getTitle() + " is written by " + myBooks.get(i).getAuthor() + "." + "\n";  
         }
         else
         {
            if (myBooks.get(i).getDueDate().equals(""))
            {
               info = info + myBooks.get(i).getTitle() + " is written by " + myBooks.get(i).getAuthor() + ". This book has loaned " + myBooks.get(i).getTimesLoaned() + " times." + "\n";
            }
            else
            {
               info = info + myBooks.get(i).getTitle() + " is written by " + myBooks.get(i).getAuthor() + "." + "Due date for it " + myBooks.get(i).getDueDate() + "\n"; 
            }
         }
      }
      if(info != "")
      {
         return info;
      }
      return info;
   }
   
   /*
    * adding a new book to the library if there is space
    * @param String title is title of the book
    * @param String author is the author of the book
    */ 
   public void add(String title,String author)
   {
      myBooks.add(new LibraryBook(title, author));
   }
   
   /*
    * removing book from the library
    * @param book is the book in library
    */ 
   public void remove(LibraryBook book)
   {
      int theIndexOfBook = myBooks.indexOf(book);
      if(theIndexOfBook == -1)
      {
         System.out.println("There is no book to be removed!");
         System.out.println();
      }
      else
      {
         myBooks.remove(theIndexOfBook);
      }
   }
   
   /*
    * finding book using using its title
    * @param String title is the title of the book
    * @return book in the (ArrayList) myBooks
    */ 
   public LibraryBook findByTitle(String title)
   {
      for(int j = 0; j < myBooks.size(); j++)
      {
         if(myBooks.get(j).getTitle().equals(title))
         {
            return myBooks.get(j);
         }
      } 
      return null;
   }
}