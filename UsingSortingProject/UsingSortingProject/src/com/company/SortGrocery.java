package com.company;

import java.util.Comparator;

public class SortGrocery implements Comparator<GroceryItem> {

    public int compare(GroceryItem item, GroceryItem item2) {
        return item.getId() - item2.getId();
    }
}
