import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LibraryRunner
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Book book1 = new Book("The Hitchhiker's Guide to the Galaxy","Douglas Adams",10);
    Book book2 = new Book("Fluke","Christopher Moore",9);
    System.out.println("  book2 => " + book2);
    System.out.println("  book1.equals(book2) => " + book1.equals(book2));
    System.out.println("  book2.titleContains(\"Nuke\") => " + book2.titleContains("Nuke"));
    System.out.println("  book2.titleContains(\"Fluke\") => " + book2.titleContains("Fluke"));
    System.out.println("  book2.titleContains(\"Fluk\") => " + book2.titleContains("Fluk"));
    System.out.println("  book2.titleContains(\"luke\") => " + book2.titleContains("luke"));
    System.out.println("  book2.authorContains(\"Christy\") => " + book2.authorContains("Christy"));
    System.out.println("  book2.authorContains(\"Christopher\") => " + book2.authorContains("Christopher"));
   
    Book book3 = new Book("Fluke","Christopher Moore",9);
    System.out.println("  book3 => " + book3);
    System.out.println("  book2.equals(book3) => " + book2.equals(book3));
   
    Book book4 = new Book(new String("Fluke"),"Christopher Moore",9);
    System.out.println("  book4 => " + book4 + " (new String for title)");
    System.out.println("  book3.equals(book4) => " + book3.equals(book4)); 
 
    Book book5 = null;
    System.out.println("  book5 => " + book5);
    System.out.println("  book3.equals(book5) => " + book3.equals(book5));}
 
 
}