package com.company;

import java.lang.reflect.Array;

public class GroceryList {
    GroceryItemOrder[] groceryItems = new GroceryItemOrder[10];

    public GroceryList() {
    }
    public void add(GroceryItemOrder item){
        for (int i =0; i< Array.getLength(groceryItems);i++){
            if (groceryItems[i] == null){
                groceryItems[i] = item;
            }
        }
    }
    public double getTotalCost(){
        double totalCost = 0;
        for (int i=0;i<Array.getLength(groceryItems); i++){
            totalCost = totalCost + groceryItems[i].getCost();
            }
        return totalCost;
    }
}
