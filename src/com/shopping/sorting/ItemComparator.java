package com.shopping.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.shopping.dao.Item;

public class ItemComparator implements Comparator<Item> {
	private List<Comparator<Item>> listComparators;

	@SafeVarargs
	public ItemComparator(Comparator<Item>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	/* Sort items based on Total cost (item cost + shipping) and Item Rating */
	@Override
	public int compare(Item o1, Item o2) {
		for (Comparator<Item> comparator : listComparators) {
			int result = comparator.compare(o1, o2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}
