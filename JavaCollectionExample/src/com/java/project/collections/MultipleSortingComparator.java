package com.java.project.collections;

import java.util.Comparator;

public class MultipleSortingComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		int priceComparision=Double.compare(o1.price,o2.price);
		
		if(priceComparision == 0) {
			return o1.name.compareTo(o2.name);
		}
		return priceComparision;
	}
}
