package com.gmail.spatsula.Entity;

public class Food {
    private String name;
    private String price;
    private String description;
    private String calories;

    public Food(String name, String price, String description, String calories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCalories() {
        return calories;
    }
}
