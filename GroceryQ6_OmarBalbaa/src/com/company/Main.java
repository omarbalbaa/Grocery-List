package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        GroceryItemOrder item1 = new GroceryItemOrder("Chocolate",2,11);
        GroceryItemOrder item2 = new GroceryItemOrder("Sugar",1,10);
        GroceryItemOrder item3 = new GroceryItemOrder("Coffee",1,20);
        GroceryItemOrder item4 = new GroceryItemOrder("Egg",3,3);

        GroceryList myList = new GroceryList();
        myList.groceryItems = new GroceryItemOrder[]{item1, item2, item3, item4};
        GroceryItemOrder item5 = new GroceryItemOrder("Face Mask",4,5);
        myList.add(item5);
        System.out.print("My list :\n ");
        for (int i=0; i< Array.getLength(myList.groceryItems);i++)
            System.out.print("\t"+myList.groceryItems[i].name+"\t"+ myList.groceryItems[i].quantity +
                "\t $ "+myList.groceryItems[i].pricePerUnit+"\n");

        System.out.print("Total Cost : \t $ "+myList.getTotalCost());
    }
}
