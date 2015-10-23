/**
* Hyun Kim
* ForwardCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class used for command "move" */
public class ForwardCommand extends Command{
	private int distance;
	public ForwardCommand(Parser parser, ArrayList<String> args){
		super(parser, args);
		distance = Integer.parseInt(args.get(0));
	} // ends ForwardCommand
	/* moves specific turtle forward */
	public void run(){
		for (Turtle turtle : ActiveTurtles())
			turtle.move(distance);
	}  // ends run
} // ends class ForwardCommand
