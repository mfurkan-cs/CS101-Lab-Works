package myWorld;
/**
 * Library Application
 * @author Murat Furkan U?urlu
 * @version 12/12/2019
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
   
   public LibraryBook(LibraryBook book)
   {
      title = book.title;
      author = book.author;
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
         if(!dueDate.equals(""))
         {      
            info = title + " is written by " + author + ". The book is loaned " + timesLoaned + " times." + " Due date for it is " + dueDate;
         }
         else
         {
            info = title + " is written by " + author + ". The book is loaned " + timesLoaned + " times.";
         }
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
    * @return boolean true if there is a due date for book
    */ 
   public boolean onLoan()
   {
      return !dueDate.equals( "");
   }
   
   /*
    * checking if titles and authors same
    * @return boolean true if they are same
    */ 
   public boolean equals(LibraryBook book)
   {
      return (this.title.equals(book.title)) && (this.author.equals(book.author));
   }
   
   /*
    * checking if the titles are same
    * @param book
    * @return title
    */ 
   public boolean hasSameTitle(LibraryBook book)
   {
      return title.equals(book.title);
   }
   
   /*
    * checking the author is same
    * @param book
    * @return author
    */  
   public boolean hasSameAuthor(LibraryBook book)
   {
      return author.equals(book.author);
   }
   
   /*
    * calling title
    * @return title
    */ 
   public String getTitle()
   {
      return title;
   }
   
   /*
    * calling the author
    * @return author
    */ 
   public String getAuthor()
   {
      return author;
   }
   /*
    * calling due date
    * @return due date
    */ 
   public String getDueDate()
   {
      return dueDate;
   }
}
