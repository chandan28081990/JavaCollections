package com.java.project.collections;

import java.util.Set;
import java.util.TreeSet;

public class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public static void main(String args[]) {
		Product p1=new Product(123,"Iphone2",50000.0d);
		Product p2=new Product(124,"Iphone1",50000.0d);
		Product p3=new Product(125,"Iphone3",70000.0d);
		
		Set<Product> set=new TreeSet<>(new MultipleSortingComparator());
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Product p:set) {
			System.out.println(p);
		}
		
	}

}
