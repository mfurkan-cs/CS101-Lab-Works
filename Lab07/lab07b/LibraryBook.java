/**
 * Library Application
 */
public class LibraryBook {
   
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   
   // constructors
   /**
    * @param title is title of the book
    * @param author is the author of the book
    * @param dueDate is the due date for the book
    * @param timesLoaned is the how many times the book is loaned
    * @return info
    */ 
   public LibraryBook(String title, String author)
   {
      this.title = title;
      this.author = author;
      this.dueDate = "";
      this.timesLoaned = 0;  
   }
   
   // methods
   /**
    * describing due date, loan times and if it is loaned
    * @return info
    */ 
   public String toString()
   {
      String info;
      
      info = title + " is written by " + author + ".";
      
      if( timesLoaned == 0)
      {
         info = title + " is written by " + author + ". This book is never loaned.";
      }
      else
      {
         info = title + " is written by " + author + ". The book is loaned " + timesLoaned + " times." + " Due date for it is " + dueDate;
      }
      return info;
   }
   /**
    * detecting dueDate and times loaned
    */ 
   public void loanBook( String dueDate)
   {
      if( onLoan())
      {
         System.out.println( "The book " + title + " has been loaned by someone else!");
      }
      else
      {
         this.dueDate = dueDate;
         timesLoaned++;
      }
   }
   
   /**
    * returnBook method
    * resetting dueDate
    */ 
   public void returnBook()
   {
      dueDate = "";
   }
   
   /**
    * showing how many times it loaned
    * @return timesLoaned
    */ 
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   /**
    * @return boolean false or true according to the due date of book
    */ 
   public boolean onLoan()
   {
      return !dueDate.equals( "");
   }
}
