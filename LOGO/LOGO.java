/** 
* Hyun Kim
* Main LOGO
* Version 1.0
*/

import javax.swing.*;

/** Main method used to execute the file */
public class LOGO {
	public static void main(String args[]){
		/*Opens LOGO, packs it, and sets the frame as visible */
		LogoFrame frame = new LogoFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); 
		frame.setVisible(true);
	} // end main
} // end LOGO
