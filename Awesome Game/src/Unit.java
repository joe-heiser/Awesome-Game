
public class Unit {

	// Start Declare Attributes
	private String Name;
	private int Health;
	private int Coin;
	private int Attackval;
	private int Speed = 1;			// I Put this back as would be good attribute
	// End Declare Attributes

	// Start Declare Positional Data
	private int Ypos = 50;
	private int Xpos = 50;
	private int Yvel;
	private int Xvel;
	// End Declare Positional Data

	// Start Getters and Setters for Positional
	public int getYpos() {
		return Ypos;
	}

	public void setYpos(int ypos) {
		Ypos = ypos;
	}

	public int getXpos() {
		return Xpos;
	}

	public void setXpos(int xpos) {
		Xpos = xpos;
	}

	public int getYvel() {
		return Yvel;
	}

	public void setYvel(int yvel) {
		Yvel = yvel;
	}

	public int getXvel() {
		return Xvel;
	}

	public void setXvel(int xvel) {
		Xvel = xvel;
	}
	// End Getters and Setters for Positional

	// Start Getters for Attributes
	public String getName() {
		return Name;
	}

	public int getHealth() {
		return Health;
	}

	public int getCoin() {
		return Coin;
	}
	
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	public int getSpeed() {
		return Speed;
	}
	// End Getters for Attributes

	// Start Constructors
	public Unit(String name, int health, int coin) {
		super();
		Name = name;
		Health = health;
		Coin = coin;
	}

	public Unit(String name) {
		super();
		Name = name;
		Health = 100;
		Coin = 100;
	}
	// End Constructors

	//Start Actions
	public void Heal(int x) {
		if (this.Health > 0) {
			this.Health += x;
			if (this.Health > 100) {
				this.Health = 100;
			}
		} else {
		}

	}
	public void Attack(Unit u) {
	
	}
	public void AddCoin(int x) {
		this.Coin += x;
	}
	private boolean CanSpend(int x) {
		if(this.Coin - x < 0 ) {
			return false;
		}
		else {
			return true;
		}
	}
	public void SpendCoin(int x) {
		if(CanSpend(x)==true) {
			this.Coin -= x;
		}
		else if (CanSpend(x) == false) {
			
		}
	}
	
	//End Actions		
}

