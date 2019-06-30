package com.shopping.dao;

import java.util.TreeSet;

import com.shopping.sorting.ItemComparator;
import com.shopping.sorting.RatingComparator;
import com.shopping.sorting.TotalCostComparator;

public class Category {
	
	int id;
	
	String categoryName = "";
	
//	TreeSet<Item> items = new TreeSet<Item>();
	
//	TreeSet<Item> items = new TreeSet<Item>(new ItemComparator(new CostComparator(), new ShippingCostComparator(), new RatingComparator()));
	
	TreeSet<Item> items = new TreeSet<Item>(new ItemComparator(new TotalCostComparator(), new RatingComparator()));
	
	public static Category createCategory(int id) {
		Category newCateogry = new Category();
		newCateogry.setId(id);
		newCateogry.loadItems();
		return newCateogry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		this.categoryName = "category"+id;
	}

	public String getCategoryName() {
		return categoryName;
	}


	public TreeSet<Item> getItems() {
		return items;
	}

	public void setItems(TreeSet<Item> items) {
		this.items = items;
	}
	
	public void loadItems() {
		for(int i=1; i<=10; i++) {
			Item newItemObj = Item.createItem(i);
			items.add(newItemObj);
//			System.out.println("loading category:" + getCategoryName() + ":loading item:" + newItemObj.toString());
		}
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", items=" + items + "]";
	}
	

}
