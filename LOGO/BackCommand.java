/**
* Hyun Kim
* BackCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class dealing with the command "back" */
public class BackCommand extends Command{
	private int distance;
	public BackCommand(Parser parser, ArrayList<String> args){
		super(parser, args);
		distance = Integer.parseInt(args.get(0));
	} // ends BackCommand
	/** moves back specific turtle */
	public void run()	{
		for (Turtle turtle : ActiveTurtles())
			turtle.move(distance*-1);
	} // ends run
} // ends BackCommand
