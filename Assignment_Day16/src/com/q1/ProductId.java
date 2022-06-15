package com.q1;

import java.util.Comparator;

public class ProductId implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getProductId()>p2.getProductId() ? +1: -1;
	}

}
