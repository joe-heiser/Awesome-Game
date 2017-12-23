import java.awt.event.KeyEvent;

public class Controller {
	
	Physics p = new Physics();
	Unit u = new Unit("Nig");
	
	public void keyPressed(KeyEvent kp) {
		if (kp.getKeyCode() == KeyEvent.VK_D /*& P.getMoveRight() == true*/)
		{
			u.setXpos(u.getXpos()+1);
		}
		if (kp.getKeyCode() == KeyEvent.VK_A /*& p.getMoveLeft() == true*/)
		{
			u.setXpos(u.getXpos()-1);
		}
	}
		
}