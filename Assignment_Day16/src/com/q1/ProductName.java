package com.q1;

import java.util.Comparator;

public class ProductName implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getProductName().compareTo(p2.getProductName());
		
	}

}
