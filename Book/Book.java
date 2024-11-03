public class Book {

   private String bookName;
   private int    bookISBN;
   
   public Book() {
      bookName = "";
      bookISBN = 0;      
   } 
   
   public Book(String name, int ISBN) {
      bookName = name;
      bookISBN = ISBN;
   }
   
   public void setBookName(String name) {
      bookName = name;
   }
   
   public void setBookISBN(int ISBN) {
      bookISBN = ISBN;
   }
   
   public String getBookName() {
      return bookName;
   }
   
   public int getBookISBN() {
      return bookISBN;
   }  
   
   public String toString() {
      return bookName + " " + bookISBN ;
   }
}