import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GamePanel gp = new GamePanel();
 
	GameFrame() {
		add(gp);
		setSize(630, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
 
	}
 
	public static void main(String[] args) {		//Add to Main class
		GameFrame ex = new GameFrame();
	}
}