/**
* Hyun Kim
* LogoFrame
* Version 1.0
*/

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/** creates LogoFrame and implements interactive features */
public class LogoFrame extends JFrame implements ActionListener, MouseListener, KeyListener {
	JTextField text;
	TurtleDisplayPanel panel;
	Parser parser;
	JButton button = new JButton("Open");
	JFileChooser chooser = new JFileChooser();
	Timer timer = new Timer(250, new TimerListener());
	ArrayList<String> lines = new ArrayList<String>();
	
	/** sets the layout, adds textfield and mouse and keylistener , constructors */
	public LogoFrame(){
		super("LOGO Interpreter");
		
		parser = new Parser();
		panel = new TurtleDisplayPanel(parser.getTurtles());
		text = new JTextField();
		text.addActionListener(this);
		button.addActionListener(new ButtonListener());
		
		panel.addMouseListener(this);
		panel.addKeyListener(this);
		setLayout(new BorderLayout());
		add(button, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(text, BorderLayout.SOUTH);
	} // ends LogoFrame
	
	/* Opens File */
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			int status = chooser.showOpenDialog(getParent());
			
			if (status == JFileChooser.APPROVE_OPTION){
				try {
					Scanner scan = new Scanner(chooser.getSelectedFile());
					while (scan.hasNextLine())
						lines.add(scan.nextLine());
					timer.start();
				} // ends try
				catch (FileNotFoundException exc){
					System.out.println("No File Found");
				} // ends catch
			} // ends if
		} // ends actionPerformed
	} // ends ButtonListener
	
	/* Reads file and parses it */
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String line = lines.remove(0);
			parser.parseLine(line);
			repaint();
			
			if (lines.isEmpty())
				timer.stop();
		} // ends if
	} // ends class TimerListener
	
	/** gets text from the parser */
	public void actionPerformed(ActionEvent arg0) {
		parser.parseLine(text.getText());
		text.setText("");
		repaint();
	} // ends actionPerformed

	/** Uses keyboard inputs to command turtles using KeyListener */
	public void keyPressed(KeyEvent arg0) {
		/** commands for up, down, left, right, l, r, etc */
		switch(arg0.getKeyCode()) {
			case KeyEvent.VK_UP:
				parser.parseLine("forward 10");
				break;
			case KeyEvent.VK_DOWN:
				parser.parseLine("back 10");
				break;
			case KeyEvent.VK_LEFT:
				parser.parseLine("rotate 10");
				break;
			case KeyEvent.VK_RIGHT:
				parser.parseLine("rotate 350");
				break;
			case KeyEvent.VK_R:
				parser.parseLine("right");
				break;
			case KeyEvent.VK_L:
				parser.parseLine("left");
				break;
			case KeyEvent.VK_1:
				parser.parseLine("num 1");
				break;  
			case KeyEvent.VK_2:
				parser.parseLine("num 2");
				break;
			case KeyEvent.VK_3:
				parser.parseLine("num 3");
				break;
			case KeyEvent.VK_4:
				parser.parseLine("num 4");
				break;
			case KeyEvent.VK_5:
				parser.parseLine("num 5");
				break;
			case KeyEvent.VK_6:
				parser.parseLine("num 6");
				break;
			case KeyEvent.VK_7:
				parser.parseLine("num 7");	
				break;
			case KeyEvent.VK_8:
				parser.parseLine("num 8");
				break;
			case KeyEvent.VK_9:
				parser.parseLine("num 9");
				break;
			case KeyEvent.VK_0:
				parser.parseLine("num 0");
				break;
		} // ends switch
		repaint();
	} // ends keyPressed

	/** activates the turtle that is clicked on using mouseListener */
	public void mouseClicked(MouseEvent arg0) {
		panel.requestFocus();
		int x = arg0.getX(), y = arg0.getY(), turtleX, turtleY;
		
		/** creates a box for turtle to be clicked */
		for(Turtle turtle : parser.getTurtles()){
			turtleX = (int)(panel.getWidth()/2) + turtle.getX();
			turtleY = (int)(panel.getHeight()/2) - turtle.getY();
			if(x >= turtleX && x <= turtleX + 15
					&& y >= turtleY && y <= turtleY + 15){
				parser.parseLine("activate " + turtle.getName());
				repaint();
				return;
			} // ends if
		} // ends for
	} // ends mouseClicked

	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}

	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
} // ends LogoFrame
