/**
* Hyun Kim
* Command
* Version 1.0
*/

import java.util.ArrayList;

/** parent class used for commands used for LOGO */
public abstract class Command {
	protected Parser parser;
	protected ArrayList<String> args;
	public Command(Parser iparser, ArrayList<String> iargs){
		this.parser = iparser;
		this.args =iargs;
	}
	/** abstract method */
	public abstract void run();
	
	/* ArrayList for activated turtles */
	public ArrayList<Turtle> ActiveTurtles(){
		if (parser.getCurrentTurtle() == null)
			return parser.getTurtles();
		else{
			ArrayList<Turtle> active = new ArrayList<Turtle>();
			active.add(parser.getCurrentTurtle());
			return active;
		} // ends else
	} // ends ActiveTurtles
} // ends Command
