package com.shopping.dao;

public class CartItem {
	String categoryName;
	String itemName;
	int cost;
	int shippingCost;
	int rating;
	

	public static CartItem createCartItem(Category selectedCategory, Item selectedItem) {
		CartItem newCartItem = new CartItem();
		newCartItem.categoryName = selectedCategory.getCategoryName();
		newCartItem.itemName = selectedItem.getItemName();
		newCartItem.cost = selectedItem.getCost();
		newCartItem.shippingCost = selectedItem.getShippingCost();
		newCartItem.rating = selectedItem.getRating();
		return newCartItem;
	}

	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CartItem [categoryName=" + categoryName + ", itemName=" + itemName + ", cost=" + cost
				+ ", shippingCost=" + shippingCost + ", rating=" + rating + "]";
	}
	
	
}
