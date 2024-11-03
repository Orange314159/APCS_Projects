public class Book {

   private String title;
   private String author;
   private int rating;
   
   public Book(String t, String a, int r)
   {
      title = t;
      author = a;
      setRating(r);
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String t)
   {
      title = t;
   }
   
   public String getAuthor()
   {
      return author;
   }
   
   public void setAuthor(String a)
   {
      author = a;
   }
   
   public int getRating()
   {
      return rating;
   }
   
   /**
    * Set a book's rating. We only accept rating values between 0 and 10.
    * @param newRating is the new rating value
    * if the newRating is larger than 10, set the rating to 10.
    * if the newRating is less than 0, set the rating to 0.
    */
   public void setRating(int newRating)
   {
      if(newRating <= 10 && newRating >= 0){
         rating = newRating;
      }
      else if (newRating >10){
         rating = 10;
      }
      else{
         rating = 0;
      }
   }

   // Two books are equal if they have the same title and the same author
   // If the book being compared to this book has a null reference return false
   public boolean equals(Object obj)
   {
      if(obj == null){
         return false;
      }
      Book b = (Book) obj;
      if(title.equals(b.getTitle()) && author.equals(b.getAuthor())){
         return true;         
      }     
      else{
         return false;
      }
   }
   
   // determine if the title contains the string in the parameter target
   // independent of the case of the letters in target - e.g. "HITCHHIKER" containts "hitch" 
   public boolean titleContains(String target)
   {
      String titleL = title;
      String targetL = target;
      if (titleL.toLowerCase().contains(targetL.toLowerCase())){
         return true;
      }
      else{
         return false;
      }
   }
   
   
   // determine if the author contains the string in the parameter target
   // independent of the case of the letters in target - e.g. "King" contains "king"
   public boolean authorContains(String target)
   {
      String authorL = author;
      String targetL = target;
      if (authorL.toLowerCase().indexOf(targetL.toLowerCase()) != -1){
         return true;
      }
      else{
         return false;
      }
   }
   
   public String toString()
   {
      return "\"" + title + "\" by " + author + " (" + rating + ")";
   }
}