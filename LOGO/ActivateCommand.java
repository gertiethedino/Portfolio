/**
* Hyun Kim
* ActivateCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class used for command "activate" */
public class ActivateCommand extends Command{
	private String s;
	public ActivateCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
	} // ends ActivateCommand
	/** activates all the turtles */
	public void run(){
		for (String turtle : args)
			if(turtle.equalsIgnoreCase("all")){
				parser.setCurrent(null);
				return;
			} // ends if
			
			/** activates single turtle given name */
			for(Turtle turtle : parser.getTurtles())
				if(turtle.getName().equalsIgnoreCase(s)){
					parser.setCurrent(turtle);
					return;
			} // ends if
	} // ends run
} // ends class ActivateCommand
