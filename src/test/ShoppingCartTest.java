package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.Product;
import domain.ShoppingCart;

class ShoppingCartTest {
	
	private ShoppingCart _bookCart;
	
//	public public ShoppingCartTest(String name) {
//		// TODO Auto-generated constructor stub
//		super();
//	}

	// Creates test environment (fixture).
	// Called before every testX() method.
	@BeforeEach
	void setUp() throws Exception {
		_bookCart = new ShoppingCart();
		
		Product book = new Product("Harry Potter", 23.95);
		_bookCart.addItem(book);
	}

	// Releases test environment (fixture).
	// Called after every testX() method.
	@AfterEach
	void tearDown() throws Exception {
		_bookCart = null;
	}

	// Tests adding a product to the cart.
	@Test
	void testProductAdd() {
		Product book = new Product("Refactoring", 53.95);
		_bookCart.addItem(book);
		
		//test that book has been added
		assertTrue(_bookCart.contains(book));
		
		double expected = 23.95 + book.getPrice();
		double current = _bookCart.getBalance();
		
		// test that the current balance is equal to the expected value of the cart
		assertEquals(expected, current);
		
		int expectedCount = 2;
		int currentCount = _bookCart.getItemCount();
		
		// test that only two items exist in the cart -> as it should be
		assertEquals(expectedCount, currentCount);
		
	}

}
