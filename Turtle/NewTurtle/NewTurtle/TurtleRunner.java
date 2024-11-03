

public class TurtleRunner
{
	public static void main(String args[])
	{  
		//create a world for your turtles
      World turtleWorld = new World(600, 800);
		
		
		//create your first turtle
      Turtle deb = new Turtle(turtleWorld);
      Turtle tim = new Turtle(50, 50, turtleWorld);
		
		
		//move the turtled forward
      deb.drawSquare(100);
      tim.drawTri(50);
		
      
      // new turtle
      Turtle joe = new Turtle(300, 150, turtleWorld);
      tim = joe;
      joe.drawTri(50);
      
      
      // Picture
      Picture turtlePic = new Picture("images.jpg");
      
      // Dot's adventure
      Turtle dot = new Turtle(130, 150, turtleWorld);
      dot.shape(5,80);
      dot.moveTo(120, 700);
      dot.shape(8,90);
      
	} 
}