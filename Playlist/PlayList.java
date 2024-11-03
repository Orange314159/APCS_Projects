import java.util.Arrays;

public class PlayList
{
	/** Song[] array list instance variable*/
	private Song[] list;
	
	/** default constructor used to set the instance variables to default values*/
	public PlayList()
	{
		// make a list of length 1
      list = new Song[1];
		
		// Then make sure you add 1 song (using default constructor) to the list at index 0
      list[0] = new Song();
		
	}
	
	/** initialization constructor used to set the instance variables
		* @param x the length of the playlist */
	public PlayList(int x)
	{
		// instantiate a playlist of the provided length
		list = new Song[x];
	}
	
	/** modifier method to set the instance variable list
		* @param x the length of the playlist*/
   public void setList(int x)
	{
		// this should set the length of the playlist
		list = new Song[x];
	}   
      
      
   
	public void realSetList(int x)
	{
		Song[] temp = new Song[x];
      for (int i = 0; i < list.length && i < temp.length; i++){
         temp[i] = list[i];
      }
      list = temp;
	}
	
	/** accessor method to get the entire playlist
		* @return return the entire playslist as a Song[] array*/
	public Song[] getList()
	{
		return list;
	}
	
	/** method to add a song to the playlist
		* @param x the position in the playlist to add the song
		* @param s the song to add to the playlist*/
	public void addSong(int x, Song s)
	{
	    /*  method to add a song to the playlist at the position indicated 
             + the first song in the playlist is at x = 0
             + if there is a null reference at x, add the song at location x
             + if there is a song at x, shift the songs at position x and beyond by 1 position and insert song at location x.
             + if x is larger then the last array position, insert the song at the end of the playlist (i.e. make the array one position larger) */
		/* you need to check to make sure the array is big enough to add the song
		   if it is not big enough you will need to create a large enough array
			   and then transfer the songs to the new array before assigning the new
			   array back to the list array*/
      
      if (x > list.length-1){ // this is for adding to the end
         Song[] temp = new Song[list.length+1];
         temp[temp.length-1] = s;
         for (int i = 0; i < list.length; i++){
            temp[i] = list[i];
         }
         list = temp;
      }
      else if (list[x] == null){ // this is for adding to a place that is already null 
         list[x] = s;
      }
      else if (x == 0){
         Song[] temp = new Song[list.length+1];
         for (int i = 1; i < temp.length; i++){
            temp[i] = list[i-1];
         }
         temp[0] = s;
         list = temp;
      }
      else{ // i need to add a song between songs
         Song[] temp = new Song[list.length+1];
         for (int i = 0; i < list.length; i++){
            if (i >= x){
               temp[i+1] = list[i];
            }
            else{
               temp[i] = list[i];
            }
         }  
         temp[x]=s;
         list = temp; 
      }		      
	}
	
	/** method to get a song from the playlist
		* @param x the position in the playlist to get the song from
		* @return return the song in the position specified*/
	public Song getSong(int x)
	{
		return list[x];
	}
	
	/** method to get the number of songs in the playlist
		* @return return the number of songs in the playlist*/
	public int numSongs()
	{
		return list.length;
	}
	
	/** method to get the total length of the playlist specified in seconds
		* @return return the length of the playlist in seconds*/
	public int totalLength()
	{
		/* before accessing the length of an individual song you should ensure that the 
				song reference is not null*/
      int sum = 0; 
      for (Song s : list){
         if (s != null){
            sum += s.getSongLength();
         }
      }
      return sum;		
	}
	
	/** method to remove any songs from the specified artist
		* @param ar the artist of the songs to remove from the playlist*/
	public void removeArtist(String ar)
	{
		/* to remove the songs with the specified artist you will first need to count the
				occurances of that artist. 
				Then you will need to create a new smaller array
				Then you can copy the songs to the new array excluding the ones from the artist*/
      int counter = 0;
      for (Song s : list){
         if (s != null){
            if (s.getArtist().equals(ar)){
               counter++;
            }
         }
      }
      
      Song[] temp = new Song[list.length - counter];
      int offset = 0;
      for (int i = 0; i < list.length; i++){
         Song s = list[i];
         if (s != null){
            if (s.getArtist().equals(ar)){
               offset--;
            }
            else {
               temp[i+offset] = list[i];
            }
         }
      }    
      list = temp;  
		
	}
	
	/** method to remove any songs longer than the length specified
		* @param length length of songs to removed given in seconds*/
	public void removeLength(int length)
	{
		// same as method above with creating a smaller array
      int counter = 0;
      for (Song s : list){
         if (s != null){
            if (s.getSongLength() > length){
               counter++;
            }
         }
      }
      Song[] temp = new Song[list.length - counter];
      int offset = 0;
      for (int i = 0; i < list.length; i++){
         Song s = list[i];
         if (s != null){
            if (s.getSongLength() > length){
               offset--;
            }
            else {
               temp[i+offset] = list[i];
            }
         }
      }    
      list = temp;
	}
	
	/** method to shuffle the order of the playlist - use the card shuffling example from the arrays presentation to help*/
	public void shuffle()
	{
		// use the card shuffling example from the arrays presentation to help you with this
      for (int i = 0; i < list.length; i++){
         int exchange = i+(int)(Math.random()*(list.length-i));
         Song temp = list[i];
         list[i] = list[exchange];
         list[exchange] = temp;
      }
		
	}
	
	/** equals method to determine if two playlists are equal
	 * The base class for all classes instantiated into objects in Java is "Object"
		* @param obj the object to be compared
		* @return return true or false if the playlists are equal*/
	public boolean equals(Object obj)
	{
		PlayList pl = (PlayList)obj;
		if(!Arrays.equals(list, pl.getList()))
			return false;
		return true;
	}
	
	/** toString() method to get the instance variables
		* @return return a String containing the instance variablees*/
	public String toString()
	{
		return Arrays.toString(list);
	}
}