package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
	    SortGrocery sortGrocery = new SortGrocery();

	    GroceryItem bananas = new GroceryItem("Bananas", "fruit");
		GroceryItem soup = new GroceryItem("Soup", "canned");
		GroceryItem apples = new GroceryItem("Apples", "fruit");
		GroceryItem pears = new GroceryItem("Pears", "fruit");
		GroceryItem milk = new GroceryItem("Milk", "dairy");
		GroceryItem bread = new GroceryItem("Bread", "grain");
		GroceryItem cheese = new GroceryItem("Cheese", "dairy");
		GroceryItem melon = new GroceryItem("Melon", "fruit");
		GroceryItem cherries = new GroceryItem("Cherries", "fruit");
		GroceryItem potato = new GroceryItem("Potato", "vegetable");

	    list.add("Bananas");
	    list.add("Soup");
	    list.add("Apples");
	    list.add("Pears");
	    list.add("Milk");
	    list.add("Bread");
	    list.add("Cheese");
	    list.add("Melon");
	    list.add("Cherries");
	    list.add("Potato");

	    groceryList.add(bananas);
		groceryList.add(soup);
		groceryList.add(apples);
		groceryList.add(pears);
		groceryList.add(milk);
		groceryList.add(bread);
		groceryList.add(cheese);
		groceryList.add(melon);
		groceryList.add(cherries);
		groceryList.add(potato);

		//print list
	    System.out.println(list);
	    //shuffle list
		Collections.shuffle(list);
		System.out.println(list);
		//sort the list
		Collections.sort(list);
		System.out.println(list);

		//print list
		System.out.println(groceryList);
		//shuffle list
		Collections.shuffle(groceryList);
		System.out.println(groceryList);
		//sort the list
		Collections.sort(groceryList, sortGrocery);
		System.out.println(groceryList);
    }
}
