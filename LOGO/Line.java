/**
* Hyun Kim
* Line
* Version 1.0
*/

import java.applet.*;
import java.awt.*;
import javax.swing.*;

/** class that represents a line with constructors */
public class Line{
	private int x1, x2, y1, y2;
	private boolean penbool;
	public Line(int x1, int y1, int x2, int y2, boolean penbool){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.penbool=penbool;
	} // ends line
	
	/** draws line if pen boolean state is true */
	public void draw(Graphics g, int x, int y){
		if(penbool==true)
			g.drawLine(x1+x,y1+x,x2+x,y2+y);		
	} // ends draw
} // ends Line
