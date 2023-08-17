package pkg;
import java.util.*;

public class Wizard {
	// 	----------------Do not change this file.----------------
	String name;
	int health;
	int attack;

	public Wizard() {
		name = "Gandolf";
		health = (int)(Math.random()*10+1);
		attack = (int)(Math.random()*14+1);
	}
	public Wizard(String n) {
		name = n;
		health = (int)(Math.random()*10+1);
		attack = (int)(Math.random()*14+1);
	}

	public boolean isDead(){
		if(health <= 0)
			return true;
		else
			return false;
	}

	public void setHealth(int h){	// Do not use in main
		health = h;
		return;
	}
	public int getHealth(){			// Do not use in main
		return health;
	}
	public String getName(){		// Do not use in main
		return name;
	}

	public void attack(Warrior x){
		int hit = (int)(Math.random()*attack+1);
		System.out.println(name + " strikes for " + hit + " damage on " + x.getName() + " who has " + x.getHealth() + ".");
		x.setHealth(x.getHealth()-hit);
	}


}
