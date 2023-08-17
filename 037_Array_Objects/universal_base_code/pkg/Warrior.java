package pkg;
import java.util.*;

public class Warrior {
	// 	----------------Do not change this file.----------------
	String name;
	int health;
	int attack;

	public Warrior() {
		name = "Gimli";
		health = (int)(Math.random()*20+1);
		attack = (int)(Math.random()*5+1);
	}
	public Warrior(String n) {
		name = n;
		health = (int)(Math.random()*20+1);
		attack = (int)(Math.random()*5+1);
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

	public void attack(Wizard x){
		int hit = (int)(Math.random()*attack+1);
		System.out.println(name + " strikes for " + hit + " damage on " + x.getName() + " who has " + x.getHealth() + ".");
		x.setHealth(x.getHealth()-hit);
	}


}
