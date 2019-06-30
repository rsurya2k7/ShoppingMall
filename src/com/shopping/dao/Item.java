package com.shopping.dao;

import java.util.Random;

//public class Item implements Comparable<Item> {

public class Item {

	private int id;

	private String itemName;

	private int cost;

	private int shippingCost;

	private int rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		this.itemName = "Item" + id;
	}

	public String getItemName() {
		return itemName;
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

	private Item(int cost, int shippingCost, int rating) {
		super();
		this.cost = cost;
		this.shippingCost = shippingCost;
		this.rating = rating;
	}

	private Item(int id, int cost, int shippingCost, int rating) {
		super();
		setId(id);
		this.cost = cost;
		this.shippingCost = shippingCost;
		this.rating = rating;
	}

	public static Item createItem() {
		return new Item(getRandomNumber(1, 21), getRandomNumber(2, 6), getRandomNumber(1, 6));
	}

	public static Item createItem(int id) {
		return new Item(id, getRandomNumber(1, 21), getRandomNumber(2, 6), getRandomNumber(1, 6));
	}

	private static int getRandomNumber(int start, int bound) {
		Random random = new Random();
		// random.
		return random.ints(start, bound).findFirst().getAsInt();
	}

//	public static void main(String [] args) {
	// System.out.println("Item.main() " + createItem());
//	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", cost=" + cost + ", shippingCost=" + shippingCost
				+ ", rating=" + rating + "]";
	}

//	public int compare(Object arg0, Object arg1) {
//		Item item1 = (Item)arg0;
//		Item item2 = (Item)arg1;
//		
//		return compare(item1.cost, item2.cost);
//		// TODO Auto-generated method stub
//	}

	// only cost (lowest) sorting
//	@Override
//	public int compareTo(Item o) {
//		//sorting for cost
//		if(this.cost == o.cost) 			
//			return 0;
//	    else if (this.cost > o.cost)
//	        return 1;
//	    else 
//	        return -1;
//	}

	// only cost (lowest) addition to shipping cost (lowest)
//	@Override
//	public int compareTo(Item o) {
//		//sorting for cost
//		if(this.cost == o.cost) {
//			//sorting for shipping cost
//			if(this.shippingCost == o.shippingCost)
//				return 0;
//			else if(this.getShippingCost() > o.shippingCost)
//				return 1;
//			else
//				return -1;
//		}
//	    else if (this.cost > o.cost)
//	        return 1;
//	    else 
//	        return -1;
//	}

	// only cost + shipping cost (lowest)
//	@Override
//	public int compareTo(Item o) {
//		//sorting for cost
//		if(this.getCost() + this.getShippingCost() == o.getCost() +o.getShippingCost()) 
//			return 0;
//	    else if (this.getCost() + this.getShippingCost() > o.getCost() + o.getShippingCost())
//	        return 1;
//	    else 
//	        return -1;
//	}

	// only cost + shipping cost (lowest) + Rating (highest)
//	@Override
//	public int compareTo(Item o) {
//		//sorting for cost
//		if(this.getCost() + this.getShippingCost() == o.getCost() + o.getShippingCost()) {
//			if(this.getRating() == o.getRating()) 			
//				return 0;
//		    else if (this.getRating() < o.getRating())
//		        return 1;
//		    else 
//		        return -1;
//		}
//	    else if (this.getCost() + this.getShippingCost() > o.getCost() + o.getShippingCost())
//	        return 1;
//	    else 
//	        return -1;
//	}

}
