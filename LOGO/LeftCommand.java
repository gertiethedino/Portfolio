/** 
* Hyun Kim
* LeftCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class used for command "Left" */
public class LeftCommand extends Command{
	private int degrees = 90;
	public LeftCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
	} // ends leftCommand
	public void run(){
		for (Turtle turtle : ActiveTurtles())
			turtle.rotate(degrees);
	} // ends run
} // ends class LeftCommand
