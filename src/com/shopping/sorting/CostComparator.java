package com.shopping.sorting;

import java.util.Comparator;

import com.shopping.dao.Item;

public class CostComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		Item item1 = (Item)o1;
		Item item2 = (Item)o2;
		
		if(item1.getCost() == item2.getCost()) 			
			return 0;
	    else if (item1.getCost() > item2.getCost())
	        return 1;
	    else 
	        return -1;

	}

}
