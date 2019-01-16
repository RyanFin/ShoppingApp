package domain;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> products;
	private double balance;
	
	// command + shift + o automatic import

	//constructor
	public ShoppingCart() {
		// instantiate the product shopping cart ArrayList
		products = new ArrayList<Product>();
		// set the cart balance to 0
		balance = 0;
	}
	
	public void addItem(Product p) {
		products.add(p);
		balance += p.getPrice(); // increment the value of the balance 
	}
	
	public void removeItem(Product p) {
		products.remove(p);
		balance -= p.getPrice(); // decrement the value of the balance
	}
	
	public boolean contains(Product p) {
		return products.contains(p);
	}
	
	// get item count
	public int getItemCount() {
		return products.size();
	}
	
	// Getters and Setters
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
