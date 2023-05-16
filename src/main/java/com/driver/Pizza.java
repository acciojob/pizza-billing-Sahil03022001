package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public static int vegPizzaPrice = 300;
    public static int nonVegPizzaPrice = 400;

    public static int extraCheesePrice = 80;

    public static int extraToppingsForVegPizza = 70;
    public static int extraToppingsForNonVegPizza = 120;

    public static int paperBagPrice = 20;

    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean takeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? vegPizzaPrice : nonVegPizzaPrice;
        bill = "";

        cheeseAdded = false;
        toppingAdded = false;
        takeAwayAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded)
            cheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingAdded)
            toppingAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAwayAdded)
            takeAwayAdded = true;
    }

    public String getBill(){
        // your code goes here
        //Example 1:\
        //Base Price Of The Pizza: 300\
        //Extra Cheese Added: 80\
        //Extra Toppings Added: 70\
        //Paperbag Added: 20\
        //Total Price: 470

        bill += "Base Price Of The Pizza: " + (isVeg ? vegPizzaPrice : nonVegPizzaPrice) + "\n";

        if(cheeseAdded) {
            price += extraCheesePrice;
            bill += "Extra Cheese Added: " + extraCheesePrice +"\n";
        }

        if(toppingAdded) {
            price += isVeg ? extraToppingsForVegPizza : extraToppingsForNonVegPizza;
            bill += "Extra Toppings Added: " + (isVeg ? extraToppingsForVegPizza : extraToppingsForNonVegPizza) + "\n";
        }

        if(takeAwayAdded) {
            price += paperBagPrice;
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
        bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
