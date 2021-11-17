/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

/**
 *
 * @author viveksharma
 */
public class DishTemplate {
    private String dishName;
    private String dishSummary;
    private double dishPrice;
    private String dishCuisine;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishSummary() {
        return dishSummary;
    }

    public void setDishSummary(String dishSummary) {
        this.dishSummary = dishSummary;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishCuisine() {
        return dishCuisine;
    }

    public void setDishCuisine(String dishCuisine) {
        this.dishCuisine = dishCuisine;
    }

    public DishTemplate(String dishName, String dishSummary, double dishPrice, String dishCuisine) {
        this.dishName = dishName;
        this.dishSummary = dishSummary;
        this.dishPrice = dishPrice;
        this.dishCuisine = dishCuisine;
    }

    @Override
    public String toString() {
        return "Dish{" + "dishName=" + dishName + ", dishSummary=" + dishSummary + ", dishPrice=" + dishPrice + ", dishCuisine=" + dishCuisine + '}';
    }
}
