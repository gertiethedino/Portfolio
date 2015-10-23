/**
* Hyun Kim
* RotateCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class dealing with the command "rotate" */
public class RotateCommand extends Command{
	private int degrees;
	public RotateCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
		degrees=Integer.parseInt(args.get(0));
	} // ends RotateCommand
	public void run(){
		for (Turtle turtle : ActiveTurtles())
			turtle.rotate(degrees);
	} // ends run
} // ends class RotateCommand