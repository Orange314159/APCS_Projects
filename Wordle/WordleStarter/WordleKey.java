import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

class WordleKey {

   private Color color;
   private String label;
   private int width;
   private int x;
   private int y;

   /* Public constants */
   public static final int KEY_WIDTH = 40;
   public static final int KEY_HEIGHT = 60;
   public static final int KEY_CORNER = 9;
   public static final int KEY_LABEL_DY = 7;
   public static final int KEY_XSEP = 5;
   public static final int KEY_YSEP = 7;
   public static final Color KEY_COLOR = new Color(0xDDDDDD);
   public static final String KEY_FONT = "Helvetica Neue-18";
   public static final String ENTER_FONT = "Helvetica Neue-14";

   public WordleKey(int x, int y, int width, String label) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.label = label;
      this.color = KEY_COLOR;
   }

   public void paint(Graphics g) {
      Color fg = Color.WHITE;
      int corner = 2 * KEY_CORNER;
      if (color.equals(KEY_COLOR)) {
         fg = Color.BLACK;
      }
      g.setColor(color);
      g.fillRoundRect(x, y, width, KEY_HEIGHT, corner, corner);
      String key = label;
      String font = KEY_FONT;
      if (key.equals("ENTER")) {
         font = ENTER_FONT;
      } else if (key == "DELETE") {
         key = "\u232B";
      }
      g.setFont(Font.decode(font));
      FontMetrics fm = g.getFontMetrics();
      int tx = x + (width - fm.stringWidth(key)) / 2;
      int ty = y + KEY_HEIGHT / 2 + KEY_LABEL_DY;
      g.setColor(fg);
      g.drawString(key, tx, ty);
   }

   public void setLetter(String label) {
      this.label = label;
   }

   public String getLetter() {
      return label;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public Color getColor() {
      return color;
   }

   public boolean contains(int x, int y) {
      return x > this.x && x < this.x + width &&
            y > this.y && y < this.y + KEY_HEIGHT;
   }

}
