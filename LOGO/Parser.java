/**
* Hyun Kim
* Parser
* Version 1.0
*/

import java.util.ArrayList;

/** array list of turtles */
public class Parser {
	private ArrayList<Turtle> turtles;
	private Turtle current;
	
	/** creates arrayList for the turtles */
	public Parser(){
		turtles = new ArrayList<Turtle>();
	} // ends Parser
	public ArrayList<Turtle> getTurtles(){
		return turtles;
	} // ends arraylist turtle
	/** defines command entered */
	public Turtle getCurrentTurtle(){
		return current;
	}
	
	public void setCurrent(Turtle Current){
		this.current = Current; 
	}
	public void parseLine(String s){
		String[] cmd = s.split(" ");
		ArrayList<String> args = new ArrayList<String>();
		for (int i = 1; i<cmd.length; i++)
			args.add(cmd[i]); 
		Command toRun = CommandFactory.getCommandFor(cmd[0], this, args);
		toRun.run();
	}// ends parseLine
} // ends parser
