package com.shopping.cart;

import java.util.ArrayList;
import java.util.HashMap;

import com.shopping.dao.CartItem;
import com.shopping.dao.Category;
import com.shopping.dao.Item;
import com.shopping.dao.Products;

public class Basket {

	HashMap<String, Category> productList = new HashMap<String, Category>();
	ArrayList<CartItem> basketList = new ArrayList<CartItem>();

	int basketCostLimit = 50;
	int basketTotalRating = 0;

	public static void main(String[] args) {
		System.out.println("Started shopping cart..");
		Basket basket = new Basket();
		basket.displayShoppingCatalog();
		basket.addItemToBasket();
		basket.displayBasket();
	}

	public Basket() {
		Products productCatalog = new Products();
		System.out.println("Loading products..");
		this.productList = productCatalog.loadProducts();
	}

	/* Display Shopping Catlaog */
	public void displayShoppingCatalog() {
		for (int i = 1; i <= 20; i++) {
			Category categoryObj = (Category) productList.get(String.valueOf(i));
			System.out.println("Shopping Product Catalogs:" + categoryObj.toString());
		}
	}

	/* Adding items to Basket */
	public void addItemToBasket() {
		System.out.println("\nPicking started...");
		int pickedCostLimit = 0;
		for (int i = 1; i <= 20; i++) {
			Category pickedCategory = (Category) productList.get(String.valueOf(i));
//			System.out.println("Shopping Product Catalogs:" + pickedCategory.toString());
			Item selectedItem = pickedCategory.getItems().first();
			CartItem selectedCartItem = CartItem.createCartItem(pickedCategory, selectedItem);

			if (pickedCostLimit + selectedCartItem.getCost() + selectedCartItem.getShippingCost() < basketCostLimit) {
				basketList.add(selectedCartItem);
				pickedCostLimit = pickedCostLimit + selectedCartItem.getCost() + selectedCartItem.getShippingCost();
				basketTotalRating = basketTotalRating + selectedCartItem.getRating();
			}
		}

		System.out.println("Items picked for the basket....");
//		basketList.stream().forEach(System.out::println);
		for (CartItem itemAddedToBasket : basketList) {
			System.out.println(".." + itemAddedToBasket.toString());
		}
		System.out.println("\nItems total cost....$" + pickedCostLimit);
		System.out.println("Items total rating..." + basketTotalRating);

	}

	public void displayBasket() {
		for (CartItem itemAddedToBasket : basketList) {
			System.out.println(itemAddedToBasket.getCategoryName() + ":" + itemAddedToBasket.getItemName() + ",");
		}
	}

}
