
public class Unit {
	
//Attributes
private String Name;
private int Health;
private int Coin;


//Positional Data
private int Ypos;
private int Xpos;
private int Yvel;
private int Xvel;
//Getters and Setters for Positional
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
//Getters and Setters for Positional
//Constructors for Attributes
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
//Constructors for Attributes

}
