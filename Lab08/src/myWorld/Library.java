package myWorld;
/**
 * Java Library Class.
 * @author Murat Furkan Uðurlu
 * @version 05/12/2019
 */
public class Library {
   
   // properties
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
   
   // constructors
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   /*
    * isEmpty method
    * checking if the library is empty
    * @return book
    */ 
   public boolean isEmpty()
   {
      return (b1 == null) && (b2 == null) && (b3 == null) && (b4 == null);
   }
   
   /*
    * describing books if the library is not empty!
    * @return info which represents information about library books
    */ 
   public String toString()
   {
      String info;
      info = "";
      
      if(b1 != null)
      {
         if(b1.getTimesLoaned() == 0)
         {
            info = info + b1.getTitle() + " is written by " + b1.getAuthor() + "." + "\n";  
         }
         else
         {
            if(b1.getDueDate().equals(""))
            {
               info = info + b1.getTitle() + " is written by " + b1.getAuthor() + ". This book has loaned " + b1.getTimesLoaned() + " times." + "\n";
            }
            else
            {
               info = info + b1.getTitle() + " is written by " + b1.getAuthor() + "." + "Due date for it " + b1.getDueDate() + "\n"; 
            }
         }
      }
      if(b2 != null)
      {
         if(b2.getTimesLoaned() == 0)
         {
            info = info + b2.getTitle() + " is written by " + b2.getAuthor() + "." + "\n";  
         }
         else
         {
            if(b2.getDueDate().equals(""))
            {
               info = info + b2.getTitle() + " is written by " + b2.getAuthor() + ". This book has loaned " + b2.getTimesLoaned() + " times." + "\n";
            }
            else
            {
               info = info + b2.getTitle() + " is written by " + b2.getAuthor() + "." + "Due date for it " + b2.getDueDate() + "\n"; 
            }
         }
      }
      if(b3 != null)
      {
         if(b3.getTimesLoaned() == 0)
         {
            info = info + b3.getTitle() + " is written by " + b3.getAuthor() + "." + "\n";  
         }
         else
         {
            if(b3.getDueDate().equals(""))
            {
               info = info + b3.getTitle() + " is written by " + b3.getAuthor() + ". This book has loaned " + b3.getTimesLoaned() + " times." + "\n";
            }
            else
            {
               info = info + b3.getTitle() + " is written by " + b3.getAuthor() + "." + "Due date for it " + b3.getDueDate() + "\n"; 
            }
         }
      }
      if(b4 != null)
      {
         if(b4.getTimesLoaned() == 0)
         {
            info = info + b4.getTitle() + " is written by " + b4.getAuthor() + "." + "\n";  
         }
         else
         {
            if(b4.getDueDate().equals(""))
            {
               info = info + b4.getTitle() + " is written by " + b4.getAuthor() + ". This book has loaned " + b4.getTimesLoaned() + " times." + "\n";
            }
            else
            {
               info = info + b4.getTitle() + " is written by " + b4.getAuthor() + "." + "Due date for it " + b4.getDueDate() + "\n"; 
            }
         }
      }
      if(info != "")
      {
         return info;
      }
      else
      {
         return "This library is empty!";
      }
   }
   
   /*
    * adding a new book to the library if there is space
    * @param String title is title of the book
    * @param String author is the author of the book
    */ 
   public void add(String title,String author)
   {
      if(b1 != null)
      {
         if(b2 != null)
         {
            if(b3 != null)
            {
               if(b4 != null)
               {
                  System.out.println("The library is not empty!");
               }
               else
               {
                  b4 = new LibraryBook(title, author);
               }
            }
            else
            {
               b3 = new LibraryBook(title, author);
            }
         }
         else
         {
            b2 = new LibraryBook(title, author);
         }
      }
      else
      {
         b1 = new LibraryBook(title, author);
      }
   }
   
   /*
    * removing book from the library
    * @param book is the book in library
    */ 
   public void remove(LibraryBook book)
   {
      if(b1.equals(book))
         b1 = null;
      else if(b2.equals(book))
         b2 = null;
      else if(b3.equals(book))
         b3 = null;
      else if(b4.equals(book))
         b4 = null;
   }
   
   /*
    * finding book using using its title
    * @param title is the title of the book
    * @return book
    */ 
   public LibraryBook findByTitle(String title)
   {
      if(b1 != null && b1.getTitle().equals(title))
         return b1;
      if(b2 != null && b2.getTitle().equals(title))
         return b2;
      if(b3 != null && b3.getTitle().equals(title))
         return b3;
      if(b4 != null && b4.getTitle().equals(title))
         return b4;
      else
         return null;
   }
}


