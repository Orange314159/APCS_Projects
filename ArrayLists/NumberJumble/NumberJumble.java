import java.util.*;
import java.util.Collections;

public class NumberJumble
{

   public static void main(String[] args)
   {
      // 1. Create empty ArrayList of Integer objects and name it list  
      ArrayList<Integer> list = new ArrayList<Integer>();
      printListInfo("1. Empty list", list);
   
      // 2. Fill list with 11 Integer objects with values from 500 to 510 (inclusive)
      for(int i = 500; i < 511; i++){
         list.add(i);
      }
      printListInfo("2. Filled list", list);
   
      // 3. Rotate list Left.  The first element must be placed at the end.
      //    Do NOT use a loop!  
      Integer first = list.get(0);
      list.add(list.size(), first);
      list.remove(0);
      printListInfo("3. Rotated left list ", list);
   
      // 4. Rotate list Right.  The last element must be placed at the front.
      //    Do NOT use a loop! 
      Integer last = list.get(list.size()-1);
      list.add(0, last);
      list.remove(11); 
      printListInfo("4. Rotated right list", list);
   
      // 5. Reverse the elements in list.  
      Collections.reverse(list);
      printListInfo("5. Reversed list", list);
     
      // 6. "Double" each element in the list by inserting a second
      //    Integer object immediately after the original Integer object.
      //    Use a loop!
      for(int i = list.size()-1; i>-1; i--){
         list.add(i, list.get(i));            
      }
      printListInfo("6. Doubled up list", list);
 
      // 7. Replace each of element of the list with a new Integer object
      //    whose value is one-third the original value.
      //    Use a loop!  
      for(int i = 0; i < list.size(); i++){
         list.set(i, list.get(i)/3);
      }
      printListInfo("7. Divided by 3 list", list);
   
      // 8. Remove all consecutive duplicate elements.  Use a loop!
      for(int i = 1; i < list.size(); i++){
         if(list.get(i).equals(list.get(i-1))){
            list.remove(i);
            i--;
         }   
      }  
      printListInfo("8. No consecutive duplicates list", list); 
   }

   private static void printListInfo(String heading, ArrayList<Integer> list)
   {
      System.out.println(heading);
      System.out.println("Size: " + list.size());
      System.out.println("List: " + list.toString());
      System.out.println();
   }
}
