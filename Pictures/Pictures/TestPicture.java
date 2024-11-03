import java.awt.Color;

public class TestPicture {
   public static void main(String[] args) {
   
      // baboon
      // Picture picture = new Picture("baboon.jpg");
//       picture.show();
//       Color colorPixel;
//       int pw = picture.width();
//       int ph = picture.height();
//       System.out.println(pw + " " + ph);
//       Color newColor;
//       for (int i=0; i<pw; i++) {
//          // in height loop
//          for (int j=0; j<ph; j++) {
//             // in width loop
//             colorPixel = picture.get(i,j);
//             newColor = new Color(colorPixel.getGreen(), colorPixel.getBlue(), colorPixel.getRed());  
//             picture.set(i, j, newColor);
//          }
//       } // end of loop
//       picture.show();
      
      // peppers 
      Picture picture = new Picture("peppers.jpg");
      Picture pic2 = new Picture("peppers.jpg");
      picture.show();
      Color colorPixel;
      int pw = picture.width()-1;
      int ph = picture.height();
      System.out.println(pw + " " + ph);
      Color newColor;
      for (int i=0; i<pw; i++) {
         // in height loop
         for (int j=0; j<ph; j++) {
            // in width loop
            colorPixel = picture.get(pw - i, j);
            pic2.set(i, j, colorPixel);
         }
      } // end of loop
      pic2.show();
      
      
   }
}
