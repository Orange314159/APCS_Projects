/*
 * File: WordleGWindow.java
 * ------------------------
 * This file implements the WordleGWindow class, which manages the
 * graphical display for the Wordle project.
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class implements graphics for the Wordle assignment.
 */

public class WordleGWindow {

   private WordleCanvas canvas;

/** The number of rows in the Wordle grid. */
   public static final int N_ROWS = 6;

/** The number of columns in the Wordle grid. */
   public static final int N_COLS = 5;

/** The color used for correct letters (a light green). */
   public static final Color CORRECT_COLOR = new Color(0x66BB66);

/** The color used for letters that are present (a brownish yellow). */
   public static final Color PRESENT_COLOR = new Color(0xCCBB66);

/** The color used for letters that are missing (a medium gray). */
   public static final Color MISSING_COLOR = new Color(0x999999);
   
/**
* Creates a new WordleGWindow object and displays it on the screen.
*/

   public WordleGWindow() {
      JFrame frame = new JFrame("Wordle");
      frame.setBackground(Color.WHITE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      canvas = new WordleCanvas();
      frame.add(canvas, BorderLayout.CENTER);
      frame.pack();
      frame.setVisible(true);
   }

/**
* Sets the label from the grid square at the specified row and column.
*
* @param row The zero-based row number
* @param col The zero-based column number
* @param letter The new contents of the square as a string
*/

   public void setSquareLetter(int row, int col, String letter) {
      canvas.setSquareLetter(row, col, letter);
   }

/**
* Returns the label from the grid square at the specified row and column.
*
* @param row The zero-based row number
* @param col The zero-based column number
* @return The contents of the square as a string
*/

   public String getSquareLetter(int row, int col) {
      return canvas.getSquareLetter(row, col);
   }

/**
* Sets the background color of the grid square at the specified row and
* column.  Colors are represented as strings in the form "#rrggbb".
*
* @param row The zero-based row number
* @param col The zero-based column number
* @param color The new color of the grid square
*/

   public void setSquareColor(int row, int col, Color color) {
      canvas.setSquareColor(row, col, color);
   }

/**
* Returns the background color for the grid square at the specified
* row and column.
*
* @param row The zero-based row number
* @param col The zero-based column number
* @return The background color of the square
*/

   public Color getSquareColor(int row, int col) {
      return canvas.getSquareColor(row, col);
   }

/**
* Sets the background color of the key with the specified label.
* Colors are represented as strings in the form "#rrggbb".
*
* @param label The label on the key
* @param color The new color of the grid square as a string
*/

   public void setKeyColor(String label, Color color) {
      canvas.setKeyColor(label, color);
   }

/**
* Returns the background color for the key with the specified label.
*
* @param label The label on the key
* @return The background color of the square
*/

   public Color getKeyColor(String label) {
      return canvas.getKeyColor(label);
   }

/**
* Sets the current row number and clears all the squares on that row.
*
* @param row The new row number
*/

   public void setCurrentRow(int row) {
      canvas.setCurrentRow(row);
   }

/**
* Gets the current row number.
*
* @return The row number
*/

   public int getCurrentRow() {
      return canvas.getCurrentRow();
   }

/**
* Displays a message under the board grid.
*
* @param msg The text of the message
*/

   public void showMessage(String msg) {
      canvas.showMessage(msg);
   }

/**
* Adds an event listener to the window, which in this application is
* triggered by hitting the RETURN key or pressing the ENTER button.
*
* @param listener The WordleEventListener waiting for this event
*/

   public void addEnterListener(WordleEventListener listener) {
      canvas.addEnterListener(listener);
   }
}

