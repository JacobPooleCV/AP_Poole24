package pkg;
import java.util.*;

public class Fruit {
    private String fruitName;
    private int quantity;

    public Fruit(String fruitName, int quantity){
        this.fruitName = fruitName;
        this.quantity = quantity;
    }

    public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    public String toString(){
        return "This fruit is a " + fruitName + " and there are " + quantity + " " + fruitName + "s.";
    }
}
