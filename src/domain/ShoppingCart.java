package domain;

import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Product> products;
	
	// command + shift + o automatic import
	
	//constructor
	public ShoppingCart() {
		// instantiate the product shopping cart ArrayList
		products = new ArrayList<Product>();
	}
	
	public void addItem(Product p) {
		products.add(p);
	}
	
	
	
}
