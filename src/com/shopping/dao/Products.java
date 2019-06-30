package com.shopping.dao;


import java.util.HashMap;

/*
 * This class is to 
 */
public class Products {
	
	HashMap<String, Category> productList = new HashMap<String, Category>();
	
	public HashMap<String, Category> loadProducts() {
		
		for(int i=1; i<=20; i++) {
			productList.put(String.valueOf(i), Category.createCategory(i));
		}
		
		return productList;
	}
	
	

}
