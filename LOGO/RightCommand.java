/**
* Hyun Kim
* RightCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class used for command "right" */
public class RightCommand extends Command{
	private int degrees=-90;
	public RightCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
	} // ends RightCommand
	public void run(){
		for (Turtle turtle : ActiveTurtles())
			turtle.rotate(degrees);
	} // ends run
} // ends class RightCommand
