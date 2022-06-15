package com.q1;
import java.util.*;
public class ProductDriver {

	public static void main(String[] args) {
		Set<Product> product = new TreeSet<>(new ProductPrice());
		Set<Product> product2 = new TreeSet<>(new ProductId());
		Set<Product> product3 = new TreeSet<>(new ProductName());
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=2; i++) {
			System.out.println("Enter product Id:");
			int id = sc.nextInt();
			System.out.println("Enter your product name:");
			String name = sc.next();
			System.out.println("Enter product price ");
			double price = sc.nextDouble();
			
			product.add(new Product(id,name,price));
			product2.add(new Product(id,name,price));
			product3.add(new Product(id,name,price));
		}
		System.out.println("Enter your choice [1,2,3]");
		int choice = sc.nextInt();
		sc.close();
		switch(choice) {
		case 1:
			System.out.println(product);
			break;
		case 2:
			System.out.println(product2);
			break;
		case 3:
			System.out.println(product3);
			break;
		default:
				System.out.println(product3);
				break;
		}

	}

}
