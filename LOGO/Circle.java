
import java.awt.*;


public class Circle {
	public int cirx,ciry;
	public int cirbooldot;
	public Circle(int x, int y, int booldot){
		this.cirx = x;
		this.ciry = y;
		this.cirbooldot=booldot;
	}
	public void draw(Graphics g, int x, int y){
		if(cirbooldot==1)
			g.setColor(Color.YELLOW);
		else if(cirbooldot==2)
			g.setColor(Color.gray);
		else if(cirbooldot==0)
			g.setColor(Color.white);
		else if(cirbooldot==3)
			g.setColor(Color.blue);
		else if(cirbooldot==4)
			g.setColor(Color.magenta);
		else if(cirbooldot==5)
			g.setColor(Color.cyan);
		else if(cirbooldot==6)
			g.setColor(Color.green);
		else if(cirbooldot==7)
			g.setColor(Color.red);
		else if(cirbooldot==8)
			g.setColor(Color.orange);
		else if(cirbooldot==9)
			g.setColor(Color.darkGray);
		g.fillOval(x, -y, 10, 10);
	}

}
