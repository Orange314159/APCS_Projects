public class InOrderColors
{ 
   // Do not add any other instance variables
   private String colorOne;
   private String colorTwo;
   private String colorThree;

// Instance methods
   public InOrderColors() {
      colorOne = "red";
      colorTwo = "blue";
      colorThree = "green";
   }

   public InOrderColors(String c1, String c2, String c3) {
      colorOne = c1;
      colorTwo = c2;
      colorThree = c3;
   }

// SET COLORS
   public void setColorOne(String s1) {
      colorOne = s1;
   }
   
   public void setColorTwo(String s1) {
      colorTwo = s1;
   }

   public void setColorThree(String s1) {
      colorThree = s1;
   }

// GET COLORS
   public String getColorOne() {
      return colorOne;
   }

   public String getColorTwo() {
      return colorTwo;
   }

   public String getColorThree() {
      return colorThree;
   }
   
   public int wavelength(String inputColor) {
      switch(inputColor){
         case "red":
            return 740;
         case "orange":
            return 625;
         case "yellow":
            return 590;
         case "green":
            return 565;
         case "blue":
            return 520;
         case "indigo":
            return 500;
         case "violet":
            return 435;
      }
      return 0;
   }

   public boolean areTheyInOrder() {
      if ((wavelength(colorOne) < wavelength(colorTwo)) && (wavelength(colorTwo) < wavelength(colorThree))) {
         return true;
      }
      else {
      return false;
      }
   }
   // add a VOID method called sortThem() to put the instance variables in order
   // colorOne = lowest value, colorTwo = middle value, colorThree = highest value
   public void sortThem() {
      int temp1 = wavelength(colorOne);
      int temp2 = wavelength(colorTwo);
      int temp3 = wavelength(colorThree);
      String temp11 = colorOne;
      String temp22 = colorTwo;
      String temp33 = colorThree;
      if (temp1 > temp2 && temp2 > temp3){
         colorOne = temp33;
      }
      else if (temp1 > temp2) {
         colorOne = temp22;
      }
      if (temp3 < temp1 && temp1 < temp2) {
         colorThree = temp11;
      }
      else if (temp3 < temp1) {
         colorThree = temp11;
      }
      if ((temp1 > temp3 && temp3 > temp2) || (temp2 > temp3 && temp3 > temp1)) {
         colorTwo = temp33;
      }
      if ((temp3 > temp1 && temp1 < temp2) || (temp2 > temp1 && temp1 < temp3)) {
         colorTwo = temp11;
      }
   }
   
   // the toString method returns the string that is printed when you print the object
   public String toString()
   {
      return "" + colorOne + " " + colorTwo + " " + colorThree;   // DO NOT MODIFY
   }
}