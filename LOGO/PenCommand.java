/**
* Hyun Kim
* PenCommand
* Version 1.0
*/

import java.util.ArrayList;

/** child class used for command "Pen" and also "Color"*/
public class PenCommand extends Command{
	public PenCommand(Parser parser, ArrayList<String> args){
		super(parser,args);
	} // ends PenCommand
	public void run(){
		if(args.contains("up")||args.contains("UP")){
			Turtle.setPenbool(false);
		} // ends if
		else if(args.contains("down")||args.contains("DOWN")){
			Turtle.setPenbool(true);
		} 
		else if(args.contains("1")){
			Turtle.setDotbool(1);
		}
		else if(args.contains("2")){
			Turtle.setDotbool(2);
		}
		else if(args.contains("0")){
			Turtle.setDotbool(0);
		}
		else if(args.contains("3")){
			Turtle.setDotbool(3);
		}
		else if(args.contains("4")){
			Turtle.setDotbool(4);
		}
		else if(args.contains("5")){
			Turtle.setDotbool(5);
		}
		else if(args.contains("6")){
			Turtle.setDotbool(6);
		}
		else if(args.contains("7")){
			Turtle.setDotbool(7);
		}
		else if(args.contains("8")){
			Turtle.setDotbool(8);
		}
		else if(args.contains("9")){
			Turtle.setDotbool(9);
		}
	} // ends run
} // ends PenCommand