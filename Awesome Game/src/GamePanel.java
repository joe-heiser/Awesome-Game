import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;

class GamePanel extends JPanel implements ActionListener {
 
	// Creating images for single objects
	protected Image background = new ImageIcon("data\\background.jpg").getImage(); // Background Image
	protected Image still_right = new ImageIcon("data\\testChar.png").getImage(); // Standing still
	
 
	Image obj = still_right; // Temporary Image reference
 
	final private int BKMIN_X = 1000, BKMAX_X = 10000; // Min and Max of
														// background
	public int bk_x = 695; // background x and y coordinates
	public int bk_y = 535;
	
	public Unit u = new Unit("Bill");
 
	static int direction = 0; // 0=still 1=up , 2=right , 3=left , 4=down
 
	static boolean moveableRight = true; // variable for collision detection
	static boolean moveableLeft = true;
	static boolean moveableDown = false;
	boolean jumpright = true;
 
	static boolean jump = false; // For jump
	private Timer time;
 
	int run = 0;
	
	GamePanel() {
		setLayout(null);
		time = new Timer(30, this); // starting a timer and passing the
										// actionlistener for the running animation (not implemented yet)
		time.start(); // starting
	 
		addKeyListener(new KeyAdapter() 
		{
		public void keyPressed(KeyEvent kp) {
	 
		if (kp.getKeyCode() == KeyEvent.VK_D
							& moveableRight == true) {
			u.setXpos(u.getSpeed()*u.getXpos()+100);
 			System.out.println(u.getXpos());
			direction = 2; // right
			}
			if ((kp.getKeyCode() == KeyEvent.VK_A)
							& moveableLeft == true) {
			direction = 3; // left
			u.setXpos(u.getSpeed()*u.getXpos()-100);
			System.out.println(u.getXpos());
			}
			if (kp.getKeyCode() == KeyEvent.VK_SPACE) {
				if (jump == false & u.getYpos() == 615) // if character standing of
															// platform
				{
					jump = true;
					moveableDown = true;
					if (direction == 2)
						jumpright = true;
						if (direction == 3)
							jumpright = false;
						}
					}
				} // end keyPressed
	 
	public void keyReleased(KeyEvent kr) {
		if (direction == 2)
		{
			obj = still_right; // if direction is right
		}
	 
			direction = 0; // set still image
			}
			});// end anonymous class and KeyListener
		}// end constructor
	
	
	public void actionPerformed(ActionEvent e) {
		if (direction == 2)
			right();
		if (direction == 3)
			left();
	}
	
	void right() {
		if (moveableRight == true & bk_x < BKMAX_X - 630) {
			bk_x += 8; // increasing xcoord while moving right
 			run++;	//For unimplemented animation counter shit
 			
		}
	}
	
	
	void left() {
		if (moveableLeft == true & bk_x > BKMIN_X) {
			bk_x -= 8; // decrease xcoord while moving left			
			run++;	//For unimplemented animation counter shit
			
		}
	}
	
	void Jump() // Jump mechanism
	{
 
		if (moveableDown == true) {
			if (jump == true & u.getYpos() >= 450) // For upward motion during jump
			{ 
				u.setYpos(u.getYpos()-1);
				if (u.getYpos() <= 450)
					jump = false;
			}
			if (jump == false & u.getYpos() < 615) // For downward motion during jump
			{
				u.setYpos(u.getYpos()+1);
			}
		}
 
	}// end up
	
	public void paintComponent(Graphics g) {
		 
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
 
		
		setBackground(g2d);
		
 
		// checking jump collision and enemy death
		Jump();
 
		
		g2d.drawImage(obj, u.getXpos(), u.getYpos(), this); // Drawing the character image
 
		repaint();
	}
	
	
	void setBackground(Graphics g2d) {
		g2d.drawImage(background, 700 - bk_x, 0, null); // Drawing background
															// relative to
															// character
	}// end setBackground
	
	
	
	
}
	
	
