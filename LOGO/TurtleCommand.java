/**
* Hyun Kim
* TurtleCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class dealing with the command "turtle" */
public class TurtleCommand extends Command{
	
	private String s;
	public TurtleCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
		s = args.get(0);
	} // ends TurtleCommand
	public void run(){
		if(s.equalsIgnoreCase("all")) return;
			if(s.equals("")){
				parser.setCurrent(new Turtle());
				parser.getTurtles().add(parser.getCurrentTurtle());
			} // ends if 
			else{
				for(Turtle turtle : parser.getTurtles())
					if(turtle.getName().equals(s)) return;
					parser.setCurrent(new Turtle(s));
					parser.getTurtles().add(parser.getCurrentTurtle());
			} // ends else
	} // ends run
} // ends class TurtleCommand
