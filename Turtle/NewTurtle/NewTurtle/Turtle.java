import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  public void drawSquare (int sideLength)
  {
      Picture turtlePic = new Picture("images.jpg");
      
      forward(sideLength);
      drop(turtlePic);
      turnLeft();
      
      forward(sideLength);
      drop(turtlePic);
      turnLeft();
      
      forward(sideLength);
      drop(turtlePic);
      turnLeft();
      
      forward(sideLength);
      drop(turtlePic);
  }
  public void drawTri (int sideLength)
  {
      Picture turtlePic = new Picture("images.jpg");
      forward(sideLength);
      turn(120);
      drop(turtlePic);
      forward(sideLength);
      turn(120);
      drop(turtlePic);
      forward(sideLength);
      turn(120);
      drop(turtlePic);

  }
  
  public void shape (int sides, int length)
  {
      Picture turtlePic = new Picture("images.jpg");
      for (int i = 0; i < sides; i++)
      {
         penDown();
         forward(length);
         drop(turtlePic);
         turn((int) (360.0/sides));
         penUp();
      }
  }



} // this } is the end of class Turtle, put all new methods before this