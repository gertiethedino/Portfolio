/**
* Hyun Kim
* TurtleDisplayPanel
* Version 1.0
*/
 
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/* Creates the panel for turtle to be displayed */
public class TurtleDisplayPanel extends JPanel{
	private ArrayList<Turtle> turtles;
	
	/* size and the background of the panel */
	public TurtleDisplayPanel(ArrayList<Turtle> t){
		setPreferredSize(new Dimension(200, 200));
		setBackground(Color.white);
		turtles = t;
	} // ends TurtleDisplayPanel
	
	/** import turtle image, sets it at the center and draws line */
	public void paint(Graphics g){
		super.paintComponent(g);
		ImageIcon img = new ImageIcon("turtle.PNG");
		for(Turtle turtle : turtles){
			g.drawImage(img.getImage(), (int)(getWidth()/2) + turtle.getX(),
				(int)(getHeight()/2) - turtle.getY(), null);
		} // ends for
		for(Line lins: Turtle.getPath())
			lins.draw(g,(int)(getWidth()/2), (int)(getHeight()/2));
		for (Circle cirs: Turtle.getCircles())
			if ((int)(cirs.cirbooldot)!=0){
			cirs.draw(g, cirs.cirx+(int)this.getWidth()/2, cirs.ciry-(int)this.getHeight()/2);}
		}// ends paint		
} // ends TurtleDisplayPanel