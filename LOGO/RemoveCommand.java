/**
* Hyun Kim
* RemoveCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class dealing with the command "remove" */
public class RemoveCommand extends Command{
	private String s;
	public RemoveCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
		s = args.get(0);
	} // ends RemoveCommand
	/** removes specific turtle */
	public void run(){
		if(s.equalsIgnoreCase("all")){
				parser.getTurtles().clear();
				parser.setCurrent(null);
			} // ends if
			/** removes one turtle given name */
			else{
				Turtle t = null;
				for(Turtle turtle : parser.getTurtles()) {
					if(turtle.getName().equalsIgnoreCase(s)){
						t = turtle;	
					} // ends if
				}// for		
				parser.getTurtles().remove(t);
			} // ends else
	} // ends run
} // ends RemoveCommand
