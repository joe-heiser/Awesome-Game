
public class Physics extends Controller {
	
	private boolean moveableRight = true;
	private boolean moveableLeft = true;
	private boolean moveableDown = false;
	private boolean moveableUp = false;
	private boolean jump = false;
	
	
	// Start Getters and Setters for Collisions
	public boolean getMoveRight() {
		return moveableRight;
	}

	public void setMoveRight(boolean moveRight) {
		moveableRight = moveRight;
	}
	
	public boolean getMoveLeft() {
		return moveableLeft;
	}

	public void setMoveLeft(boolean moveLeft) {
		moveableLeft = moveLeft;
	}
	
	public boolean getMoveDown() {
		return moveableDown;
	}

	public void setMoveDown(boolean moveDown) {
		moveableDown = moveDown;
	}
	
	public boolean getMoveUp() {
		return moveableUp;
	}

	public void setMoveUp(boolean moveUp) {
		moveableUp = moveUp;
	}
	
	public boolean getJump() {
		return jump;
	}

	public void setJump(boolean j) {
		jump = j;
	}
	// End Getters and Setters for Collisions

	public void start(Unit a)
	{
						
		if(a.getXpos()>0)
		{
			a.setXpos(0);
		}
		
		if(a.getYpos()>0)
		{
			a.setYpos(0);
		}
		
		if(a.getXvel()>0)
		{
			a.setXvel(0);
		}
		
		if(a.getYvel()>0)
		{
			a.setYvel(0);
		}
		
	}
	
	public void moveRight(Unit a)
	{
		//a.setXvel(1*a.getSpeed());		//For when we have actual smooth GUI
		//
		
		//For testing with array in console vvvv
		
		
	
	}
	
}
