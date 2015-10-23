/** 
* Hyun Kim
* CommandFactory
* Version 1.0
*/

import java.util.ArrayList;

/** contains all the commands used in logo */
public class CommandFactory {
	/** orders the child classes to command the turtles around */
	public static Command getCommandFor(String name, Parser parser, ArrayList<String> args){
	if (name.equalsIgnoreCase("forward"))
		return new ForwardCommand(parser, args);
	else if (name.equalsIgnoreCase("turtle"))
		return new TurtleCommand(parser, args);
	else if (name.equalsIgnoreCase("back"))
		return new BackCommand(parser,args);
	else if (name.equalsIgnoreCase("right"))
		return new RightCommand(parser,args);
	else if (name.equalsIgnoreCase("left"))
		return new LeftCommand(parser,args);
	else if (name.equalsIgnoreCase("pen")||name.equalsIgnoreCase("num"))
		return new PenCommand(parser,args);
	else if (name.equalsIgnoreCase("activate"))
		return new ActivateCommand(parser,args);
	else if (name.equalsIgnoreCase("remove"))
		return new RemoveCommand(parser,args);
	else if (name.equalsIgnoreCase("rotate"))
		return new RotateCommand(parser,args);
	else
	return null; // so we don't get compile errors
	} // ends getCommandsFor
} // ends CommandFactor
