package com.example.borgerapp;

import java.util.ArrayList;

public class theDatabase {

    private static final ArrayList<Food> food = new ArrayList<>();
    private static final ArrayList<Food> order = new ArrayList<>();

    public static ArrayList<Food> getOrder() {
        return order;
    }
    public static void addToOrder(Food food,int howMany) {
        for (int i = 1; i<=howMany; i++) {
            order.add(food);
        }
    }

    public static ArrayList<Food> getAllFood(){
        return food;
    }
    public static Food getFoodByName(String name){
        for (int i = 0; i<food.size(); i++){
            Food foodItem = food.get(i);
            if (foodItem.getName().equals(name)){
                return foodItem;
            }
        }
        return food.get(1);
    }

    public static void populateMenu() {
        Food chickenBurger = new Food("Grilled Chicken Caesar", "Grilled chicken, lettuce and tomato with sesame bun", 6.60, R.drawable.chickenburger);
        Food cheeseBurger = new Food("Cheeseburger", "beef patty, cheese, pickles n sauce", 5.50, R.drawable.cheeseburger);
        Food cheeseBurgerDouble = new Food("Double Cheeseburger", "twice the beef patties", 6.50,R.drawable.ccheeseburger);
        Food burger = new Food("Wopper", "yum good", 6.20, R.drawable.wopper);
        Food wrap = new Food("Chicken Wrap", "crispy chicken wrapped up v nicely", 5.80, R.drawable.wrap);
        Food drink = new Food("Frozie", "frozen slushy comes in many flavours", 2.10, R.drawable.frozie);
        Food coke = new Food("Coke", "refreshin", 1.50, R.drawable.coke);
        Food sprite = new Food("Sprite", "lemonade", 1.50, R.drawable.sprite);
        Food pepsi = new Food("Pepsi", "like coke", 1.50, R.drawable.pepsi);
        Food fanta = new Food("Fanta", "orange coke", 1.50, R.drawable.fanta);
        Food spider = new Food("Spoder", "frozen coke or sprite plus soft serve", 1.50, R.drawable.spider);
        Food softServe = new Food("Soft Serve", "ice cream", 1.50, R.drawable.icecream);
        Food chips = new Food("Chips", "yum good potatoes", 1.50, R.drawable.chips);
        Food onion = new Food("Onion Rings", "fried onions", 1.50, R.drawable.onion);
        Food nuggets = new Food("Nuggets", "fried shaped chicken", 1.50, R.drawable.nuggets);
        food.add(cheeseBurgerDouble);
        food.add(cheeseBurger);
        food.add(chickenBurger);
        food.add(burger);
        food.add(wrap);
        food.add(drink);
        food.add(coke);
        food.add(sprite);
        food.add(pepsi);
        food.add(fanta);
        food.add(spider);
        food.add(softServe);
        food.add(chips);
        food.add(onion);
        food.add(nuggets);
    }
}
