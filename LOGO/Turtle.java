/**
* Hyun Kim
* Turtle
* Version 1.0
*/

/** constructors */
import java.util.ArrayList;
public class Turtle {
	private static int count = 0;
	private int x;
	private int y;
	private double direction ;
	private String name;
	private static ArrayList<Line> path=new ArrayList<Line>();
	private static ArrayList<Circle> circles=new ArrayList<Circle>();
	private int x1;
	private int y1;
	private static boolean boolpen=true;
	public static int booldot = 0;
	/**defines x, y, dir, n for turtles */
	public Turtle(int x, int y, double dir, String n){
		this.x = x;
		this.y = y;
		this.direction = Math.toRadians(dir);
		this.name = n;
	} // ends Turtle
	
	/** initial variable values for turtle */	
	public Turtle(String name){
		this(0, 0, 90, name);
	} // ends Turtle
	
	/** initial variable for extra turtles */
	public Turtle(){
		this(0, 0, 90, "Turtle" + count);
	} // ends Turtle
	
	/** setter for direction */
	public void setDirection(double direction){
		this.direction = direction;
	} // ends setDirection
	
	/** getter for direction */
	public double getDirection(){
		return direction;
	} // ends getDirection
	
	/** setter for variable x */
	public void setX(int X){
		x = X;
	} // ends setX
	
	/** getter for variable x */
	public int getX(){
		return x;
	} // ends getX
	
	/** setter for name */
	public void setName(String n){
		name = n;
	} // ends setName
	
	/** getter for name */
	public String getName(){
		return name;
	} // ends getName
	
	/** setter for variable y */
	public void setY(int Y){
		y = Y;
	} // ends setY
	
	/** getter for variable y */
	public int getY(){
		return y;
	} // ends getY
	
	/** getter for path */
	public static ArrayList<Line> getPath(){
		return path;
	} // ends getPath
	public static ArrayList<Circle> getCircles(){
		return circles;
	}
	/** toString method for turtle */
	public String toString(){
		return name + "\n\t(" + x + ", " + y + ")"; 
	} // ends toString
	public static void setPenbool(boolean Penbool){
		boolpen=Penbool;
	} // ends setPenbool
	
	/** getter for boolean value for pen */
	public static boolean getBoolpen(){
		return boolpen;
	} // ends getBoolpen
	public static void setDotbool(int Dotbool){
		booldot=Dotbool;
	}
	public static int getDotbool(){
		return booldot;
	}
	
	/** defines move in terms of distance and direction */
	public void move(int dist){
		x1=x;
		y1=y;
		x += (int)(dist * Math.cos(direction));
		y += (int)(dist * Math.sin(direction));
		path.add(new Line(x1,-y1,x,-y,boolpen));
		circles.add(new Circle(x,y,booldot));
	} // ends move
	
	/** defines rotate in terms of degrees and translates to radians */  
	public void rotate(int deg){
		direction += Math.toRadians(deg);
	} // ends rotate
} // ends turtle

