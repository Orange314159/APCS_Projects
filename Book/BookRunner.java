public class BookRunner
{
	public static void main(String args[])
	{
		Book textBook = new Book();
		System.out.println(textBook);  // prints out toString
      
      Book book2 = new Book("Hitchhikers Guide to the Galaxy", 345391802);
      System.out.println(book2);  // prints out toString
      
      textBook.setBookName("Learn JAVA now!!!");
      textBook.setBookISBN(12345678);
      
      System.out.println(textBook.getBookName());
      
      System.out.println("Book 0 name: "+ textBook.getBookName() + " ISBN(" + textBook.getBookISBN() + ")");
      System.out.println("Book 1 name: "+ book2.getBookName()    + " ISBN(" + book2.getBookISBN()    + ")");
      
      System.out.println(textBook); // we could call toString but by printing it it automatically calls toString
      System.out.println(book2); 
	} 
} 