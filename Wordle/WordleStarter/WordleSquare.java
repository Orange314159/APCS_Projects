import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

class WordleSquare {

   private Color color;
   private String letter;
   private int x;
   private int y;

   /* Public constants */
   public static final Color UNKNOWN_COLOR = Color.WHITE;
   public static final int SQUARE_SIZE = 60;
   public static final int SQUARE_SEP = 5;
   public static final int SQUARE_LABEL_DY = 18;
   public static final String SQUARE_FONT = "Helvetica Neue-bold-44";
   
   public WordleSquare(int x, int y) {
      this.x = x;
      this.y = y;
      this.letter = "";
      this.color = UNKNOWN_COLOR;
   }

   public void paint(Graphics g) {
      Color fg = Color.WHITE;
      if (color.equals(UNKNOWN_COLOR)) {
         fg = Color.BLACK;
      }
      g.setColor(color);
      g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
      g.setColor(Color.BLACK);
      g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
      g.setFont(Font.decode(SQUARE_FONT));
      FontMetrics fm = g.getFontMetrics();
      int tx = x + (SQUARE_SIZE - fm.stringWidth(letter)) / 2;
      int ty = y + SQUARE_SIZE / 2 + SQUARE_LABEL_DY;
      g.setColor(fg);
      g.drawString(letter, tx, ty);
   }

   public void setLetter(String letter) {
      this.letter = letter;
   }

   public String getLetter() {
      return letter;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public Color getColor() {
      return color;
   }
};
